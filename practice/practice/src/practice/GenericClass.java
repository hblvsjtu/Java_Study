/**
 * 
 */
package practice;

/**
 * @author LvHongbin
 *
 */
public class GenericClass<T, U> implements  Generic<String, Integer> {	//泛型类
	private T first;
	private U second;
	
	public GenericClass() {
		first = null;
		second = null;
	}
	
	public GenericClass(T first, U second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * @return the first
	 */
	public T getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	@SuppressWarnings("unchecked")
	public void setFirst(String first) {
		this.first = (T) first;
	}
	
	/**
	 * @return the second
	 */
	@SuppressWarnings("unchecked")
	public <S> S getSecond() {	//泛型方法
		return (S) second;
	}

	/**
	 * @param second the second to set
	 */
	@SuppressWarnings("unchecked")
	public void setSecond(Integer second) {
		this.second = (U) second;
	}
}
