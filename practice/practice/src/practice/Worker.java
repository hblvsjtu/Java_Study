/**
 * 
 */
package practice;

/**
 * @author LvHongbin
 *
 */
public class Worker extends Thread {
	
	private int i;

	/**
	 * @param i
	 */
	public Worker(int i) {
		super();
		this.i = i;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		this.i++;
		System.out.println("由 " + Thread.currentThread().getName() + "计算，i的值为 " + i);
	}
	
}
