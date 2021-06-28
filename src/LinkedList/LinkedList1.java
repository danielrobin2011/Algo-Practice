package LinkedList;

public class LinkedList1 {

    public static void main(String args[]){

        LinkedListNode linkedListNode = new LinkedListNode(7);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(7);
        linkedListNode.appendToTail(9);
        linkedListNode.appendToTail(8);

        LinkedList1 linkedList1 = new LinkedList1();
        LinkedListNode head = linkedList1.removeDuplicates(linkedListNode);
        System.out.println(head.toString());
    }

    public LinkedListNode removeDuplicates(LinkedListNode head){

        // null check
        if(head == null || head.next == null)
            return head;

        LinkedListNode runnerNode = head;
        while(runnerNode != null){
            LinkedListNode currentNode = runnerNode.next;
            while (currentNode != null){
                if(runnerNode.value.equals(currentNode.value)){
                    // remove the current node
                    if(currentNode.next != null){
                        currentNode.value = currentNode.next.value;
                        currentNode.next = currentNode.next.next;
                    }
                }
                currentNode = currentNode.next;
            }
            runnerNode = runnerNode.next;
        }
        return head;
    }

}
