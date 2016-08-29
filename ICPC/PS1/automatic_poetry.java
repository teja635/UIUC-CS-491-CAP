import java.util.*;
import java.io.*;

public class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int cnt = Integer.parseInt(scan.nextLine());
    for(int i = 0; i < cnt; i++){
      String l1 = scan.nextLine();
      String l2 = scan.nextLine();
      String s1 = l1.substring(0, l1.indexOf("<"));
      String s2 = l1.substring(l1.indexOf("<") + 1, l1.indexOf(">"));
      l1 = l1.substring(l1.indexOf(">") + 1);
      String s3 = l1.substring(0, l1.indexOf("<"));
      String s4 = l1.substring(l1.indexOf("<") + 1, l1.indexOf(">"));
      String s5 = l1.substring(l1.indexOf(">") + 1);
      //Remove brackets
      System.out.println(s1+s2+s3+s4+s5);
      System.out.println(l2.replace("...", s4+s3+s2+s5));
    }
  }
}
