
public interface BoardInterface<T> {
	
	boolean add(T newEntry);
	boolean add(int newPosition,T newEntry);
	boolean remove(int position);
	boolean replace(int position, T newEntry);
	void clearAll();
	T getData(int position);
	boolean searchData(int position);
	boolean searchData(T entry);
	
	void arrangeAlphabet(T list);
	void arrangeScore(T list);
	
}
