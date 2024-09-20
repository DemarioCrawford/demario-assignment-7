package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	// instantiate the object array and create a field for the size
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		// iterate through the objects and double the list in size
		if (size == items.length) {
			resizeArray();
		}
		items[size] = item;
		size++;
		return true;
	}

	private void resizeArray() {
		Object[] newRappers = new Object[items.length * 2];
		System.arraycopy(items, 0, newRappers, 0, items.length);
		items = newRappers;
	}

	@Override
	public int getSize() {

		return size;
	}

	@Override
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index > 0 && index < size) {
			return (T) items[index];
		}
		return null;
	}

	@Override
	public boolean remove(T item) {
		
		return false;
	}

	@Override
	public boolean contains(T item) {
		for (int i = 0; i < size; i++) {
			if (items[i].equals(item)) {
				return true;
			}
		}
		return false;
	}

}
