package ydp.fa.programs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class ExternalizableObject implements Externalizable {
		String s;
		int i;
		int j;
	
	 public ExternalizableObject() {
		System.out.println("No Argument Constructor");
	}
	 
	 public ExternalizableObject(String s,int i,int j) {
		 this.s = s;
		 this.i = i;
		 this.j = j;
		 System.out.println("parameter constructor called");
		}

	//@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
		System.out.println("write External method called");
		
	}

	//@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s =(String)in.readObject();
		i=in.readInt();
		System.out.println("Read External Method called");
		
	}

}
