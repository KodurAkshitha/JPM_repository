package tnsif_program_comapare;

public class Student {
	int rollno;
	String naem, address;
	public Student(int rollno, String naem, String address) {
		super();
		this.rollno = rollno;
		this.naem = naem;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", naem=" + naem + ", address=" + address + "]";
	}
	

}
