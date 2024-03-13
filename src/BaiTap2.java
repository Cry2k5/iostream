import java.io.File;
import java.util.Scanner;

public class BaiTap2 {
	public BaiTap2() {
		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());
		
		
		if(file.exists()) {
				
			file.delete();
			System.out.println("Xoa thanh cong " +file.getName());
		}else {
			System.out.println("File ko ton tai!");
		}
		
		
	}
	public static void main(String[] args) {
		new BaiTap2();
	}
}
