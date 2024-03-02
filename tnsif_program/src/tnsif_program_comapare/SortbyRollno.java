package tnsif_program_comapare;
import java.util.Comparator

public class SortbyRollno implements Comparator<Student> {
	@override
	public int compare(Student o1, Student o2) {
		return o2.rollno = o1.rollno;
	}

}
