package practice;

import java.io.IOException;

import tool.IOFile;
import tool.MyStream;

/**
 * Description:
 * <br>网站: <a href="https://github.com/hblvsjtu/Java_Study">Java_Study</a>
 * <br>Copyright (C), 2017-2019, Lv Hongbin
 * <br>This program is protected by copyright laws.
 * <br>Program Name: HelloWorld
 * <br>Date: 2019-03-30
 * @author Lv Hongbin hblvsjtu@163.com
 * @version 1.0
 */

public class HelloWorld {

	static String s1 = "你好";
	enum Size {SAMLL, MEDIUM, LARGE, EXTRA_LARGE};
	/**
	 * Main 方法
	 * @param args
	 * @return none
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String s2 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(1 & 0b0000010);
		Size s = null;
        s = Size.MEDIUM;
        System.out.println(s);
        String greeting = "hello汗";
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
            System.out.println("none是空串");
        }else if(none != null && none.length() != 0) {
            System.out.println("none不是null也不是空串");
        }else {
            System.out.println("none是null");
        }
        long startTime, endTime;
        startTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis(); 
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        assert startTime > 0 : "startTime > 0";
        // 常规方法
        IOFile io = new IOFile("xiaoJuan");
        io.writeFile();
        io.inputFile();
        io.outputObject(new IOFile("abc"));
        io.intputObject();
        GenericClass<String, Integer> genericClassc = new GenericClass<String, Integer>();
        genericClassc.setFirst("first");
        genericClassc.setSecond(2);
        System.out.println(genericClassc.getFirst());
        System.out.println(genericClassc.<Integer>getSecond());
        MyStream myStream = new MyStream("lvhongbin/lvhongbin1/lvhongbin12/lvhongbin123/lvhongbin1234/lvhongbin12345", "/");
        myStream.countNumber(10);
        Worker w = new Worker(0);
        Thread t1 = new Thread(w, "t1");
        Thread t2 = new Thread(w, "t2");
        Thread t3 = new Thread(w, "t3");
        Thread t4 = new Thread(w, "t4");
        Thread t5 = new Thread(w, "t5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
	}
}
