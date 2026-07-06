package day5;
import java.util.ArrayList;
public class Exercise2 {
	    public static void main(String[] args) {
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Bavana");
	        students.add("Kalai");
	        students.add("Giri");
	        students.add("Naani");
	        students.add("Logo");
	        System.out.println("Student List: " + students);
	        students.add(2, "Sai");
	        System.out.println("After Adding Sai: " + students);
	        students.remove("Logo");
	        System.out.println("After Removing Logo: " + students);
	        System.out.println("Contains Giri? " + students.contains("Giri"));
	        System.out.println("Index of Kalai: " + students.indexOf("Kalai"));
	        students.set(1, "KalaiSelvan");
	        System.out.println("After Replacing: " + students);
	        System.out.println("Student at index 2: " + students.get(2));
	        System.out.println("Is List Empty? " + students.isEmpty());
	        System.out.println("Total Students: " + students.size());
	        students.clear();
	        System.out.println("After Clear: " + students);
	    }
	}

