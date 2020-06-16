import java.util.*;

public class LinkedStackITD {
  public static void main(String[] args) {
    LinkedStack stack = new LinkedStack();
    int num;
    do {
      Scanner in = new Scanner(System.in);
      System.out.println("1-Push 2-Pop 3-Top 4-Size 5-Clear 6-Display 0-Stop");
      System.out.print("Enter your choice: ");
      num = in.nextInt();
      if (num == 1) {
        System.out.print("Enter your data: ");
        in = new Scanner(System.in);
        stack.push(in.nextLine());
        System.out.println("Pushed to the stack!");
        System.out.println();
      } else if (num == 2) {
        stack.pop();
        System.out.println("Popped from the stack!");
        System.out.println();
      } else if (num == 3) {
        System.out.println(stack.top());
        System.out.println();
      } else if (num == 4) {
        System.out.println("Size: " + stack.size());
        System.out.println();
      } else if (num == 5) {
        stack.clear();
        System.out.println("Cleared!");
        System.out.println();
      } else if (num == 6) {
        System.out.println(stack.toString());
      } else if (num == 0) {
        System.out.println("Bye");
      } else {
        System.out.println("Please enter a number between 0 and 6");
      }
    } while (num != 0);
  }
}
