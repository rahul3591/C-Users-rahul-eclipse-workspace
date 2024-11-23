package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before ("@NetBanking")
	public void netbankingPage()
	{
	System.out.println("netbankingPage");
}
	
	@After
	public void tearDown()
	{
		
		System.out.println("Clear the entries");
	}
	@Before ("@Mortgage")
	public void mortagagePage()
	{
		System.out.println("mortagag");
	}
}