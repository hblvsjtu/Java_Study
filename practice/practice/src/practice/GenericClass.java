/**
 * 
 */
package practice;

/**
 * @author LvHongbin
 *
 */
public class GenericClass<T, U> {	//������
	private T first;
	private T second;
	
	public GenericClass() {
		first = null;
		second = null;
	}
	
	public GenericClass(T first, T second) {
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
	public void setFirst(T first) {
		this.first = first;
	}

	/**
	 * @return the second
	 */
	@SuppressWarnings("unchecked")
	public <S> S getSecond() {	//���ͷ���
		return (S) second;
	}

	/**
	 * @param second the second to set
	 */
	public void setSecond(T second) {
		this.second = second;
	}
	
}
