package com.onesoft.question5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Trans  implements Serializable{
	String name="viki";
	transient String pass="bala";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Trans t= new Trans();
	FileOutputStream fos=new FileOutputStream("E:\\Github\\atm\\new.txt");
	ObjectOutputStream out=new ObjectOutputStream(fos);
	out.writeObject(t);
	out.close();

	        FileInputStream fis=new FileInputStream("E:\\Github\\atm\\new.txt");
	        ObjectInputStream inp=new ObjectInputStream(fis);
	        Object read=inp.readObject();
	        Trans tr=(Trans)read;
	        System.out.println(tr.name+" "+tr.pass);
	}

}
