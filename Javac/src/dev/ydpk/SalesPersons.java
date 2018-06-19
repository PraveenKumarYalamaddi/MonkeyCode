package dev.ydpk;

public class SalesPersons extends Thread {
	
	String salesPerson1 = "SALES_PERSON_1";
	String salesPerson2 = "SALES_PERSON_2";
	String salesPerson3 = "SALES_PERSON_3";
	String salesPerson4 = "SALES_PERSON_4";
	String salesPerson5 = "SALES_PERSON_5";
	
	
	Thread t;
	SalesPersons()
	{
		t=new Thread(this,"Person.name");
		t.start();
	}
	@Override
	public void run() {
		System.out.println(salesPerson1);
		System.out.println(salesPerson2);
		System.out.println(salesPerson3);
		System.out.println(salesPerson4);
		System.out.println(salesPerson5);
	}
}
