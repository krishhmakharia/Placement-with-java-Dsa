package LinkedList;

import java.sql.SQLOutput;

public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        // 1. Create Node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }

        //2. Store next
        newNode.next = head;

        //3. Make newNode to head
        head = newNode;
    }

    public void addLast(int data){
        // 1. Create Node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        //2. Store next & Assign new tail
        tail.next = newNode;
        tail = newNode;

    }

    public void printLL(){
        System.out.println("-------Printing LL ---------");
        if(head==null){
            System.out.println("LL is empty!");
        }
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int possision = 0;
        while(possision < idx-1){
            temp=temp.next;
            possision++;
        }
        newNode.next=temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }

        int val=head.data;
        Node temp = head;
        head = head.next;
        temp.next=null;

        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        Node pre = head;
        for (int i=0;i<size-2;i++){
            pre = pre.next;
        }
        int val = pre.next.data;//tail.data
        pre.next = null;
        tail = pre;
        size--;
        return val;
    }
    public static int search(int key){
        int i = 0;
        Node temp = head;
        while (temp!=null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }

    public static int helper(Node head,int key){
        //Base case if key not found
        if(head == null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head,key);
    }

    public static void reverse(){
        Node pre = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=pre;
            pre=curr;
            curr = next;
        }
        head=pre;
    }

    public static int removeNthFromLast(int n){
        if(n==size){
            head=head.next;//Remove from front
            return head.data;
        }
        Node prev = head;
        for(int i=0; i<(size-n-1);i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return prev.data;
    }
    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node head) {
        //base case
        if(head==null || head.next==null){
            return true;
        }

        //1. get a mid
        Node middle = mid(head);

        //2.Reverse 2nd half
        Node prev=null;
        Node curr = middle;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right=prev;

        //3.Compair both halfs
        Node left = head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static Node checkCycle(){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return fast;
            }
        }
        return null;
    }
    public static void removeCycle(){
        Node fast = checkCycle();
        if(fast==null){
            System.out.println("No cycle Present!");
            return;
        }else{
            Node slow = head;
            Node prev=null;
            while(slow!=fast){
                slow=slow.next;
                prev = fast;
                fast=fast.next;
            }
            prev.next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        /*
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(56);
        ll.add(2,999);
        ll.printLL();

         */
        /*
        System.out.println(size);
        System.out.println( "Removed Element :"+ll.removeFirst());
        ll.printLL();
        System.out.println(search(10));
        System.out.println(recSearch(1));
        reverse();
        ll.printLL();
        System.out.println(removeNthFromLast(2));
        ll.printLL();
                 */
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(1);
//        ll.printLL();
//        System.out.println(isPalindrome(head));

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        System.out.println(isCycle());
        removeCycle();
        ll.printLL();
        System.out.println(isCycle());


    }
}
