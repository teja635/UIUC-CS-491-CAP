import java.io.*;
import java.util.*;

public class ugly_numbers{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    int num = 5;
    int [] ugly = new int[1500];
    ugly[0] = 1;
    for(int i = 1; i < 1500; i++){
      System.out.println(i);
      int temp = ugly[i-1];
      boolean is_ugly = false;
      while(!is_ugly){
        temp++;
        if(factor(temp)){
          ugly[i] = temp;
          is_ugly = true;
        }
      }
    }
    System.out.println(Arrays.toString(ugly));
  }
  public static boolean factor(int f){
    while(f != 1){
      if(f % 5 == 0)
        f /= 5;
      else if(f % 3 == 0)
        f /= 3;
      else if(f % 2 == 0)
        f /= 2;
      else
        return false;
    }
    return true;
  }
}
