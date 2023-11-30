/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistproject;

/**
 *
 * @author ajaym
 */
public class Node {
    private int data;
    private Node next;
    private Node prev;
    
    Node(int input){
        next = null;
        prev = null;
        data = input;
    }
    
    public void setNext(Node n){
            next = n;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setPrev(Node p)
    {
        prev = p;
    }
    public Node getPrev(){
        return prev;
    }
    
    public void setData(int d){
        data = d;
    }
    public int getData()
    {
        return data;
    }
    

    
}



