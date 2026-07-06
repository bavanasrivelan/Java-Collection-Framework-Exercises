package day5;
import java.util.TreeSet;
public class Exercise9 {
	    public static void main(String[] args) {
	        TreeSet<Integer> marks = new TreeSet<>();
	        marks.add(85);
	        marks.add(89);
	        marks.add(95);
	        marks.add(80);
	        marks.add(81);
	        marks.add(90);
	        System.out.println("Marks in Sorted Order: " + marks);
	        System.out.println("Marks in Descending Order: " + marks.descendingSet());
	        System.out.println("First Mark: " + marks.first());
	        System.out.println("Last Mark: " + marks.last());
	        System.out.println("Contains 90? " + marks.contains(90));
	        System.out.println("Marks less than 85: " + marks.headSet(85));
	        System.out.println("Marks >= 80: " + marks.tailSet(80));
	        marks.remove(80);
	        System.out.println("After Removing 80: " + marks);
	        System.out.println("Total Number of Marks: " + marks.size());
	    }
	}

