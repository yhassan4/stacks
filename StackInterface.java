public interface StackInterface<T>
{
   public abstract void push(T element) throws StackOverflowException;
   //Adds the element at the top of the stack

   public abstract void pop() throws StackUnderflowException;
   //Removes the element at the top of the stack

   public abstract T top() throws StackUnderflowException;
   //Returns the element at the top of the stack

   public abstract boolean isFull();
   //Returns true if the stack is full, otherwise returns false

   public abstract boolean isEmpty();
   //Returns true if the stack is empty , otherwise returns false
}
