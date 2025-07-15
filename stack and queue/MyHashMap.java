class MyHashMap {
    static class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }

    private final int SIZE = 1000;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public Integer get(int key) {
        int index = hash(key);
        Node head = table[index];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Node head = table[index];
        Node prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) table[index] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}
