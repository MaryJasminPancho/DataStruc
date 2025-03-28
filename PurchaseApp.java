import java.util.Scanner;

public class PurchaseApp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Purchase[] purchases = new Purchase[5];
      
      for(int i = 0; i < 5; i++){
         int invoiceNum;
         double saleAmnt;
         
         while(true) {
            System.out.print("\nEnter invoice number: ");
            invoiceNum = sc.nextInt();
            
            if(invoiceNum >= 1000 && invoiceNum <= 8000){
               break;
            }
            else {
               System.out.println("Invalid invoice number.");
            }
         }
         
         while(true) {
            System.out.print("Enter sale amount: ");
            saleAmnt = sc.nextDouble();
            
            if(saleAmnt >= 0) {
               break;
            }
            else {
               System.out.println("\nInvalid sale amount. Please enter a positive number.\n");
            }
         }
         
         double salesTax = saleAmnt * 0.05;
         purchases[i] = new Purchase(invoiceNum, saleAmnt, salesTax);
      }
      
      System.out.println("\nPurchase Details");
      for(Purchase purchase : purchases) {
         purchase.displayPurchase();
         System.out.println();
      }
      
   }
}