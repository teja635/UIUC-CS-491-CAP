import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[]) throws Exception
  {
    Scanner cin=new Scanner(System.in);
    Double sum = 0.0;
    for(int i = 0; i < 12; i++){
        sum += cin.nextDouble();
    }
    System.out.printf("$%.2f", sum/12);
  }
}
