package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Java172_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());//파일 존재하는지 묻는 것
		System.out.println(file.isFile());//파일 맞니
		System.out.println(file.length());// 공백도 문자 하나로 인식한다.
		
		FileWriter fw = null;
		
		try {
			//mode의 값이 true이면 append
			//mode의 값이 false이면 update
			//mode의 기본값은 false
			fw = new FileWriter(file);
			fw.write("java\n"); //buffer
			fw.flush(); //buffer에 저장된 문자열을 sample.txt파일에 보내고 buffer를 비운다.
			
			fw.write("java\n"); 
			fw.flush();
			
			fw.write(new char[] {'s','p','r','i','n','g','\n'});
			fw.flush();
			
		    fw.write(97); //유니코드 a
		    fw.flush();
		    
		    fw.write(new char[] {'s','p','r','i','n','g','\n'}, 3, 3);
			fw.close();
			
//			//java.io.IOException: Stream closed
//			fw.write("end");
//			fw.flush();
		    
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//end main()

}//end class
