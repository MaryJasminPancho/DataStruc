import java.util.Scanner;

public class StudentApplication {
      
      Scanner sc = new Scanner(System.in);
      Student[] record = new Student[100];  
      int studentList = 0;
      
      public static void newStudent(){
         if(studentList < record.length){
            System.out.print("Enter id number: ");
            int id = sc.nextInt();
            System.out.print("Enter your first name: ");
            String fName = sc.nextLine();
            System.out.print("Enter last name: ");
            String lName = sc.nextLine();
            System.out.print("Enter course: ");
            String course = sc.nextLine();
            System.out.print("Enter year level: ");
            int yrLevel = sc.nextInt();
            
            record[studentList++] = new Student(id, fName, lName, course, yrLevel); 
            System.out.println("Student added successfully.");         
         }
         else {
            System.out.println("Cannot add more students. Array is full.");
         }
      }
      
      public static void DisplayStudent(){
         if(studentList == 0){
            System.out.println("No students to display.");
         } 
         else {
            System.out.println("All Students");
            for(int i =  0; i < studentList; i++){
               System.out.println(record[i]);
            }   
         }
      }
      
      public static void DisplayStudentReverse(){
         if(studentList ==  0){
            System.out.println("No students to display.");
         }
         else {
            System.out.println("Students in Reverse Order");
            for(int i = studentList - 1; i >= 0; i--){
               System.out.println(record[i]);
            }
         }
      }
      
      public static void main(String[] a){
         
         do {
         
            int choice;
            
            System.out.println("[1] Add New Student");
            System.out.println("[2] Display All Students");
            System.out.println("[3] Display All Students in Reverse");
            System.out.println("[0] Exit/Terminate Program");
            System.out.print("Enter your choice: ");
            choice.nextInt();
            
            switch (choice) {
               case 1: 
                  newStudent();
                  break;
               case 2: 
                  DisplayStudent();
                  break;
               case 3:
                  DisplayStudentReverse();
                  break;
               case 0:
                  Sytem.out.println("Exiting program...");
                  break;
               default:
                  System.out.println("Invalid choice.");
            }
            
         } while (choice != 0);
      }
}