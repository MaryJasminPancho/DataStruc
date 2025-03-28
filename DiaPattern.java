//Mary Jasmin S. Pancho

public class DiaPattern {
   public static void main(String[] a) {
      int space = 5-1;
   
      for(int i = 1; i <= 5; i++){
         for(int j = 1; j<= space; j++){
            System.out.print(" ");
         }
         space--;
         for(int j = 1; j <= 2 * i - 1; j++){
            System.out.print("*");
         }
         System.out.println("");
         
         /*for(int k = 4 - 2; k >= 0; k--){
            System.out.print(" ");
         }
         space++;
         for(int j = 0; j < 5-k-1; j++){
            System.out.print("");
         }
         for(int s = 0; s <= k; s++){
            System.out.print("*");
         }
         System.out.println("");*/
      }
   }
}