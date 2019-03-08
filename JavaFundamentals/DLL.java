public class DLL {
    public Node head;
    public Node tail;

    public DLL(){
        this.head = null;
        this.tail = null;
    }

    public void addNode(Node newNode){
        if(head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    public void printNodes(){
        Node current = this.head;
        while(current != null){
            System.err.println(current.data);
            current = current.next;
        }
    }
}