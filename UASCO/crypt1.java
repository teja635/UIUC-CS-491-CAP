/*
ID: teja6351
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;

class crypt1{
  public static void main(String [] args) throws IOException{
    Scanner scan = new Scanner(new File("crypt1.in"));
    PrintWriter pw = new PrintWriter(new File("crypt1.out"));
    int[] nums = new int[scan.nextInt()];
    for(int i = 0; i < nums.length; i++){
      nums[i] = scan.nextInt();
    }
    System.out.println(Arrays.toString(nums));
    int [] num1 = new int[(int)Math.pow(nums.length, 3)];
    int [] num2 = new int[(int)Math.pow(nums.length, 2)];
    int cnt = 0;
    int cnt2 = 0;
    for(int i1 = 0; i1 < nums.length; i1++){
      for(int i2 = 0; i2 < nums.length; i2++){
        for(int i3 = 0; i3 < nums.length; i3++){
          num1[cnt] = Integer.parseInt(nums[i1] + "" + nums[i2] + "" + nums[i3]);
          cnt++;
        }
        num2[cnt2] = Integer.parseInt(nums[i1] + "" + nums[i2]);
        cnt2++;
      }
    }
    int cnt1 = 0;
    for(int t:num1){
      for(int b:num2){
        if((t * Math.max(b/10, b % 10)) / 1000 == 0){
          int tmp = t*b;
          if(tmp / 10000 == 0)
            if(in(tmp,nums) && in(t*(b/10), nums) && in(t*(b%10), nums)){
              cnt1++;
            }
        }
      }
    }
    System.out.println(Arrays.toString(num1));
    System.out.println(Arrays.toString(num2));
    pw.println(cnt1);
    pw.close();
  }
  public static boolean in(int k, int [] m){
    String tmp = k + "";
    ArrayList<Integer> t = new ArrayList<Integer>();
    for(int i:m)
      t.add(i);
    for(int i = 0; i < tmp.length(); i++){
      if(!t.contains(Integer.parseInt(tmp.charAt(i) + "")))
      {
        return false;
      }
    }
    return true;
  }
}
