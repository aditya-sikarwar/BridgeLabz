import org.w3c.dom.Node;

class DoublyLL{
    Node head;
    Node tail;
    class Node{
        Object data;
        Node prev;
        Node next;

        Node(Object data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void traverseForward(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void traverseBackward(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insertAtBeginning(Object data){
        Node n = new Node(data);
        if(head == null){
            head = tail = n;
        }else{
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void insertAt(Object data, int idx){
        Node n = new Node(data);
        if(idx == 1){
            insertAtBeginning(data);
        }
    }

    public void add(Object data){
        Node n = new Node(data);
        if(head == null){
            head = tail = n;
        } else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLL dl1 = new DoublyLL();
        dl1.add(3);
        dl1.add(4);
        dl1.add(5);
        dl1.traverseForward();
//        dl1.traverseBackward();
    }
}