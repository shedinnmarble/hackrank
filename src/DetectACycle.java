import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dewei on 11/2/2016.
 */
public class DetectACycle {
    /*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
*/
    class Node {
        int data;
        Node next;
    }


    boolean hasCycle(Node head) {
        if(head==null || head.next==null){
            return false;
        }
        List<Node> listNode=new ArrayList<Node>();
        while(head.next!=null){
            if(listNode.contains(head)){
                return true;
            }else{
                listNode.add(head);
                head=head.next;
            }

        }
        return false;

    }
}
