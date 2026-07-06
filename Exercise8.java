package day5;
import java.util.TreeSet;
public class Exercise8 {
	    public static void main(String[] args) {
	        TreeSet<Integer> employeeIds = new TreeSet<>();
	        employeeIds.add(317);
	        employeeIds.add(335);
	        employeeIds.add(109);
	        employeeIds.add(101);
	        employeeIds.add(330);
	        employeeIds.add(102);
	        System.out.println("Employee IDs:");
	        for (Integer id : employeeIds) {
	            System.out.println(id);
	        }
	    }
	}

