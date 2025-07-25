package Pac1;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void createConatctTest1() {
		String URL=System.getProperty("url");
		String BROWSER = System.getProperty("browser", "Chrome");
		String USERNAME = System.getProperty("browser");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("execute CreateContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyCretaeContactTest");
	}
	
	@Test
	public void createContactWithDate() {
		System.out.println("execute  createContactWithDate");
	}

	@Test
	public void DeleteContactWithDate() {
		System.out.println("execute  DeleteContactWithDate");
	}
	
}
