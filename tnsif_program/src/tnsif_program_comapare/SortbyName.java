package tnsif_program_comapare;

import java.util.ArrayList;
import java.util.Collections;

public class SortbyName implements Comparator<Student> {
	@override
	public int compare(Student a1, Student a2) {
		return a1.name.compareTo(a2.name)
	}

}
