public class StackFixLength {

    char[] array=null;
    int head;
    public StackFixLength(int n) {
       array=new char[n];
       this.head=0;
    }

    boolean isEmpty(){return  head==0;
    }
    boolean isFull(){return head==array.length;}

    public void push(char item){
       if(isFull()){
           throw new IllegalArgumentException("Stack is full");
       }
      array[head++]=item;
    }
     public  char pop(){
        if(isEmpty())  throw new IllegalArgumentException("Stack is empty");
        return array[--head];
     }
    public int size(){
        return head;
    }

}
