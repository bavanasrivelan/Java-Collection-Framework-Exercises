package day5;
import java.util.HashSet;
public class Exercise6 {
	    public static void main(String[] args) {
	        HashSet<Integer> rollNumbers = new HashSet<>();
	        rollNumbers.add(101);
	        rollNumbers.add(102);
	        rollNumbers.add(103);
	        rollNumbers.add(101);
	        rollNumbers.add(104);
	        rollNumbers.add(102);
	        System.out.println("Roll Numbers: " + rollNumbers);
	    }
	}

