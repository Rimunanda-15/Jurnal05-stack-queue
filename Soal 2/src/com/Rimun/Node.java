package com.Rimun;

public class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }

    public void displayNode()
    {
        System.out.println(data);
    }
}
