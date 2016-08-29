import java.io.*;
import java.util.*;

public class box_of_bricks{
  public static void main(String args[]) throws Exception{
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> set = new ArrayList<Integer>();
    while(1 == 1){
      int stacks = scan.nextInt();
      if(stacks != 0){
        int [] stack = new int[stacks];
        int total_blocks = 0;
        for(int i = 0; i < stacks; i++){
          stack[i] = scan.nextInt();
          total_blocks += stack[i];
        }
        int moves = 0;
        int num_row = total_blocks/stacks;
        for(int i = 0; i < stack.length; i++){
          if(stack[i] > num_row)
            moves += Math.abs(stack[i] - num_row);
        }
        set.add(moves);
      }
      else
        break;
    }
    for(int i = 0; i < set.size(); i++){
      System.out.println("Set #" + (i+1));
      System.out.println("The minimum number of moves is " + set.get(i) + ".");
      System.out.println();
    }
  }
}
