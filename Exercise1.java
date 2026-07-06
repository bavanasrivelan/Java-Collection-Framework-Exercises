package day5;
import java.util.ArrayList;
public class Exercise1 {
		public static void main(String[] args) {
	        ArrayList<String> students = new ArrayList<>();
	        students.add("Bavana");
	        students.add("Kalai");
	        students.add("Giri");
	        students.add("Naani");
	        students.add("Logo");
	        System.out.println("Student Names: " + students);
	        students.add("Kalai");
	        students.add(null);
	        System.out.println("Updated List: " + students);
	        System.out.println("Size of the List: " + students.size());
		}
	}

