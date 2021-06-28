package LinkedList;

public class LinkedList7 {

    public static void main(String[] args){

        LinkedListNode linkedListNode = new LinkedListNode(7);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(9);
        linkedListNode.appendToTail(10);
        linkedListNode.appendToTail(11);
        linkedListNode.appendToTail(12);

        LinkedListNode linkedListNode1 = new LinkedListNode(1);
        linkedListNode1.appendToTail(2);
        linkedListNode1.appendToTail(3);
        linkedListNode1.appendToTail(4);
        linkedListNode1.appendToTail(linkedListNode.next.next);

        System.out.println(linkedListNode);
        System.out.println(linkedListNode1);

        LinkedList7 linkedList7 = new LinkedList7();
        LinkedListNode result = linkedList7.findIntersection(linkedListNode1, linkedListNode);
        System.out.println(result.value);
    }

    LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2){

        int l1 = node1.length();
        int l2 = node2.length();

        LinkedListNode lesser = null;
        LinkedListNode greater = null;

        if (l1 < l2) {
            lesser = node1;
            greater = getKthNode(node2, l2 - l1);
        } else if (l2 < l1) {
            lesser = node2;
            greater = getKthNode(node1, l1 - l2);
        }

        while (lesser != null && greater != null){
            if (lesser == greater) {
                return lesser;
            }
            lesser = lesser.next;
            greater = greater.next;
        }
        return null;
    }

    LinkedListNode getKthNode(LinkedListNode node, int k){

        while(k > 0 && node != null){
            node = node.next;
            k--;
        }
        return node;
    }

}
