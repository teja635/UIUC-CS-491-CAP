import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class fib{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    BigInteger min = new BigInteger(scan.nextLine());
    BigInteger max = new BigInteger(scan.nextLine());
    int cnt = 0;
    BigInteger f1 = new BigInteger("1");
    BigInteger f2 = new BigInteger("2");
    BigInteger fn = new BigInteger("0");
    while(f1.compareTo(max) <= 0){
      fn = f1.add(f2);
      if(fn.compareTo(max) <= 0 && fn.compareTo(min) >= 0){
        cnt++;
        System.out.println(fn.toString());
      }
      f1 = f2.clone();
      f2 = fn.clone();
    }
    System.out.println("FIBS-> " + cnt);
  }
}
