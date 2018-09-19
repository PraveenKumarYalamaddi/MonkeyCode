package ydp.fa.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationExample {

	public static void main(String[] args) throws Exception {
		ExternalizableObject eo = new ExternalizableObject("Praveen", 10, 20);
		
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("src.sp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(eo);
		oos.close();
		
		System.out.println("De-serialization started");
		FileInputStream fis = new FileInputStream("src.sp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableObject e = (ExternalizableObject) ois.readObject();
		ois.close();
		System.out.println(e.s+"--"+e.i+"--"+e.j);
	}

}
