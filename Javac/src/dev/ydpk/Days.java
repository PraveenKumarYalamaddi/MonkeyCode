package dev.ydpk;

public class Days implements Runnable { 
	
	Thread t1;
	SalesPersons sp;
	String day[]={"Sunday","Monday","Tueasday","Wednesday","Thursday","Friday","Saturday"}; 
	boolean suspended;
	Days()
	{
		t1=new Thread(this,"day");
		sp=new SalesPersons();
		t1.start();
		
	}
	@Override
	public void run() { 
		for(int i=0;i<31;i++)
		{
			int j=i%7;
			if(day[j]=="Sunday")
			{
				sp.suspend();
				setSuspended(true);
				System.out.println(day[j]+"Sales persons suspened");
			}
			else if(day[j]=="Wednesday"&& isSuspended())
			{
				sp.resume();
				System.out.println(day[j]+"Sales persons resume");
			}
		}
		
	}
	
	public boolean isSuspended() {
		return suspended;
	}
	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}
	
	public static void main(String[] args) {
		new Days();
	}
}
