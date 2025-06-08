class MyLinkedList {

   private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        Node temp = head;
        if (index < 0 || index >= size) return -1;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        Node t = new Node(val);
        if (head == null) {
            tail = t;
            head = t;
        } else {
            t.next = head;
            head = t;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = t;
            tail = t;
        } else {
            tail.next = t;
            tail = t;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node t = new Node(val);
        if (index < 0 || index > size) return;

        if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { // ✅ fixed this condition
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++; // ✅ increment size here
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp;  // update tail if last node is removed
            }
        }
        size--;
    }
}
