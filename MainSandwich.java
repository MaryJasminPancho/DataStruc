public class MainSandwich {
   public static void main(String[] arg) {
   
      Sandwich a = new Sandwich();
      
      a.setMainIngr("Tuna");
      a.setBreadType("Wheat");
      a.setPrice(4.99);
            
      System.out.println("Main Ingredient: " + a.getMainIngr()); 
      System.out.println("Bread Type: " + a.getBreadType());
      System.out.println("Price: $" + a.getPrice());
   }
}