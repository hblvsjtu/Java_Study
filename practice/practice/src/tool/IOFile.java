/**
 * 
 */
package tool;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author LvHongbin
 *
 */
public class IOFile {
	
	private String name;
	
	public IOFile() {
		this.name = "Lv Hongbin";
	}
	
	public IOFile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void modifyName(String name) {
		this.name = name;
	}
	
	public void scan() throws IOException{
		Scanner in = new Scanner(System.in);
        System.out.println("Please input your name：");
        String name = in.nextLine();
        String sex = in.next();
        int age = in.nextInt();
        System.out.println("\n" + name + "先生,\n性别：" + sex + ",\n年龄："+ age + ";\n密码："+ "。");
        in.close();
	}
	
	public void writeFile() throws IOException{
    	BigInteger[] big = {BigInteger.valueOf(1234567890L),BigInteger.valueOf(9876543210L)};
    	PrintWriter pw = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\PrintWriter.txt", "UTF-8");
    	pw.print("authod: " + this.name + "\r\n" + big[0].add(big[1]));
    	pw.close();
	}
	
	public void readFile() throws IOException{
		@SuppressWarnings("resource")
		Scanner file = new Scanner(Paths.get("C:\\Users\\Lv Hongbin\\Desktop\\StartWeChat.bat"), "UTF-8");
    	System.out.println("StartWeChat.bat: " + file.nextLine());
	}
}
