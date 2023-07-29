import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  System.out.println("\n**** WELCOME TO CLOTHING STORE MANAGEMENT SYSTEM ****");

	        LinkedList tshirtScok = new LinkedList();
	        tshirtScok.addStockNode("XS",20);
	        tshirtScok.addStockNode("L",50);
	        tshirtScok.addStockNode("XL",25);

	        LinkedList pantStock = new LinkedList();
	        pantStock.addStockNode("XS",10);
	        pantStock.addStockNode("S",20);
	        pantStock.addStockNode("M",23);
	        pantStock.addStockNode("L",30);

	        LinkedList dressStock = new LinkedList();
	        dressStock.addStockNode("S",15);
	        dressStock.addStockNode("M",20);
	        dressStock.addStockNode("L",30);
	        dressStock.addStockNode("XL",28);

	        LinkedList jeanStock = new LinkedList();
	        jeanStock.addStockNode("XS",5);
	        jeanStock.addStockNode("S",8);
	        jeanStock.addStockNode("M",12);
	        jeanStock.addStockNode("L",17);
	        jeanStock.addStockNode("XL",21);
	        
	        BST clothesBST = new BST();
	        clothesBST.insert("Tshirt",tshirtScok);
	        clothesBST.insert("Pants",pantStock);
	        clothesBST.insert("Dress",dressStock);
	        clothesBST.insert("Jean",jeanStock);

	        System.out.println("\nCLOTHES\n");
	        clothesBST.printInorder(clothesBST.root);

	        Scanner scanner = new Scanner(System.in);

	        while (1==1) {

	            System.out.print("Enter clothe name (Tshirt,Pants,Dress,Jean), for exit enter -1: ");
	            String name = scanner.next();

	            if (name.equals("-1")) break;
	            BST.ClotheNode node = clothesBST.search(name);

	            if (node != null) {
	                System.out.print("Enter size (XS,S,M,L,XL): ");
	                String size = scanner.next();
	                int quantity = node.stock.getStock(size);

	                if (quantity == 0)
	                    System.out.println("This size of this clothe is out of stock. Please try another.");
	                else{
	                    System.out.println("Stock Status: " + quantity);
	                    System.out.print("Enter quantity: ");
	                    int purchase = scanner.nextInt();

	                    if (purchase > quantity) 
	                        System.out.println("Purchase quantity you entered, is out of stock limit!!");
	                    else{
	                        node.stock.reduceStock(size,purchase);
	                        System.out.println("Stock is reduced. Shopping is completed successfully.");
	                    }
	                }
	            } else 
	                System.out.println("This clothe does not exist in our system. Please try another.");

	            System.out.println();
	        }
	        System.out.println("Goodbye!");
	        scanner.close();

}
}