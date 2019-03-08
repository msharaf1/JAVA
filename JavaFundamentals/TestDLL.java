public class TestDLL{
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node node1 = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);

        dll.addNode(node1);
        dll.addNode(node2);
        dll.addNode(node3);
        dll.addNode(node4);
        
        dll.printNodes();

    }
}