
//////NAKA INPUT NA DAAN

package tubiano_secondexamination_.pkg2;


public class Tubiano_SecondExamination_2 {

    static class Node{
        String data;
        Node left, right;
        
        Node (String value){
            data = value;
            left = right = null;
        }
    }
    
    Node root;
   
    public void insert (String value){
        root = insertRec (root, value);
    }
    
    private Node insertRec(Node root, String value){
        if (root == null){
            root = new Node (value);
            return root;
        }
        if (value.compareTo(root.data)<0){ 
            root.left = insertRec(root.left, value);
        }else if (value.compareTo(root.data)>0){
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    //inOrder - left-node-rigth
     //preOrder - node-left-right
    //postOrder - leeft-right-node
    
    
    
 //======================================================  

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
    
    
    
    
    
    public static void main(String[] args) {
  
    Tubiano_SecondExamination_2 bst = new Tubiano_SecondExamination_2 ();
    
    bst.insert ("|Zebra| ");
        bst.insert ("|Polygon| ");
    bst.insert ("|Zygrly| ");
    bst.insert ("|Ymir| ");
        bst.insert ("|Jean-Paul Valley| ");
    bst.insert ("|Quail| ");
    
    
      bst.preOrder();
    bst.inOrder(); 
     bst.postOrder();
    
    
    }
    
}


 