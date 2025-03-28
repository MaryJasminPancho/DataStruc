import java.util.Scanner;

public class MainPhoneDirectory {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      PhoneDirectory[] list = new PhoneDirectory[30];
      
      list[0] = new PhoneDirectory("Alice", "09612733092");
      list[1] = new PhoneDirectory("Becky", "09184359853");
      list[2] = new PhoneDirectory("Cath", "09942726628");
      list[3] = new PhoneDirectory("Daniel", "09436429922");
      list[4] = new PhoneDirectory("Eren", "09203627490");
      list[5] = new PhoneDirectory("Freen", "09688283752");
      list[6] = new PhoneDirectory("George", "09325693074");
      list[7] = new PhoneDirectory("Henry", "0956938180");
      list[8] = new PhoneDirectory("Ivy", "09538236392");
      list[9] = new PhoneDirectory("Jack", "09281946740");
      
      int listCount = 10;
      
      while(true){
         System.out.print("Enter name (or 'quit' to exit): ");
         String name = sc.nextLine();
         
         if(name.equalsIgnoreCase("quit")){
            break;
         }
         
         boolean found = false; 
            for (int i = 0; i < listCount; i++) { 
                if (list[i].getFirstName().equalsIgnoreCase(name)){
                    System.out.println("Phone number: " + list[i].getPhoneNum());
                    System.out.println();
                    found = true;
                    break;
                }
            }
         
         if(!found){
            if(listCount >= list.length){
               System.out.println("Directory is full. Cannot add more entries.");
               break;
            }
            
            System.out.print("Name not found. Enter phone number for " + name + ": ");
            String number = sc.nextLine();
            
            list[listCount] = new PhoneDirectory(name, number);
            listCount++;
            System.out.println(name + " is added to directory.");
            System.out.println();
         }
         
      }
         
   }
}