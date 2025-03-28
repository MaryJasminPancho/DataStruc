public  class Purchase {
   private int invoiceNum;
   private double saleAmnt;
   private double salesTax;
   
   public Purchase(int invoiceNum, double saleAmnt, double salesTax){
      this.invoiceNum = invoiceNum;
      this.saleAmnt = saleAmnt;
      this.salesTax = salesTax;
   }
   
   public int getInvoiceNum(){
      return invoiceNum;
   }
   public double getSalesAmnt(){
      return saleAmnt;
   }
   public double getSalesTax(){
      return salesTax;
   }
   
   public void displayPurchase(){
      System.out.println("Invoice Number: " + invoiceNum);
      System.out.println("Sales Amount: " + saleAmnt);
      System.out.printf("Sales Tax: %.2d" + salesTax);
   }
}