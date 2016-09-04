/*
ID: teja6351
LANG: JAVA
TASK: barn1
*/

import java.io.*;
import java.util.*;

class barn1{
  public static void main(String [] args) throws IOException{
    Scanner scan = new Scanner(new File("barn1.in"));
    PrintWriter pw = new PrintWriter(new File("barn1.out"));

    int m = scan.nextInt(); //max number of boards that can be puchased
    int s = scan.nextInt(); //total number of stalls
    int c = scan.nextInt(); //number of cows

    int [] barn = new int[c];
    int [] differences = new int[c-1];

    for(int i = 0; i < c; i++)
      barn[i] = scan.nextInt();
    Arrays.sort(barn);
    for(int i = 1; i < barn.length; i++){
      differences[i-1] = barn[i] - barn[i-1];
    }
    s = barn[barn.length-1];
    Arrays.sort(differences);
    s -= (barn[0]-1);
    System.out.println(s);
    for(int i = 0; i < m-1; i++){
      if(differences.length -1 - i >= 0)
        s -= differences[differences.length-1-i]-1;
      else
        i++;
      System.out.println(s);
    }
    pw.println(s);
    pw.close();
  }
}
