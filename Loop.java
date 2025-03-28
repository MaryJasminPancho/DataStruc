//Fibonacci Sequence

import java.util.Scanner;

public class Loop{
   public static void main(String[] a){
      int fnum = 0, snum = 1, n;
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Input terms: ");
      n = sc.nextInt();
      System.out.print("Fibonacci Sequence: ");
      
      for(int i = 0; i <= n; i++){
         System.out.print(fnum + " ");
         
         int nextTerm = fnum + snum;
         fnum = snum;
         snum = nextTerm;
      }
   }
}