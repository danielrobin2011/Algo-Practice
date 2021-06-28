package LinkedList;

public class LinkedList6 {

    public static void main(String[] arg){

        LinkedListNode linkedListNode = new LinkedListNode(7);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(7);

        System.out.println(linkedListNode.length());
        System.out.println(linkedListNode);

        LinkedList6 linkedList6 = new LinkedList6();
        boolean palindromeCheck = linkedList6.isPalindrome(linkedListNode);
        System.out.println(palindromeCheck);
    }

    class LinkedListWrapper {
        LinkedListNode node;
        boolean flag;

        LinkedListWrapper(LinkedListNode node, boolean flag){
            this.node = node;
            this.flag = flag;
        }
    }

    public boolean isPalindrome(LinkedListNode node){
        int length = node.length();
        LinkedListWrapper linkedListWrapper = isPalindrome(node, length);
        return linkedListWrapper.flag;
    }

    public LinkedListWrapper isPalindrome(LinkedListNode node, int length){

        // base case
        if(length < 0 || length == 0){
            return new LinkedListWrapper(node, true);
        } else if(length == 1){
            return new LinkedListWrapper(node.next, true);
        }

        // recurse
        LinkedListWrapper linkedListWrapper = isPalindrome(node.next, length - 2);

        // pass failure if child call not palindrome
        if(!linkedListWrapper.flag || linkedListWrapper.node == null){
            return linkedListWrapper;
        }

        // check with corresponding node on the other side
        linkedListWrapper.flag = linkedListWrapper.node.value == node.value;

        // return next node
        linkedListWrapper.node = linkedListWrapper.node.next;

        return linkedListWrapper;
    }

}
