package projectstuff;

public class alertMethod
{
	
	//if alert present then re-usable method
	public boolean isAlertpresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	if(isAlertpresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo.defaultContent();
		Assert.assertTrue(false);
		logger.warn("llll");
	}
	else
	{
		Assert.assertTrue(true);
		logger.warn("llll");
		lp.clickLogout();
		driver.switchTo().alert().accept();
		driver.switchTo.defaultContent();
		
	}
	
	
}
