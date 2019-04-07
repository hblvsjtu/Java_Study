/**
 * 
 */
package tool;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author LvHongbin
 *
 */
public class IOFile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5803708790623734526L;
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
	
	public void inputFile() throws IOException{
		PushbackInputStream pin = new PushbackInputStream(	// 可回推用于预览
				new BufferedInputStream(
						new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt")
				)
		);
		int b = pin.read();
		if(b == '1') {
			pin.unread(b);	//回退
			System.out.println("123.txt: " + "//回退");
		}
		DataInputStream din = new DataInputStream(pin);
    	System.out.println("123.txt: " + din.read() + " " + din.read());
    	din.close();
	}
	
	public void outputObject(Object obj) throws IOException{
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt"));
		output.writeObject(obj);
		output.flush();
		output.close();
	}
	
	public void intputObject() throws IOException{
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\Lv Hongbin\\Desktop\\123.txt"));
		try {
			IOFile str = (IOFile) input.readObject();
			System.out.println(str.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		input.close();
	}
}
