import java.util.Scanner;

public class TestLease {
   public static Lease getData(Scanner scan) {
      Lease lease = new Lease();
      
      System.out.print("Enter tenant's name: ");
      lease.setTenantName(scan.nextLine());
      System.out.print("Enter apartment number: ");
      lease.setApartmentNum(scan.nextInt());
      System.out.print("Enter monthly rent: ");
      lease.setMonthlyRent(scan.nextDouble());
      System.out.print("Enter term(Month): ");
      lease.setLeaseTerm(scan.nextInt());
      
      scan.nextLine();
      
      return lease;
   }
   
   public static void showValues(Lease lease){
      lease.showDetails();
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      Lease lease1 = getData(scan);
      System.out.println();
      Lease lease2 = getData(scan);
      System.out.println();
      Lease lease3 = getData(scan);
      System.out.println();
      Lease lease4 = new Lease();
      
      showValues(lease1);
      
      lease1.addPetFee();
      System.out.println();
      
      showValues(lease1);
      showValues(lease2);
      showValues(lease3);
      showValues(lease4);
   }
}