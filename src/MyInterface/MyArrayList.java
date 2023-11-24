package MyInterface;

public class MyArrayList {
    private Object[] data; // Internal array to store elements
    private int size; // Current size of the list

    public MyArrayList(int initialCapacity) {
        data = new Object[initialCapacity]; // Initialize array with initial capacity
        size = 0; // Initially, the list is empty
    }

    public void add(int index, Object element) {
        // Ensure capacity
        if (size == data.length) {
            // If the array is full, create a new larger array
            Object[] newData = new Object[data.length * 2];
            // Copy elements to the new array
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData; // Replace the old array with the new one
        }

        // Shift elements to make space for the new element
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = element; // Insert the new element at the specified index
        size++; // Increase the size of the list
    }

    public Object get(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index]; // Return the element at the specified index
    }

    // Implement other methods like remove, size, etc. as needed

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList(5);

        myList.add(0, 11);
        myList.add(1, 12);
        myList.add(2, 13);
        myList.add(3, 14);
        myList.add(4, 15);

        System.out.println(myList.get(3));



    }
}
