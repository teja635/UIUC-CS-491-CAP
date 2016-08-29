import java.io.*;
import java.util.*;

public class faulty_odometer{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int odo = scan.nextInt();

    while(odo != 0){
      String od = odo + "";
      int mul = 0;
      int las = 0;
      for(int i = 0; i < od.length()-2; i++){
        System.out.println((Integer.parseInt(od.substring(0, i+1))-las + (Integer.parseInt(od.charAt(i+1) + "") > 4 ? 1 : 0) + " " + (odo-(Integer.parseInt(od.substring(0, i+1)) - las + (Integer.parseInt(od.charAt(i+1) + "") > 4 ? 1 : 0))*(Math.pow(10, od.substring(i+1).length()-1))));
        odo -= (Integer.parseInt(od.substring(0, i+1)) - las + (Integer.parseInt(od.charAt(i+1) + "") > 4 ? 1 : 0))*(Math.pow(10, od.substring(i+1).length()-1));
        System.out.println(odo);
        las = Integer.parseInt(od.substring(0, i+1)) - las + (Integer.parseInt(od.charAt(i+1) + "") > 4 ? 1 : 0);
        mul *= Integer.parseInt(od.substring(0, i+1) + (Integer.parseInt(od.charAt(i+1) + "") > 4 ? 1 : 0));
      }
      System.out.println("LAS -> "+ las);
      odo -= las*9;
      System.out.println("FINAL -> "+ odo);
      odo = scan.nextInt();
    }
  }
}
