package com.defaultprogram;

import org.testng.annotations.Test;

public class ProirtyTestNG {
	
	
	@Test (priority = -26)
	public void CloseBrowser() {
		
		System.out.println("Closing Google Chrome browser");
	}

	@Test (priority = -25)
	public void OpenBrowser() {
		System.out.println("Launching Google Chrome browser"); 
		
	}

}
