package bookStoreTDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		//Arrange - set up the test preconditions
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		double expectedSize = 0.0;
		
		//Act- call the method being tested
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert - check the state of the program to see if it matches expectations
		assertEquals(expectedSize, actualSize);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		//Arrange - set up the test
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addBook(new Book(1.00, "123456"));
		double expectedSize = 1.0;
		
		//Act- call the 
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook() {
		//Arrange - set up the test
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addBook(new Book(1.00,"123456A" ));
		basket.addBook(new Book(2.00, "123456B"));
		//the name of the variable here is not important. 
		double expectedSize = 3.0;
		
		//Act- call the 
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks_PlusDiscount() {
		//Arrange - set up the test
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addBook(new Book(1.00, "123456C"));
		basket.addBook(new Book(2.00, "123456D"));
		basket.addBook(new Book(3.00, "123456E"));
		//the name of the variable here is not important. 
		double expectedSize = 5.94;
		
		//Act- call the
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks_PlusDiscount() {
		//Arrange - set up the test
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addBook(new Book(25.99,"123456F"));
		basket.addBook(new Book(25.99, "123456G"));
		basket.addBook(new Book(25.99, "123456H"));
		basket.addBook(new Book(25.99, "123456I"));
		basket.addBook(new Book(25.99, "123456J"));
		basket.addBook(new Book(25.99, "123456K"));
		basket.addBook(new Book(25.99, "123456L"));
		//the name of the variable here is not important. 
		double expectedSize = 178.29;
		
		//Act- call the
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks_PlusDiscount() {
		//Arrange - set up the test
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		basket.addBook(new Book(25.99,"123456F"));
		basket.addBook(new Book(25.99, "123456G"));
		basket.addBook(new Book(25.99, "123456H"));
		basket.addBook(new Book(25.99, "123456I"));
		basket.addBook(new Book(25.99, "123456J"));
		basket.addBook(new Book(25.99, "123456K"));
		basket.addBook(new Book(25.99, "123456L"));
		basket.addBook(new Book(25.99, "123456M"));
		basket.addBook(new Book(25.99, "123456N"));
		basket.addBook(new Book(25.99, "123456O"));
		//the name of the variable here is not important. 
		double expectedSize = 226.11;
		
		//Act- call the
		double actualSize = checkout.calculatePrice(basket);
		
		//Assert
		assertEquals(expectedSize, actualSize);
	}


}
