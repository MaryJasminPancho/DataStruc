class Lease {
   private String tenantName;
   private int apartmentNum;
   private double monthlyRent;
   private int leaseTerm;
   
   public Lease(){
      tenantName = "XXX";
      apartmentNum = 0;
      monthlyRent = 1000;
      leaseTerm = 12;
   }
   
   //getter
   public String getTenantName(){
      return tenantName;
   }
   public int getApartmentNum(){
      return apartmentNum;
   }
   public double getMonthlyRent(){
      return monthlyRent;
   }
   public int getLeaseTerm(){
      return leaseTerm;
   }
   
   //setter
   public void setTenantName(String name){
      tenantName = name;
   }
   public void setApartmentNum(int apartmNum){
      apartmentNum = apartmNum;
   }
   public void setMonthlyRent(double rent){
      monthlyRent = rent;
   }
   public void setLeaseTerm(int term){
      leaseTerm = term;
   }
   
   public void addPetFee(){
      monthlyRent += 10.00;
      explainPetPolicy();
   }
   public static void explainPetPolicy(){
      System.out.println("Additional $10 is included as pet fee.");
   }
   public void showDetails(){
      System.out.println("Tenant Name: " + tenantName);
      System.out.println("Apartment Number: " + apartmentNum);
      System.out.printf("\nMonthly Rent: $%.2f" + monthlyRent);
      System.out.println("Term (Monthly): " + leaseTerm);
      
      System.out.println();
   }
}