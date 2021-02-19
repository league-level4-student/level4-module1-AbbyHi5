package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] tArray;
	int currentLoc = 0;
	
	public ArrayList() {
		
		tArray = (T[]) new Object[0];
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return tArray[loc];
	}
	
	public void add(T val) {
		T[] tArray2 = (T[]) new Object[tArray.length+1];
		tArray2[tArray2.length-1] = val; 
		
		for (int i = 0; i < tArray.length; i++) {
			tArray2[i] = tArray[i];
		}
		
		tArray = tArray2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] tArray2 = (T[]) new Object[tArray.length+1];
			for (int i = 0; i < tArray2.length; i++) {
				if (i < loc) {
					tArray2[i] = tArray[i];
				}	else if (i > loc) {
					tArray2[i] = tArray[i-1];
				} else {
					tArray2[i] = val;
				}
			}
			tArray = tArray2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		tArray[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] tArray2 = (T[]) new Object[tArray.length-1];
		
		for (int i = 0; i < tArray.length; i++) {

			if(i < loc) {
				tArray2[i] = tArray[i];
			}

			else if(i > loc) {
				tArray2[i-1] = tArray[i];
			}

			else {
				continue;
			}
		}
		tArray = tArray2;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < tArray.length; i++) {
			if (tArray[i].equals(val)) {
				return true;
			} 
		}
		return false;
	}
	
	public int size() {
		return tArray.length;
	}
}