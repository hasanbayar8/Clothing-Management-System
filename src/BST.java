
public class BST {

	 class ClotheNode{
	        String name;
	        LinkedList stock;
	        ClotheNode left,right;

	        ClotheNode(String name,LinkedList stock){
	            this.name = name;
	            this.stock = stock;
	            this.left = null;
	            this.right = null;
	        }

	        @Override
	        public String toString() {
	            return "Name: " + name + "\n" + stock;
	        }
	    }

	    ClotheNode root;
	 
	    BST() {
	        this.root = null;
	    }
	 
	    public void insert(String name,LinkedList stock) {
	        root = insertNode(root,name,stock);
	    }
	 
	    public ClotheNode insertNode(ClotheNode root,String name,LinkedList stock) {
	 
	        /* If the tree is empty, return a new node */
	        if (root == null) {
	            root = new ClotheNode(name,stock);
	            return root;
	        }
	 
	        if (name.compareTo(root.name) < 0)
	            root.left = insertNode(root.left,name,stock);
	        else if (name.compareTo(root.name) > 0)
	            root.right = insertNode(root.right,name,stock);

	        return root;
	    }
	    
	    public ClotheNode search(String name) {
	        return searchNode(root, name);
	    }
	    
	    public ClotheNode searchNode(ClotheNode root, String name) {
	        if (root==null || root.name.equals(name))
	            return root;

	        if (root.name.compareTo(name) < 0)
	            return searchNode(root.right,name);
	    
	        return searchNode(root.left,name);
	    }

	    void printInorder(ClotheNode node){
	        if (node == null)
	            return;
	 

	        printInorder(node.left);
	        System.out.println(node);
	        printInorder(node.right);
	    }
}
