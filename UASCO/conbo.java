/*
ID: teja6351
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;

public class conbo{
  private static ArrayList<Integer[]> combos;

  public static void main(String [] args) throws Exception{
    Scanner scan = new Scanner(new File("combo.in"));
    PrintWriter pw = new PrintWriter(new File("combo.out"));

    int n = scan.nextInt();

    Integer [] john = new Integer[3];
    Integer [] master = new Integer[3];
    combos = new ArrayList<Integer[]>();
    combos.add(john);
    combos.add(master);

    for(int i = 0; i < john.length; i++)
      john[i] = scan.nextInt();
    for(int i = 0; i < master.length; i++)
      master[i] = scan.nextInt();
    int [] k = {1, 3, 3};
    for(int k1 = n > 2?john[0]-2:john[0]-(n-1); k1 <= n > 2?john[0]+2:john[0]+(n-1); k1++){
      for(int k2 = n > 2?john[1]-2:john[1]-(n-1); k2 <= n > 2?john[1]+2:john[1]+(n-1); k2++){
        for(int k3 = n > 2?john[2]-2:john[2]-(n-1); k3 <= n > 2?john[3]+2:john[2]+(n-1); k3++){
          Integer [] temp = {k1 < 1 ? k1+n:k1, k2 < 1 ? k2+n:k2, k3 < 1 ? k3+n:k3};
          System.out.println(Arrays.toString(temp));
          if(!contains(temp))
            combos.add(temp);
        }
      }
    }
    for(int k1 = n > 2?master[0]-2:master[0]-(n-1); k1 <= n > 2?master[0]+2:master[0]+(n-1); k1++){
      for(int k2 = n > 2?master[1]-2:master[1]-(n-1); k2 <= n > 2?master[1]+2:master[1]+(n-1); k2++){
        for(int k3 = n > 2?master[2]-2:master[2]-(n-1); k3 <= n > 2?master[3]+2:master[2]+(n-1); k3++){
          Integer [] temp = {k1 < 1 ? k1+n:k1, k2 < 1 ? k2+n:k2, k3 < 1 ? k3+n:k3};
          System.out.println(Arrays.toString(temp));
          if(!contains(temp))
            combos.add(temp);
        }
      }
    }
    System.out.println(combos.size());
  }
  public static boolean contains(Integer [] arr){
    for(int i = 0; i < combos.size(); i++){
      if(combos.get(i)[0] == arr[0] && combos.get(i)[1] == arr[1] && combos.get(i)[2] == arr[2])
        return true;
    }
    return false;
  }
}
