package practice;

import java.io.IOException;
import tool.IOFile;

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
        assert startTime > 0 : "startTime > 0";
        // ���淽��
        IOFile io = new IOFile("xiaoJuan");
        io.writeFile();
        GenericClass<String, Integer> genericClassc = new GenericClass<String, Integer>();
        genericClassc.setFirst("first");
        genericClassc.setSecond("second");
        System.out.println(genericClassc.getFirst());
        System.out.println(genericClassc.<String>getSecond());
        
	}
}
