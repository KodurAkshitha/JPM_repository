package tnsif_program1;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the address");
		String address=sc.nextLine();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		Customer c=new Customer();
		c.setCname(name);
		c.setCaddress(address);
		c.setCid(id);
		
		System.out.println();
		boolean output = c instanceof Customer;
		System.out.println(output);
	}
}
