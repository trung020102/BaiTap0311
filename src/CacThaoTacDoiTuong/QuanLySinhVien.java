
	package CacThaoTacDoiTuong;
	import java.io.*;
	public class QuanLySinhVien {

	
		public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
			// TODO Auto-generated method stub
			SinhVien s = new SinhVien("Nguyễn Thị Thùy Trinh", "21-09-2002", '1', 9.8, 4);
			
			
			//Clone
			SinhVien s2 = (SinhVien) s.clone();
			System.out.println("Clone:");
			System.out.println(s2.toString());
			
			//Seriable
			//
			FileOutputStream fos = new FileOutputStream("D:\\Student.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(s);
		    
		    // De-serializing 'a'
		    FileInputStream fis = new FileInputStream("D:\\Student.txt");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    SinhVien b = (SinhVien)ois.readObject(); 
		    // down-casting object
		    
		
		    // closing streams
		    oos.close();
		    ois.close();
		    
		    //Compare
		    System.out.println("Compare");
		    SinhVien c = new SinhVien("Trần Thị A", "14-06-2002", '1', 5, 4);
		    System.out.println(s.toString() +" va "+ c.toString());
		    System.out.println(s.compareTo(c));	
		}

	}