/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author ajaym
 */
public class LinkedListProject {

        
     
  public static void mainRunner(){
        
    String data;
    int people;
    String[] myArray;
    int i;


   
    
      try{
            File name = new File("filename.txt");
            Scanner scan = new Scanner(name);
            while(scan.hasNextLine()){
                data = scan.nextLine();
                myArray = data.split(" ");
                int n = Integer.parseInt(myArray[0]);
                int k = Integer.parseInt(myArray[1]);
                int m = Integer.parseInt(myArray[2]);
                System.out.println("N = " + n + " K = " + k + " M = " + m);
                
              
            }
            
            scan.close();
            
        }catch(FileNotFoundException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    
       
    }
        
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        mainRunner();
  
    }
}