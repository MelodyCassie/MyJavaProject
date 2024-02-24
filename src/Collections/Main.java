package Collections;

import BankPackage.Bank;

public class Main {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();

        list.add("1");

        list.add("2");

        list.add("melody");

        list.add(new Bank("Gtbank"));

        list.add(new ArrayList());


        Object element = list.remove(0);
        int number = (int)element;
        System.out.println(number);

    }

}
