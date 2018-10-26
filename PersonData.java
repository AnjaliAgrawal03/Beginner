public class PersonData{
	
	public static void main(String[] args){
		
		Person myperson = new Person("Anjali"," Pavan "," Agrawal  "," -- Female  ","--Baner,Pune  ");
		System.out.println("Person detail is :" + myperson.PrintData());
	
		Person myperson1 = new Person();
		System.out.println("Person detail is :" + myperson1.PrintData());
	}
}