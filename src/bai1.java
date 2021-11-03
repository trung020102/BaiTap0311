import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageOutputStream;



public class bai1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Chuỗi: ");
		String str = sc.nextLine();
		FileOutputStream fout = null;
		try {
		    fout = new FileOutputStream("D:\\testout.txt");
			byte b[] = str.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success...");
			
			
		} catch (Exception e) {
	       System.out.println(e);
		}
		finally {
			fout.close();
		}
	}

}
