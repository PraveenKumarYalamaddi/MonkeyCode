package com.mockito.code;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	 private MathApplication mApp;
	  private CalculatorService calService;
	
	@Before
	   public void setUp(){
		mApp = new MathApplication();
		calService = mock(CalculatorService.class);
	      mApp.setCalculatorService(calService);
	   }
	
	/*@Mock
	CalculatorService calService;
	MathApplication mApp;*/
	
	@org.junit.Test
	public void testAdd() {
		when(calService.add(10.0, 20.0)).thenReturn(30.00);
		assertEquals(mApp.add(10.00, 20.00),30.00);
		assertEquals(mApp.substarct(20.00, 10.00),10.00);
		/*InOrder inOrder = inOrder(calService);
		inOrder.verify(calService).substarct(20.0, 10.0);
		inOrder.verify(calService).add(10.0, 20.0);*/
		//verify(calService).add(10.00, 20.00);
	}
	
	@TestFactory
	public void testFac() {
		when(calService.add(10.0, 20.0)).thenReturn(30.0);
		/*assertAll(
				() -> assertEquals(30.0, mApp.add(10.0, 20.0)),
				() -> assertEquals(20.0, mApp.add(10.0, 10.0)),
				() -> assertEquals(40.0, mApp.add(10.0, 30.0))
	
				);*/
		//assertEquals(10.0, mApp.substarct(20.0, 10.0));
		calService.substarct(20.0, 10.0);
		/*verify(calService,times(3)).add(10.0,20.0);
		verify(calService, never()).multiply(10.0,20.0);*/
		
	}
	
	 @Test
	   public void testAdd1(){

	      //add the behavior to add numbers
	      when(calService.add(20.0,10.0)).thenAnswer(new Answer<Double>() {

	         @Override
	         public Double answer(InvocationOnMock invocation) throws Throwable {
	            //get the arguments passed to mock
	            Object[] args = invocation.getArguments();
				
	            //get the mock 
	            Object mock = invocation.getMock();	
					
	            //return the result
	            return 30.0;
	         }
	      });

	      //test the add functionality
	      assertEquals(mApp.add(20.0, 10.0),30.0);
	   }
	
}
