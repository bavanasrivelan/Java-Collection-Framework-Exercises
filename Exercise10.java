package day5;
import java.util.TreeSet;
public class Exercise10 {
	    public static void main(String[] args) {
	        TreeSet<Student> students = new TreeSet<>();
	        students.add(new Student(103, "Bavana", 88));
	        students.add(new Student(101, "Kalai", 86));
	        students.add(new Student(105, "Giri", 85));
	        students.add(new Student(102, "Naani", 87));
	        students.add(new Student(104, "Logo", 90));
	        System.out.println("Students in Sorted Order:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }
	}
	class Student implements Comparable<Student> {
	    int rollNo;
	    String name;
	    int mark;
	    public Student(int rollNo, String name, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark = mark;
	    }
	    @Override
	    public int compareTo(Student s) {
	        return Integer.compare(this.rollNo, s.rollNo);
	    }
	    @Override
	    public String toString() {
	        return "Roll No: " + rollNo +
	               ", Name: " + name +
	               ", Mark: " + mark;
	    }
	}

