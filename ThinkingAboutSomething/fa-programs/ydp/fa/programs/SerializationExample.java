package ydp.fa.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ydp.fa.programs.util.ChildClassObject;

public class SerializationExample {

	public static void main(String[] args) throws Exception {
		/**
		 * Object to serialize
		 */
		ChildClassObject so = new ChildClassObject();
		so.p= "Y";
		so.y= "P";
		so.i = 200;
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
		ChildClassObject sso = (ChildClassObject)ois.readObject();
		ois.close();
		System.out.println(sso.y +" "+sso.p +sso.i+"--"+sso.j);

	}

}
