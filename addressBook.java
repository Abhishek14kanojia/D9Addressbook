package addressbook;
import java.util.Scanner;

public class addressBook {
	public static void addressBookdetail () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String Name = sc.next();
		System.out.println("Enter the Address :");
		String Address = sc.next();
		System.out.println("Enter the City name :");
		String City = sc.next();
		System.out.println("Enter the Pincode :");
		int Pincode = sc.nextInt();
		System.out.println("Enter the Mobileno :");
		long Mobileno = sc.nextLong();
		System.out.println("Enter the email :");
		String Email = sc.next();
		
		details detail1 = new details(Name, Address, City, Pincode, Mobileno, Email );
			detail1.printdetails();
		
	}
	
	
	
}

