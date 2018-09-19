package ydp.fa.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		/**
		 * Object to serialize
		 */
		SerializableObject so = new SerializableObject();
		
		/**
		 * Serialization Part
		 */
		FileOutputStream fos = new FileOutputStream("sre.ydp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(so);
		oos.close();
		
		/**
		 * de-serialization Part
		 */
		FileInputStream fis = new FileInputStream("sre.ydp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableObject sso = (SerializableObject)ois.readObject();
		ois.close();
		System.out.println(sso.y +" "+sso.p);

	}

}
