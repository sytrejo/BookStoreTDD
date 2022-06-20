package bookStoreTDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketTest {
	
	//Steps of TDD
	//1. Write the test
	//2. Make the test compile
	//3. Watch the test fail
	//4. Do the minimum to make all tests pass
	//5. Refactor and generalize
	

	private Basket basket;

	
	@BeforeEach
	void setUp() {
		//this happens during the 5th step of TDD..
		basket = new Basket();
		
		
	}
	
	
	@Test
	void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		//Arrange - set up the test preconditions
		//this variable is replaced during the 5th step to improve readability and clarity
//		Basket basket = new Basket();
		int expectedSize = 0;
		//call the method being tested
		List<Book> booksInBasket = basket.getBooksInBasket();
		int actualSize = booksInBasket.size();
		
		//Assert- check the state of the program to see if it matches expectations
		//order matters because you the message is programmed in that order.
		assertEquals(expectedSize, actualSize);
		
		//null exception when a method is called on a null object
		//null has no code associated on it.
		//
	}
	
	@Test
	void test_GetBooksInBasket_ReturnsListOfSizeOne_AfterAddBookMethodIsCalledWithOneBook() {
	
		//Arrange - set up the test preconditions
//		Basket basket = new Basket();
		int expectedSize = 1;
//		bookToAdd = new Book();
		basket.addBook(new Book(1.00, "123456T"));
		
		//Act- Call the method being tested
		List<Book> booksInBasket = basket.getBooksInBasket();
		int actualSize = booksInBasket.size();
		
		
		//Assert- Check the state of the program to see if it matches expectations
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	void test_GetBooksInBasket_ReturnsListOfSizeTwo_AfterAddBookMethodIsCalledWithTwoBook() {
	
		
		//Arrange - set up the test preconditions
		int expectedSize = 2;
		basket.addBook(new Book(2.0, "123456S"));
		basket.addBook(new Book(3.0, "123456R"));

		
		//Act- Call the method being tested
		List<Book> booksInBasket = basket.getBooksInBasket();
		int actualSize = booksInBasket.size();
		
		
		//Assert- Check the state of the program to see if it matches expectations
		assertEquals(expectedSize, actualSize);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
	  	//test code
	}

	
	
}

