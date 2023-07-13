package xyz.miaodaddy.algorithms.linkedlist;

/**
 * @author nalantianyi
 */
public class Node {
    // 编号
    public int no;
    // 昵称
    public String nickname;

    public Node next;

    public Node(int no, String nickname) {
        this.no = no;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
