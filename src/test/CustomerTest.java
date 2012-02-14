package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import book.Book;
import book.BookType;
import book.Wyjatek;

public class CustomerTest {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}


@AfterClass
public static void tearDownAfterClass() throws Exception {
}

@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}


@Test
public void testAddBook() {
fail("Not yet implemented"); // TODO
}

@Test
public void testPrintBooks() {
fail("Not yet implemented"); // TODO
}

@Test
public void testCustomer() {
fail("Not yet implemented"); // TODO
}

@Test
public void testDeleteBook() {
fail("Not yet implemented"); // TODO
}


@Test
public void testFindBook() {
fail("Not yet implemented"); // TODO
}



@Test(expected=Wyjatek.class, timeout=100)
public void testException() throws Wyjatek
{
new Book(BookType.Horror,"").setPrize(-8.0);
}
}

