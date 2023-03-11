package Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Виведення на екран елементів List:
// Створити список, заповнити його на 10 елементів та вивести на екран вміст, використовуючи iterator.
public class MyList {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(26);
        al.add(33);
        al.add(41);
        al.add(58);
        al.add(64);
        al.add(72);
        al.add(81);
        al.add(97);
        al.add(103);
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            System.out.print(temp + " ");
        }
    }
}
