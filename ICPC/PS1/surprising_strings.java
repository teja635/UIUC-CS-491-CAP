import java.io.*;
import java.util.*;

public class surprising_strings{
  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    while(!str.equals("*")){
      if(str.length() <= 2){
        System.out.println(str + " is surprising.");
      }
      else{
        boolean surp = true;
        for(int p = 0; p < str.length()-1; p++){
          ArrayList<String> s = new ArrayList<String>();
          int ind = 0;
          while(ind + p + 1 < str.length()){
            if(!s.contains(str.charAt(ind) + "" + str.charAt(ind + p + 1)))
              s.add(str.charAt(ind) + "" + str.charAt(ind + p + 1));
            else
              surp = false;
            ind ++;
          }
        }
        if(surp){
          System.out.println(str + " is surprising.");
        }
        else{
          System.out.println(str + " is NOT surprising.");
        }
      }
      str = scan.nextLine();
    }
  }
}
