/**
 * 
 */
package practice;


import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author LvHongbin
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	static String s1 = "���";
	enum Size {SAMLL, MEDIUM, LARGE, EXTRA_LARGE};
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String s2 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(1 & 0b0000010);
		Size s = null;
        s = Size.MEDIUM;
        System.out.println(s);
        String greeting = "hello��";
        String str = greeting.substring(0,3) + "lo";
        System.out.println(str);
        System.out.println(greeting);
        String all = String.join("/", "S", "M", "A", "L", "L");
        System.out.println(all);
        System.out.println(str.equals(greeting));
        System.out.println(str == greeting);
        System.out.println(greeting.codePointCount(0, greeting.length()));
        System.out.println(greeting.charAt(1));
        String none = "";
        if(none != null && none.length() == 0) {
            System.out.println("none�ǿմ�");
        }else if(none != null && none.length() != 0) {
            System.out.println("none����nullҲ���ǿմ�");
        }else {
            System.out.println("none��null");
        }
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis(); 
        System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");
        // ���淽��
        
        Scanner in = new Scanner(System.in);
//        System.out.println("Please input your name��");
//        String name = in.nextLine();
//        String sex = in.next();
//        int age = in.nextInt();
//        String line = in.nextLine();
//        System.out.println("\n" + name + "����,\n�Ա�" + sex + ",\n���䣺"+ age + ";\n���룺"+ "��");
        try {
        	@SuppressWarnings("resource")
			Scanner file = new Scanner(Paths.get("C:\\Users\\Lv Hongbin\\Desktop\\StartWeChat.bat"), "UTF-8");
        	System.out.println("StartWeChat.bat: " + file.nextLine());
        	PrintWriter pw = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\PrintWriter.txt", "UTF-8");
        	pw.print("PrintWriter");
        	pw.close();
        }catch(Exception e) {
        	System.out.println("Exception e: " + e);
        }finally{
        	
        }
        try {
        	int[] arrayInt = new int[]{1, 2 , 3, 4, 5};
            @SuppressWarnings("resource")
    		PrintWriter outputArray = new PrintWriter("C:\\Users\\Lv Hongbin\\Desktop\\outputArray.txt", "UTF-8");
            for(int element: arrayInt) {
                outputArray.println(element);
            }
            outputArray.close();
        }catch(Exception e) {
        	System.out.println("Exception e: " + e);
        }finally {
        	
        }
	}
}
