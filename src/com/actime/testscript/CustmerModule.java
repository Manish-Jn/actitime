package com.actime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImpementation.class)
public class CustmerModule extends BaseClass{
	
	
	@Test
	
		public void testCreateCustomer()
		{
			Reporter.log("CtreateCustomer",true);
		}
		
	}
	
	


