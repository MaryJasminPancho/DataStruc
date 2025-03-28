public class StackMain {
   public static void main(String[] args) {
   
      System.out.println("Initialize a stack:");
      StackApp stack = new StackApp(5);
      System.out.println("Is the stack empty? " + stack.isEmpty());
      System.out.println("\nInput some elements on the stack:");
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
      stack.push(5);
      stack.display();
      System.out.println("\nTop element of the stack: " + stack.peek());
      System.out.println("\nRemove two element from the stack:");
      stack.pop();
      stack.pop();
      stack.display();
      System.out.println("\nTop element of the stack after popping: " + stack.peek());
      System.out.println("\nIs the stack empty? " + stack.isEmpty());
      
      stack.display();      
   }
}