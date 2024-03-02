package tnsif_program_comapare;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList<Student> s=new ArrayList<Student>();
	a.add(new Student(25,"bbb","london"));
	a.add(new Student(21,"ccc","India"));
	a.add(new Student(23,"aaa","nepal"));
	
	System.out.println(s);
	
	for(int i=0; i<s.size(); i++) {
		System.out.println(s.get(i));
		System.out.println("--------------------------------");
		
		
	}
	Collections.sort(s.new SortbyRollno());
	Collections.sort(s.new SortbyName());
	
	for(int i=0; i<s.size();i++) {
		System.out.println(s.get(i));
	}
}

}
