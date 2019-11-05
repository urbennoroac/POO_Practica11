
	import java.io.*;
	public class CopyFileSample {
	public static void copy (File source , File destination)

	throws IOException {
		try(InputStream in = new FileInputStream(source) ;
		OutputStream out = new FileOutputStream(destination)){
		int b ;
			while((b = in.read()) != -1){
			out.write (b) ;
			}
		}
	}
	public static void main (String[]  args) throws IOException {
	File f1 = new File("/Users/urbennoroac/Downloads/text1.txt");
	File f2 = new File("/Users/urbennoroac/Downloads/text2.txt");
	copy(f1, f2);
	}
	}


