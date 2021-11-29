import java.util.ArrayList;
public class linkedList
{
   public static void main(String [] args)
   { 
    class Node{  
        int number;  
        Node nextNu;  
  
        public Node(int number) {  
            this.number = number;  
            this.nextNu = null;  
        }  
    }  
    public Node head = null;  
    public Node tail = null;  
    public void addNode(int number) {
        Node newNode = new Node(number);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {   
            tail.nextNu = newNode;  
            tail = newNode;  
        }  
    }  
    public void minNode() {  
        Node current = head;  
        int min;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            min = head.number;  
            while(current != null){   
                 if(min > current.number) {  
                     min = current.number;  
                 }  
                 current= current.nextNu;  
            }  
            System.out.println("Minimum value : "+ min);  
        }  
    }  
    public void maxNode() {  
        Node current = head;  
        int max;  
  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            max = head.number;  
  
            while(current != null){  
                 if(max < current.number) {  
                     max = current.number;  
                 }  
                 current = current.nextNu;  
            }  
            System.out.println("Here is a huge integer value node in the list: "+ max);  
        }  
    }  
    public static void main(String[] args) {  
        MinMax lList = new MinMax();  
        lList.addNode((2*(10*10*10)));  
        lList.addNode(0*(10*10));  
        lList.addNode(1*(10));  
        lList.addNode(1*(10));  

        lList.minNode();  
        lList.maxNode();  
    }  
   }
}   