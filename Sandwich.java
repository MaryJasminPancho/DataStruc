public class Sandwich {
   private String mainIngr;
   private String breadType;
   private double price;
   
   public void setMainIngr(String ingr) {
      mainIngr = ingr;
   }
   public String getMainIngr() {
      return mainIngr;
   }
   
   public void setBreadType(String panType) {
      breadType = panType;
   }
   public String getBreadType() {
      return breadType;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   public double getPrice() {
      return price;
   }
}