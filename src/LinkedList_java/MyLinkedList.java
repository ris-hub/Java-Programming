/*

package LinkedList_java;

public class MyLinkedList {

    Node <E> head;

    public void add(E data)
    {
        Node <E> toAdd = new Node<E>(data);

        if(isEmpty())
        {
            head= toAdd;
            return;
        }
            while (temp.next = head)
            {
                temp=temp.next;
            }
            temp.next = toAdd;
    }
    public void  print()
    {
        Node<E> temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
   public  boolean isEmpty()
    {
        return head==null;
    }
    public E removeLast() throws Exception
    {
        Node<E> temp= head;

        if(temp == null)
        {
            throw new Exception("Cannot remove last element from empty stack!! ");
        }
        if(temp.next == null)
        {
            Node <E> toRemove = head;
            head = null;
            return toRemove.data;
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        Node <E> toRemove = temp.next;
        temp.next =null;
        return toRemove.data;
    }
    public E getLast() throws Exception
    {
        Node<E> temp= head;

        if(temp == null)
        {
            throw new Exception("Cannot peek last element from empty stack!! ");
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    static class Node<E>
    {
        E data;
        Node<E> next;

        public Node(E data)
        {
            this.data=data;
            next=null;
        }
    }
}

*/
