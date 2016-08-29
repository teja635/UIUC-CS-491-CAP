import java.io.*;
import java.util.*;

public class fib{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    double min = scan.nextDouble();
    double max = scan.nextDouble();
    int cnt = 0;
    double f1 = 1;
    double f2 = 2;
    double fn = 0;
    while(f1-1 <= max){
      fn = f1 + f2;
      System.out.println("F! ->" + f1);
      if(fn <= max && fn >= min){
        cnt++;
        System.out.println(fn);
      }
      f1 = f2 + 0;
      f2 = fn + 0;
    }
    System.out.println("FIBS-> " + cnt);
  }
}
