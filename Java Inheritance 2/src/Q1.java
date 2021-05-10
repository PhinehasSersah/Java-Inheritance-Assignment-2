class Author {
	private String name;
	private String Email;
	private char gender;
	
	public Author (String n,String E, char g ) {
		name = n;
		Email = E;
		gender= g;}
	public String getName1() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	 public void setName(String myName) {
		 this.name = myName;
	 }
	 public char getGender() {
		 return gender;
	 }
	 public String toString() {
		 return name+" "+gender+" at " +Email;
	 }
	
	}

class Book extends Author{
	private String bname;
	private Book(String n, String E, char g) {
		super(n, E, g);
	}
	private double price;
	int quantity;
	
public String getName() {
	return bname;
}
public String getAuthor() {
	return getAuthor();
}
public double getPrice() {
	return price;
}
public void setPrice(double myprice) {
	this.price = myprice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int myQuantity) {
	this.quantity=myQuantity;
}
public String toString() {
	 return bname+" "+getName1()+getGender()+" at "+getEmail();
}
public class Q1 {
	public void main(String[] args) {
	Author me = new Author("Phinehas", "XYZ@yahoo.com",'m');
	Book we = new Book("Epistles of Mama", "abd@yahoo.com", 'f' );
	System.out.println(we.getName());
	System.out.println(me.getName1());
	}	
}
}

