package OopIdeas;

public class MyClass {
    private int value;
    public MyClass(int value) {
        this.value = value;
    }
    public String toString() {
        return "MyClass with value " + value;
    }


    //When you call toString() on an instance of MyClass, it will return a string representation you defined.
    //
    //String.valueOf() method:
    //The String.valueOf() method is a static method of the String class that can be used to convert various data types to their string representations. It can handle a wide range of primitive types and objects. For example:
    //
    //java
    //Copy code
    //int num = 42;
    //String numString = String.valueOf(num);
}
