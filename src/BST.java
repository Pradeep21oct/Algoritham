public class BST {


   private  Node root=null;


    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
    }


    public  void insert(int data){
        Node n=new Node(data);
        if(root==null){
            root=n;
            root.right=null;
            root.left=null;
            return;
        }
        Node temp=root;
        while (true){
            if(temp.value>data){
                if(temp.left==null){
                    temp.left=n;
                    return;
                }
                temp=temp.left;
            }else {
                if (temp.right==null){
                    temp.right=n;
                    return;
                }
                temp=temp.right;
            }
        }

    }


}
  class Node{
     int  value;
     Node left;
     Node right;




      public Node(int value) {
          this.left = null;
          this.right=null;
          this.value=value;
      }



  }