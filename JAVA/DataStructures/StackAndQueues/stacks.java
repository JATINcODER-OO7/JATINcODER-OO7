package DataStructures.StackAndQueues;

public class stacks {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    static class stack{
        public static Node head;

        public static boolean Empty(){
            return head  == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(Empty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        
        /**
         * @return
         */
        public static int pop(){
            if(Empty()){
                return -1;
            }
            int top = head.data;
            head =head.next;
            return top;
        }

        public static int peek(){
            if(Empty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args ){


        
    }
 

}
