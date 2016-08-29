import java.io.*;
import java.util.*;

public class nasty_hacks{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    int cnt = scan.nextInt();
    for(int m = 0; m < cnt; m++){

      int r = scan.nextInt(); //Expected revenue without advertising
      int e = scan.nextInt(); //Expected revenue with advertising
      int c = scan.nextInt(); //Cost of advertising

      int cost_with_adv = e - c;

      if(r > cost_with_adv)
        System.out.println("do not advertise");
      else if(r == cost_with_adv)
        System.out.println("does not matter");
      else
        System.out.println("advertise");
    }
  }
}
