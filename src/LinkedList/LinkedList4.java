package LinkedList;

import sun.awt.image.ImageWatched;

public class LinkedList4 {

    public static void main(String args[]){

        LinkedListNode linkedListNode = new LinkedListNode(10);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(7);
        linkedListNode.appendToTail(7);
        linkedListNode.appendToTail(9);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(1);
        linkedListNode.appendToTail(3);

        LinkedList4 linkedList1 = new LinkedList4();
        LinkedListNode head = linkedList1.partition(linkedListNode, 7);
        System.out.println(head.toString());
    }

    public LinkedListNode partition(LinkedListNode head, int partition){

        LinkedListNode lessPart = new LinkedListNode();
        LinkedListNode greatPart = new LinkedListNode();
        LinkedListNode equalPart = new LinkedListNode();

        LinkedListNode currentNode = head;
        int i = 0;
        int j = 0;
        int k = 0;
        while (currentNode != null) {
            if((int)currentNode.value < partition){
                i++;
                if (i == 1){
                    lessPart = new LinkedListNode(currentNode.value);
                } else {
                    lessPart.appendToTail(currentNode.value);
                }
            } else if ((int)currentNode.value > partition){
                j++;
                if (j == 1){
                    greatPart = new LinkedListNode(currentNode.value);
                } else {
                    greatPart.appendToTail(currentNode.value);
                }
            } else {
                k++;
                if (k == 1){
                    equalPart = new LinkedListNode(currentNode.value);
                } else {
                    equalPart.appendToTail(currentNode.value);
                }
            }
            currentNode = currentNode.next;
        }
        lessPart.appendToTail(equalPart);
        lessPart.appendToTail(greatPart);
        return lessPart;
    }

}
