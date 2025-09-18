public class Linkedlist {
    Node head, current;
    Linkedlist() {
        head = null;
        current = null;
    }

    public void addbegin(int data) {
        current = head;
        head = new Node(data);
        head.next = current;
    }

    public void addend(int data) {
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void addindex(int i, int data) {
        current = head;
        Node temp;
        if (i < 1) {
            System.err.println("Invalid index.");
            return;
        }
        if (i == 1) {
            addbegin(data);
            return;
        } else {
            if (new Linkedlist().length(head) >= i) {
                int j = 1;
                while (j < (i - 1) && current.next != null) {
                    current = current.next;
                    j += 1;

                }
                temp = current.next;
                current.next = new Node(data);
                current = current.next;
                current.next = temp;
            }
            else {
                System.err.println("Invalid: index out of bounds.");
            }
        }
    }
    public void delete(int i){
        current = head;
        for(int j = 1; j < (i-1); j++){
            current = current.next;
        }
        current.next = current.next.next;
    }

     public void print() {
         current = head;
         while (current != null) {
             System.out.println(current.data);
             current = current.next;
         }
     }

     public int length(Node point) {
         current = point;
         int length = 0;
         while (current != null) {
             length++;
             current = current.next;
         }
        return length;
     }
}
