package core;

import java.io.Serializable;

import model.User;
 public class SinglyLinkedList implements Serializable {

    private static final long serialVersionUID = 1L;

     static class UserNode implements Serializable {

        private static final long serialVersionUID = 1L;

        private User data;
        private UserNode next;

        public UserNode(User data) {
            this.data = data;
            this.next = null;
        }

        public User getData() {
            return data;
        }

        public UserNode getNext() {
            return next;
        }
    }

    private UserNode head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public void addLast(User u) {

        UserNode newNode = new UserNode(u);

        if (head == null) {
            head = newNode;
        }

        else {

            UserNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }


    public boolean isEmpty() {
        return head == null;
    }

    // Return list size
    public int getSize() {
        return size;
    }

    // Return head node
    public UserNode getHead() {
        return head;
    }
}
