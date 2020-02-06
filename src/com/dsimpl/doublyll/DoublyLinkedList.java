package com.dsimpl.doublyll;

public class DoublyLinkedList {
    Node headNode;
    int size = 0;
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
            currentNode.previous = n;
        }
        ++size;

    }

    public void addFirst(int data){
        Node currentNode = new Node(data);

        if(headNode == null){
            headNode = currentNode;
        }else{
            Node n = headNode;

            headNode = currentNode;
            currentNode.next = n;
            n.previous = currentNode;
        }
        ++size;

    }

    public void removeFirst(){
        Node nodeToBeDeleted = headNode;

        if(nodeToBeDeleted == null){
        }else{
            Node n = headNode.next;

            n.previous= null;
            headNode.next =null;
            headNode = n;

        }
        --size;

    }
    public void removeLast(){
        Node nodeToBeDeleted = getNodeAtIndex(getSize()-1);

        if(nodeToBeDeleted == null){
        }else{
            Node prevNode = nodeToBeDeleted.previous;

            prevNode.next = null;
            nodeToBeDeleted.previous =null;

        }
        --size;

    }
    public void removeAtIndex(int index){
        Node nodeToBeDeleted = getNodeAtIndex(index);

        if(nodeToBeDeleted == null){
        }else{
            Node prevNode = nodeToBeDeleted.previous;

            prevNode.next = nodeToBeDeleted.next;
            nodeToBeDeleted.next.previous = prevNode;
            nodeToBeDeleted.previous =null;
            nodeToBeDeleted.next =null;

        }
        --size;

    }



    public void addAtIndex(int index, int data){
        Node getNode = getNodeAtIndex(index);
        System.out.println("getnode data"+getNode.data);

        Node newNode= new Node(data);

        if(getNode != null){
            Node previousNode = getNode.previous;
            newNode.next=getNode;
            newNode.previous = previousNode;
            getNode.previous = newNode;
            previousNode.next=newNode;


        }
        ++size;

    }

    protected  Node getNodeAtIndex(int index){
        Node currentRefNode = headNode;
        if(currentRefNode == null){
           return null;
        }else{
            int i =0;

            while(i<index && currentRefNode.next != null){

                currentRefNode = currentRefNode.next;
                ++i;
            }
        }
        return currentRefNode;


    }

    public int getSize(){
        return size;
    }

    public String toString(){
        String s = "";
        Node n = headNode;
        while(n.next != null){
            s = s+" > "+n.data;
            n = n.next;
        }
        s = s+" > "+n.data+" last previous"+n.previous.data;


        return s;
    }
}
