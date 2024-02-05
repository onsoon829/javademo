package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
public class Java179_stream {

	public static void main(String[] args) {
		File file = new File("./src/java016_stream/phone.dat");
		FileOutputStream fo = null;
		ObjectInputStream = fi = null;
		
		FileOutputStream os = null;
		ObjectInputStream = oi = null;
		
		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			Phone p = new Phone("andrdoid", 5000);
			os.writeObject(s);
			
			System.out.println("객체저장");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			os.close();
			fo.close();
		}
		
		/////////////////////////////////////
		fi = new FileInputStream(file);
		oi = new ObjectInputStream(fi);
		
		try{
		   Phone phone = (phone)oi.readObject();
		   System.out.println(phone.toString());
		
		   String s = (String)oi.readObject();
		   System.out.println(s.toString());
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();	
		}finally {
			fi.close();
			oi.cloae();
		}
		

	}

}
