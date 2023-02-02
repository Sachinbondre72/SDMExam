public class linkedlist{

    public Node head =null;
    class Node{
        int data;
        Node next;

        public Node(){
            data=0;
            this.next=null;

        }
        public Node(int d){
            data=d;
            this.next=null;

        }

        public void addNode(int data){
            Node n = new Node(data);
            Node temp = new Node();
            temp=head;
            if(head==null)
            {
                head=n;
            }else{

            }
        }
    }



    public static void main(String[] args){
        System.out.println("Hello");

        
    }
}