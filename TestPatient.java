//import java.util.Scanner;

public class TestPatient {
   public static void main(String[] args) {
     // Scanner sc = new Scanner(System.in);
      
      Patient defaultPatient = new Patient();

     /* System.out.print("Enter ID number: ");
      int id = sc*/
      Patient customPatient = new Patient(12345, 30, "A", "-");

      System.out.println("Default Patient Info:");
      System.out.println("ID: " + defaultPatient.getIdNumber() + ", Age: " + defaultPatient.getAge());
      System.out.println("Blood Type: " + defaultPatient.getBloodData().getBlood() + ", Rh Factor: " + defaultPatient.getBloodData().getRhFac());

      System.out.println("\nCustom Patient Info:");
      System.out.println("ID: " + customPatient.getIdNumber() + ", Age: " + customPatient.getAge());
      System.out.println("Blood Type: " + customPatient.getBloodData().getBlood() + ", Rh Factor: " + customPatient.getBloodData().getRhFac());
   }
}