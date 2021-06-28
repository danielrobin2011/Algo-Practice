package LinkedList;

import sun.awt.image.ImageWatched;

public class LinkedListNode<T> {

    T value;
    LinkedListNode next = null;

    LinkedListNode(T value){
        this.value = value;
    }

    LinkedListNode(){
        super();
    }

    public void appendToTail(T value){
        LinkedListNode newNode = new LinkedListNode<T>(value);
        LinkedListNode currentNode = this;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public int length(){
        LinkedListNode node = this;
        int length = 0;
        while(node != null){
            length++;
            node = node.next;
        }
        return length;
    }

    public void appendToTail(LinkedListNode newNode){
        LinkedListNode currentNode = this;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public String toString(){
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(value).append(" -> ");
        LinkedListNode currentNode = this;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            strBuilder.append(currentNode.value).append(" -> ");
        }
        strBuilder.append("null");
        return strBuilder.toString();
    }

}
