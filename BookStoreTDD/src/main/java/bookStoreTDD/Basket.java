package bookStoreTDD;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	
	//create the field outside of the methods so that all methods have access to them
	private List<Book> books = new ArrayList<Book>();
	
	public List<Book> getBooksInBasket(){
			return books;	
	}
	
	public void addBook(Book book) {
		this.books.add(book);
	}

//	public double calculatePrice(Basket basket) {
//		List<Book>tempList = basket.getBooksInBasket();
//		double totalPrice = 0.0;
//		for(Book tempBook : tempList){
//			totalPrice += tempBook.getPrice();
//		}
//		
//		return totalPrice;
//	}

	


}
