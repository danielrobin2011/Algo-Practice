package LinkedList;

public class LinkedListTest {

    public static void main(String args[]){

        LinkedListNode<String> linkedListNode = new LinkedListNode<>("hello");
        linkedListNode.appendToTail("world");
        linkedListNode.appendToTail("how");
        linkedListNode.appendToTail("are you?");
        System.out.println(linkedListNode.toString());
    }

}
