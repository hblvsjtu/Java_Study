package practice;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Description:
 * <br>��վ: <a href="https://github.com/hblvsjtu/Java_Study">Java_Study</a>
 * <br>Copyright (C), 2017-2019, Lv Hongbin
 * <br>This program is protected by copyright laws.
 * <br>Program Name: HelloWorld
 * <br>Date: 2019-03-30
 * @author Lv Hongbin hblvsjtu@163.com
 * @version 1.0
 */

public class HelloWorld {

	static String s1 = "���";
	enum Size {SAMLL, MEDIUM, LARGE, EXTRA_LARGE};
	/**
	 * Main ����
	 * @param args
	 * @return none
	 */
	public static void main(String[] args) {
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
        
//        Scanner in = new Scanner(System.in);
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
