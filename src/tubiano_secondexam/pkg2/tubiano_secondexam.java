//////USER INPUT
package tubiano_secondexam.pkg2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Node{
        String data;
        Node left, right;
        
        public Node (String data){
            this.data = data.toLowerCase(); 
            left = right = null;
        }
    }


 class Tubiano_SecondExam2{
        Node root;
        
        public void insert(String data){
            root = insertRec (root, data.toLowerCase());
        }
        
        private Node insertRec (Node root, String data){
            if (root == null){
                root = new Node (data);
                return root;
            }
        
            if (data.compareTo(root.data)<0)
                root.left = insertRec (root.left, data);
            else if (data.compareTo(root.data)>0)
                root.right = insertRec(root.right, data);
            
            return root;
        }  


 public void preOrder (){
               System.out.println(" ");

        System.out.print("PreOrder: ");
                     System.out.println(" ");

        preOrderRec(root);
                System.out.println();
           
        }
        
        private void preOrderRec(Node root){
        if (root !=null){
            System.out.print(root.data + " ");
                        preOrderRec(root.left);

            preOrderRec (root.right);
        }
        
    }
    
 //======================================================  

 public void inOrder (){
                           System.out.println("");

        System.out.println("InOrder: ");

        inOrderRec(root);
                System.out.println();

    }
    
    private void inOrderRec(Node root){
        if (root !=null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec (root.right);
        }
    }
    
   //======================================================  
 public void postOrder (){
                            System.out.println(" ");

         System.out.print("PostOrder: ");
              System.out.println(" ");


        postOrderRec(root);
                System.out.println();

    }
    
    private void postOrderRec(Node root){
        if (root !=null){
             postOrderRec(root.left);

            postOrderRec (root.right);
            
            System.out.print(root.data + " ");
                      
        }
    }
    }
    

public class tubiano_secondexam {
    public static void main(String[] args) {
        
     Scanner scanner =new Scanner (System.in);     
        Tubiano_SecondExam2 bst = new Tubiano_SecondExam2();
        
        System.out.println("Enter passage: ");
        String passage = scanner.nextLine();
        
          passage = passage.replaceAll("[.,?!]", "");
        
        String [] words = passage.split("\\s+");
        
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words){
            if (!word.isEmpty()){
                uniqueWords.add(word.toLowerCase());
            }
        }
       
        for (String word : uniqueWords){
            bst.insert(word);
        }
         bst.preOrder();
    bst.inOrder(); 
     bst.postOrder();
    
        
            scanner.close();
 
        
    }
    
}
