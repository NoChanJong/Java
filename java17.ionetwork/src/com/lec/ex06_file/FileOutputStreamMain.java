package com.lec.ex06_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		
		String org_img = "src/com/lec/ex06_file/son.png";
		String new_img = "c:/temp/son_copy.jpg";
		
		FileInputStream fis = new FileInputStream(org_img);
		FileOutputStream fos = new FileOutputStream(new_img);
		
		int readByte;
		byte[] readBytes = new byte[100];
		
		while((readByte = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByte);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("파일을 성공적으로 다운로드가 되었습니다.");
		
	}

}




























