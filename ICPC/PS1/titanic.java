import java.io.*;
import java.util.*;

public class titanic{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    String msg_num = scan.nextLine();
    String time_rcvd = scan.nextLine();
    String ship_coord_msg = scan.nextLine();
    String ship_coord_lat = scan.nextLine();
    String ship_coord_lon = scan.nextLine().replace("and ", "");
    String iceberg_coord_msg = scan.nextLine();
    String iceberg_coord_lat = scan.nextLine();
    String iceberg_coord_lon = scan.nextLine().replace("and ", "");
    scan.nextLine();

    double s_lat = deg_conv(ship_coord_lat);
    double s_lon = deg_conv(ship_coord_lon);
    double i_lat = deg_conv(iceberg_coord_lat);
    double i_lon = deg_conv(iceberg_coord_lon);

    double t = dist(s_lat, i_lat, s_lon, i_lon, 6875.0);
    System.out.printf("The distance to the iceberg: %.2f miles.", t);
    if(t < 100.0)
      System.out.println("\nDANGER!");

  }

  public static double deg_conv(String s){
    String [] t = s.split("[\'\"^]");
    double deg_measure = Integer.parseInt(t[0]) + (Integer.parseInt(t[1])*1.0)/60 + (Integer.parseInt(t[2])*1.0)/3600;
    if(t[3].charAt(1) == 'W' || t[3].charAt(1) == 'S'){
      deg_measure *= -1.0;
    }
    return deg_measure;
  }

  public static double dist(double lat1, double lat2, double lon1, double lon2, double r){
    double d = r * Math.toRadians(Math.asin(Math.sqrt(Math.pow(Math.sin((lat2-lat1)/2), 2) + Math.cos(lat1)*Math.cos(lat2)*Math.pow(Math.sin((lon2-lon1)/2), 2))));
    return d;
  }
}
