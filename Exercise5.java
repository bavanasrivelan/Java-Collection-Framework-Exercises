package day5;
import java.util.Vector;
public class Exercise5 {
	    public static void main(String[] args) {
	        Vector<String> transactions = new Vector<>();
	        transactions.add("101");
	        transactions.add("102");
	        transactions.add("103");
	        transactions.add("104");
	        transactions.add("105");
	        transactions.add("103");
	        System.out.println("Transaction IDs: " + transactions);
	        System.out.println("Size of Vector: " + transactions.size());
	        System.out.println("Contains 104? " + transactions.contains("104"));
	    }
	}

