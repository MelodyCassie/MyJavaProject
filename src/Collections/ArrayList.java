package Collections;

public class ArrayList {
    private Object[] elements;

    public ArrayList(){
        elements = new Object[8];

    }
    public Object add(Object element){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == null) elements[i] = element;

        }
        return element;
    }

    public Object remove(int index ){
        return elements[index];
    }
}
