package sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {
	public static int copyFiles (File folderSrc, File folderDst, String type) throws IOException {
			File [] fl = folderSrc.listFiles();
			int fileCounter = 0;
			if (!folderDst.exists()) {folderDst.mkdir();}
			for (File file : fl) {
				if (file.getName().substring(file.getName().lastIndexOf(".")+1).equals(type)) {
					try (InputStream fi = new FileInputStream(file);
							OutputStream fo = new FileOutputStream(new File(folderDst.getAbsolutePath(),file.getName()));){
						fi.transferTo(fo);
						fileCounter++;
					}
					
				}
//			return fileCounter;
		}
			return fileCounter;
		
		
	}
}
