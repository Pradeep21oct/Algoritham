public class DoubleLinkedList {
 private DNode h;
    public static void main(String[] args) {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.append(10);
        dl.append(20);
        dl.append(30);
        dl.printList(dl.h);
    }
    static class DNode<T>{

        private T data;
        private DNode next;
        private DNode pre;
        public DNode(T d){
            this.data=d;
            this.next=null;
            this.pre=null;

        }

    }

    public void append(int a){
         DNode newDNode =new DNode(a);
        if(h==null)h= newDNode;
        else {
            DNode temp=h;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newDNode;
            newDNode.pre=temp;

        }
    }

    private void printList(DNode h){
        DNode t=h;
        while (t!=null){
            System.out.print(t.data +" ");
            t=t.next;
        }
        System.out.print(" \n");
    }

    private void printReveserList(DNode h){
        DNode t=h;
        while (t!=null){
            t=t.pre;
        }

        System.out.print(" \n");
    }
}
