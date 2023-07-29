
public class LinkedList {

	 class StockNode{
	        String size;
	        int quantity;
	        StockNode next;

	        StockNode(String size,int quantity) {
	            this.size = size;
	            this.quantity = quantity;
	            this.next = null;
	        }

	        @Override
	        public String toString() {
	            return "Size: " + size + " Stock: " + quantity;
	        }
	    }

	    StockNode head;

	    LinkedList() {
	        this.head = null;
	    }

	    public void addStockNode(String size,int quantity) {
	        if (head == null) {
	            head = new StockNode(size,quantity);
	            return;
	        }

	        StockNode newNode = new StockNode(size,quantity);
	        StockNode node = head;
	        while (node.next!=null) {
	            node = node.next;
	        }
	        node.next = newNode;
	    }

	    public int getStock(String size) {
	        StockNode node = head;
	        while (node!=null) {
	            if (node.size.equals(size))
	                return node.quantity;
	            node = node.next;
	        }
	        return 0;
	    }

	    public void reduceStock(String size,int much) {
	        StockNode node = head;
	        while (node!=null) {
	            if (node.size.equals(size)) {
	                node.quantity -= much;
	            }
	            node = node.next;
	        }
	    }

	    @Override
	    public String toString() {
	        
	        StockNode node = head;
	        String output = "";

	        while(node!=null){
	            output += node + "\n";
	            node = node.next;
	        }
	        return output;
	    }
}
