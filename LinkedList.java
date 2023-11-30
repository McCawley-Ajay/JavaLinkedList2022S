/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author ajaym
 */
public class LinkedList {
    
    
    public Node first;
    public Node last;
   
    
    
    public void deleteNode(int x){
          Node temp = first;
          
          if(temp == null){
              return;
          }
          if(temp.getData() == x){
              first.getNext().setPrev(last);
              last.setNext(temp.getNext());
              first = temp.getNext();
              return;
          }
          else{
              temp = temp.getNext();
          }
          while(temp != last){
              if(temp.getData() == x){
                  temp.getPrev().setNext(temp.getNext());
                  temp.getNext().setPrev(temp.getPrev());
                  return;
              }
              temp = temp.getNext();
      }
          if(temp == last && temp.getData() == x){
              temp.getPrev().setNext(first);
              temp.getNext().setPrev(temp.getPrev());
              last = temp.getPrev();
              return;
      }
      
   
    }
      public void addNode(int x){
          Node temp = new Node(x);
          
          if(first == null){
              temp.setNext(temp);
              temp.setPrev(temp);
              last = temp;
          }
          else{
              temp.setNext(first);
              temp.setPrev(last);
              first.setPrev(temp);
              last.setNext(temp);
          }
          first = temp;
      }
        
}