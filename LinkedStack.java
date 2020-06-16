public class LinkedStack<T> implements StackInterface<T>
{
    protected LLNode<T> top;

    public LinkedStack()
    {
        this.top = null;
    }

    @Override
    public void push(T element)
    {
        LLNode node = new LLNode(element);
        node.setLink(top);
        top = node;
    }

    @Override
    public void pop()
    {
        if(isEmpty())
        {
            throw new StackUnderflowException("Empty Stack");
        }
        else
        {
            top = top.getLink();
        }
    }

    public T top()
    {
        if(isEmpty())
        {
            throw new StackUnderflowException("Empty Stack");
        }
        else
        {
            return top.getInfo();
        }
    }

    @Override
    public boolean isFull()
    {
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return top == null;
    }

    public int size()
    {
      int size = 0;
      LLNode<T> curr = top;
      while (curr != null) {
        size++;
        curr = curr.getLink();
      }
      return size;

    }

    @Override
    public String toString()
    {
      String list = null;
      LLNode<T> curr = top;
      while (curr != null) {
        if (list == null) {
          list = curr.getInfo() + "\n";
        } else {
          list += curr.getInfo() + "\n";
        }
        curr = curr.getLink();
      }
      return list;



    }

    public void clear(){
      top = null;
    }
}
