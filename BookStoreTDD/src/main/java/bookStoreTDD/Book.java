package bookStoreTDD;

public class Book {
	
	//attribute 
	//member value
	private double price;
	private String ISBN;
	
	public Book(double price, String ISBN) {
		this.price = price;
		this.ISBN = ISBN;
		
	}
	



	//member value method
	public double getPrice() {
		return this.price;
	}
	
	public String getISBN() {
		return this.ISBN;
	}

	
}
