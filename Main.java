package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folderSrc = new File("D:\\Downloads");
		File folderDst = new File("D:\\copye");
		String type = "pdf";
	try {
		System.out.println(CopyFiles.copyFiles(folderSrc, folderDst, type) + " фалов скопировано");
	
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
