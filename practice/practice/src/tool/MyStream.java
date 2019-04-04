/**
 * 
 */
package tool;

import java.util.Arrays;
import java.util.List;

/**
 * @author LvHongbin
 *
 */
public class MyStream extends IOFile{

	/**
	 * 
	 */

	private int count;
	private List<String> strList;
	public MyStream() {
		super();
		this.count = 0;
		this.strList = Arrays.asList(super.getName().split("/"));
	}
	
	public MyStream(String name, String splitChar) {
		super(name);
		this.count = 0;
		this.strList = Arrays.asList(super.getName().split(splitChar));
	}
	
	public void countNumber(int num) {
		for(String str: this.strList) {
			if(str.length() > num) {
				System.out.println(str);
				this.count ++;
			}
		}
		System.out.println("this.count = " + this.strList.stream().filter(w -> w.length() > num).count());
	}
}
