package inflearn.section07;

import java.util.LinkedList;
import java.util.Queue;

public class Main07 {

    Node root;
    public void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(level + " : ");
            for (int i = 0; i < len; i++) {
                Node currentN = q.poll();
                System.out.print(currentN.data + " ");
                if (currentN.lt != null) {
                    q.offer(currentN.lt);
                }
                if(currentN.rt != null) {
                    q.offer(currentN.rt);
                }
            }
            level++;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Main07 tree = new Main07();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

    }
}
