public class StackApp {
   private int[] arr;
   private int top;

   public StackApp(int size) {
      arr = new int[size];
      top = -1;
   }

   public void push(int num) {
      if (top == arr.length - 1) {
         System.out.println("Stack is full");
      } 
      else {
         top++;
         arr[top] = num;
      }
   }

   public int pop() {
      if (top == -1) {
         System.out.println("Stack Underflow");
         return -1;
      } 
      else {
         int poppedElement = arr[top];
         arr[top] = -999;
         top--;
         return poppedElement;
      }
   }

   public int peek() {
      if (top == -1) {
         System.out.println("Stack is empty");
         return -1;
      } 
      else {
         return arr[top];
      }
  }

   public boolean isEmpty() {
      return top == -1;
   }

   public void display() {
      if (top == -1) {
         System.out.println("Stack is empty");
      } 
      else {
         System.out.print("Stack elements: ");
         for (int i = top; i >= 0; i--) {
            if(arr[i] != -999){
               System.out.print(arr[i] + " ");
            }
         }
         
         /*for (int i = 0; i < arr.length; i++) {
            // Check if the current index has a -999 value and display it
            if (arr[i] == -999) {
                System.out.print("[-999] ");
            }
         }*/       
           
         System.out.println();  
      }
   }
}




