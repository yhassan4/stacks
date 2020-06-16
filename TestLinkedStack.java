public class TestLinkedStack
{
    public static void main(String[] args)
    {
        LinkedStack stack = new LinkedStack();

        System.out.println("Empty? " + stack.isEmpty());

        stack.push("Tim");
        stack.push("Nancy");
        stack.push("John");
        stack.push("Sarah");
        System.out.println("Stack size: " + stack.size());

        stack.push("Steve");

        System.out.println(stack.toString());

        System.out.println("Stack size: " + stack.size());

        System.out.println(stack.top() + " is the top element");

        stack.pop();
        stack.pop();
        System.out.println(stack.top() + " is the top element");
        System.out.println("Stack size: " + stack.size());
    }
}
