package code.otherAlgos;

public class LinkedList {

    class Node {
        int data;
        Node next;

       private Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node head;

    private void  add(int new_data){
        Node new_node = new Node(new_data);

        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
    }

    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        /* 2 & 3: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    private void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] a){
        LinkedList linkedList=new LinkedList();
        linkedList.add(34);
        linkedList.add(35);
        linkedList.add(38);
        linkedList.insertAfter(linkedList.head.next,90);
        linkedList.push(89);
        linkedList.printList();
    }
}
