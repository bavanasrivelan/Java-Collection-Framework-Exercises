package day5;
import java.util.LinkedList;
public class Exercise4 {
	    public static void main(String[] args) {
	        LinkedList<String> customers = new LinkedList<>();
	        customers.add("Bavana");
	        customers.add("Kalai");
	        customers.add("Giri");
	        customers.add("Naani");
	        customers.add("Logo");
	        customers.addFirst("Sai");
	        customers.addLast("Varsh");
	        System.out.println("First Customer: " + customers.getFirst());
	        System.out.println("Last Customer: " + customers.getLast());
	        customers.removeFirst();
	        System.out.println("After Removing First Customer: " + customers);
	        customers.removeLast();
	        System.out.println("After Removing Last Customer: " + customers);
	        System.out.println("Contains Giri? " + customers.contains("Giri"));
	        System.out.println("Number of Customers: " + customers.size());
	        System.out.println("Customer List: " + customers);
	    }
	}

