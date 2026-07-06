package day5;
import java.util.LinkedList;
public class Exercise3 {
	    public static void main(String[] args) {
	        LinkedList<String> products = new LinkedList<>();
	        products.add("Laptop");
	        products.add("Mobile");
	        products.add("Keyboard");
	        products.add("Mouse");
	        products.add("Headphone");
	        products.addFirst("Tablet");
	        products.addLast("Smart Watch");
	        products.removeFirst();
	        products.removeLast();
	        System.out.println("Product List: " + products);
	    }
	}

