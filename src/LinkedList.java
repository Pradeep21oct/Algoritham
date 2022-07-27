public class LinkedList {
    Node head = null;

    public static void main(String[] args) {
        LinkedList listObject=new LinkedList();
        listObject.add(3);
        listObject.add(5);
        listObject.add(13);
        listObject.add(35);


        listObject.print();
    }

    public void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next=temp;
        temp.next=null;

    }

    public  void print(){
        Node temp=head;
        while (temp.next!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}