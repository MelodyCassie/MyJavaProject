package MyDynamicArray;

public class DynamicArray {
     //im declaring a few members
    int size;
    int capacity = 10;
    //then an array of objects named array
    Object[] array;

   // im creating an overloaded constructor
    public DynamicArray(){
        //now I instantiated a new fixed size array
        //with the default capacity
        this.array = new Object[capacity];
    }
    //im also creating an overloaded constructor
    // just in case the user passes in their own capacity that they would like to set
}
