import java.io.*;
import java.util.*;

public class string_LD{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);

    int cnt = Integer.parseInt(scan.nextLine());
    while(cnt != 0){
      String [] s = new String[cnt];
      for(int i = 0; i < cnt; i++){
        s[i] = scan.nextLine();
      }
      int ld = 0;
      while(check(s) != 1){
        s = stringLD(s);
        ld++;
      }
      System.out.println(ld-1);
      cnt = Integer.parseInt(scan.nextLine());
    }
  }
  public static String[] stringLD(String[] s){
    for(int i = 0; i < s.length; i++){
      s[i] = s[i].substring(1);
    }
    return s;
  }
  public static int check(String [] s){
    for(int i = 0; i < s.length; i++){
      for(int k = 0; k < s.length; k++){
        if(s[i].equals(s[k])  && i != k || s[k].length() == 0)
          return 1;
      }
    }
    return 0;
  }
}
