package bookStoreTDD;

import java.util.List;

public class Checkout {
	
	public double getDiscount(int bookCount) {
		int triples = bookCount / 3;
		double discount = triples * 0.01;
		if(bookCount >= 10) {
			discount += 0.10;
		}
		return discount;
	}
	
	public double calculatePrice(Basket basket) {
		int count = 0;
		List<Book> bookList = basket.getBooksInBasket();
		double price = 0;
		for (Book book : basket.getBooksInBasket()) {
			price += book.getPrice();
			count++;
		}
		
		double discount = getDiscount(count);
		System.out.println("the discount is: " + discount);

		price = price * ( 1.0 - discount );
		return  price;
	}
	
	public boolean allBooksDifferent(Basket basket) {
		boolean rValue = true;
		int matchCount;
		String ISBN1, ISBN2;
		List<Book> bookList = basket.getBooksInBasket();
		for( Book book1 : bookList ) {
			ISBN1 = book1.getISBN();
			matchCount = 0;
			for( Book book2 : bookList ) {
				ISBN2 = book2.getISBN();
				if( ISBN2.equals(ISBN1) ) {
					matchCount++;
				}
			}
			if( matchCount > 1) {
				rValue = false;
			}
		}
		return rValue;
	}

}
