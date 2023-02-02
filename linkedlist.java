public class linkedlist{

    public Node head =null;
    public Node tail = null;
    class Node{
        int data;
        Node next;

        public Node(){
            this.data=0;
            this.next=null;

        }
        public Node(int d){
            this.data=d;
            this.next=null;
        }
    }

        public void addNode(int data){
            Node n = new Node(data);
            
            
            if(head==null)
            {
                head=n;
                tail=n;
            }
            else{
                n.next=head;
                head=n;
            }
        }

        public void insert_At_End(int data){
            Node n = new Node(data);
            
            
            if(head==null)
            {
                head=n;
                tail=n;
            }
            else{
                tail.next=n;
                tail=n;
            }
        }

        public void Display(){
            Node temp = head;
            if(head==null)
            {
                System.out.println("Linkedlist is Empty");
            }else{
                while(temp!=null)
                {
                    System.out.print(temp.data+"---->");
                    temp=temp.next;
                }
                System.out.println();
            }
        }




    public static void main(String[] args){
        System.out.println("Hello");
        linkedlist ssl = new linkedlist();
        ssl.addNode(10);
        ssl.addNode(20);
        ssl.addNode(30);
        ssl.addNode(40);
        ssl.Display();
        System.out.println("Work by Branch01");
        ssl.addNode(50);
        ssl.addNode(60);
        ssl.Display();
        System.out.println("Work by Branch02");
        ssl.insert_At_End(02);
        System.out.println("After Insertion 2 at End");
        ssl.Display();


    }
}