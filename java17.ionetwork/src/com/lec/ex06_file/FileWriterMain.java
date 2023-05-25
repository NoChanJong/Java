package com.lec.ex06_file;

import java.io.File;
import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		
		File file = new File("c:/temp/한숨.txt");
		FileWriter fw = new FileWriter(file, false);
		
		fw.write("숨을 크게 쉬어봐요\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일이 성공적으로 저장되었습니다.");
		
	}

}
