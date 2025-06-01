

public class FindCycleLL {
    public static class Node{
        int data;
        Node next;
        //constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public boolean hasCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String []args){
        FindCycleLL ll = new FindCycleLL();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new  Node(3);
        head.next.next.next = head;
        System.out.println(ll.hasCycle());
    }
}
