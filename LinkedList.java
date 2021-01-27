 public class LinkedList {
    Node head;
    public void insertAtBegin(int dat){
        Node node = new Node();
        node.data = dat;
       // node.next=null;
        node.next = head;
        head = node;
    }
    public void insert(int inser){
        Node node = new Node();
        node.data = inser;
        node.next=null;
        if(head==null){head=node;}
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAt(int index,int dat){
        Node node = new Node();
        node.data = dat;
        node.next = null;
        Node n =head;
        if(index ==0)
        insertAtBegin((dat));
        for(int i = 0;i<index-1;i++){
            n = n.next; 
        }
        node.next= n.next;
        n.next = node;
    }
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n = head;
            Node n1;
            for(int i=0;i<index-1;i++){
                n= n.next;
            }
            n1= n.next;
            n.next = n1.next;
        }
    }
    public void show(){
        Node node = head;
        
        while(node.next != null){
            System.out.println(node.data);
            node = node.next; 
        }
        System.out.println(node.data);
    }
}