public class Person{
	
	String firstname;
	String middlename;
	String lastname;
	String gender;
	String address;
	
	public Person(String fname, String mname, String lname, String gnder, String ADD) {
		this.firstname= fname;
		this.lastname = lname;
		this.middlename= mname;
		this.gender= gnder;
		this.address= ADD;
		}
	
	public Person() {
		this.firstname= "Krutika";
		this.lastname = " Deshmukh";
		this.middlename=" Ashay";
		this.gender= "--Female";
		this.address= "--Nasik";
		}
	
	public String PrintData() {
		
		
		return this.firstname + this.middlename + this.lastname + this.gender + this.address;
	}
	
}