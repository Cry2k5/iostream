import java.io.File;
import java.util.Scanner;

public class BaiTap1 {
	public BaiTap1() {
		Scanner sc = new Scanner(System.in);
		//String path = sc.nextLine();
		File file = new File(sc.nextLine());
		if(file.exists())
		{
			System.out.println(file.getName());
			System.out.println(file.length());
		}else
		{
			System.out.println("File ko ton tai!");
		}
	}
	public static void main(String[] args) {
		new BaiTap1();
	}
}
