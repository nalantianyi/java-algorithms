package xyz.miaodaddy.algorithms.linkedlist;

/**
 * @author nalantianyi
 */
public class List {
    // 头节点
    public Node head = new Node(0, "");

    // 新增
    public void add(Node node) {
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    // 删除
    public void remove(int no) {
        Node cur = head;
        if (cur.next == null) {
            System.out.println("链表为空");
        }
        while (cur.next != null) {
            if (cur.next.no == no) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        System.out.println("链表中没你想删除的节点");
    }

    // 当前链表内容
    public void display() {
        Node cur = head.next;
        if (cur == null) {
            System.out.println("链表为空");
            return;
        }
        while (cur != null) {
            System.out.println(cur);
            cur = cur.next;
        }
    }

    //  反转
    public void reverse() {
        Node cur = head.next;
        Node next = null;
        Node newHead = new Node(0, "");
        while (cur != null) {
            next = cur.next;
            cur.next = newHead.next;
            newHead.next = cur;
            cur = next;
        }
        head.next=newHead.next; //最后把新的头指向原来的链表头
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(new Node(0, "小鸡"));
        list.add(new Node(1, "猫爸"));
        list.add(new Node(2, "喵喵"));
        System.out.println("当前的链表内容");
        list.display();

//        list.remove(3);
//        System.out.println("删除后的链表内容");
        System.out.println("反转后的链表内容");
        list.reverse();
        list.display();

    }


}
