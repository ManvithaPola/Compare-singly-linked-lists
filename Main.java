import java.util.*;
class Node 
{
    int data;
    Node next;
    Node(int num)
    {
        this.data=num;
        this.next=null;
    }
}
class SinglyLinkedList 
{
    Node head = null;
    Node temp = null;
    public void insertNode(int num) 
    {
        Node newNode = new Node(num);
        if (head == null) 
        {
            head = temp = newNode;
        } 
        else 
        {
            temp.next = newNode;
            temp = newNode;
        }
    }
    public int compare_lists(Node list1,Node list2)
    {
        while (list1 != null && list2 != null) 
        {
            if (list1.data != list2.data) {
                return 0; 
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 == null && list2 == null) 
        {
            return 1; 
        }
        return 0;
    }
    public void display()
    {
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+"\n");
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        System.out.println("Enter nodes for the first list (enter -1 to end): ");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) break;
            list1.insertNode(num);
        }
        System.out.println("Enter nodes for the second list (enter -1 to end): ");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) break;
            list2.insertNode(num);
        }
        System.out.print("First list: ");
        list1.display();
        System.out.print("Second list: ");
        list2.display();
        int result = list1.compare_lists(list1.head, list2.head);
        if (result == 1) 
        {
            System.out.println("1");
        } else 
        {
            System.out.println("0");
        }
    }
}
