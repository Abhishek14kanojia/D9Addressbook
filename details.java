package addressbook;

public class details {
	 private String Name;
	 private String Address;
	 private String City;
	 private int Pincode;
	 private long Mobileno;
	 private String Email;
	 
	 public details(String Name, String Address, String City, int Pincode, long Mobileno, String Email) {
		 this.Name = Name;
		 this.Address = Address;
		 this.City = City;
		 this.Pincode = Pincode;
		 this.Mobileno = Mobileno;
		 this.Email = Email;
		  
	 }
	 public void printdetails () {
		 System.out.println(Name);
		 System.out.println(Address);
		 System.out.println(City);
		 System.out.println(Pincode);
		 System.out.println(Mobileno);
		 System.out.println(Email);
	 }
	 
}
