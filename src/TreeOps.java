public class TreeOps {

  private   TreeNode root;

  public  void add(int data){
      insert(root, data);
  }

  public void insert(TreeNode root,int data){

      TreeNode p=new TreeNode(data);
      if(this.root==null) {this.root=p;return;}
      if(data<this.root.data){
          insert(this.root.left,data);
      }
      else insert(this.root.right,data);
  }

  public void print(){
printNode(root);


  }
  private void printNode(TreeNode n){
      if(n!=null){
          printNode(n.left);
          System.out.println(n.data);
          printNode(n.right);
      }
  }
}
