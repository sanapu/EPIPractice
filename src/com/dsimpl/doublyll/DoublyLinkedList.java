package com.dsimpl.doublyll;

public class DoublyLinkedList {
    Node headNode;
    public void add(int data){
        Node currentNode = new Node(data);

        if(headNode == null){
            headNode = currentNode;
        }else{
            Node n = headNode;
            while(n.next != null){
                n=n.next;
            }
            n.next = currentNode;
            currentNode.previous = n.next;
        }

    }

    public String toString(){
        String s = "";
        Node n = headNode;
        while(n.next != null){
            s = s+" > "+n.data;
            n = n.next;
        }
        s = s+" > "+n.data;


        return s;
    }
}
