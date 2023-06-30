//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества
// * и метод позволяющий читать элементы по индексу.
// * Реализовать все методы из семинара.
// Формат данных Integer.

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mySet = new Set();
        mySet.add(12);
        mySet.add(23);
        mySet.add(34);
        mySet.add(45);
        mySet.add(56);
        mySet.add(67);
        mySet.add(78);
        mySet.add(89);

        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(mySet.toString());
        System.out.println(mySet.elemByIndex(0));
        System.out.println(mySet.remove(78));
        System.out.println(mySet.size());
        System.out.println(mySet.isEmpty());
    }
}
class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VAL = new Object();

    // Метод 1: добавляет данные в множество
    public boolean add(E num) {
        return set.put(num, VAL) == null;
    }

    // Метод 2: toString возвращает строку с элементами множества
    public String toString(){
        return set.keySet().toString();
    }

    // Метод 3: извлекает данные из множества
    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }

    // Метод 4: позволяет читать элементы по индексу
    int elemByIndex(int index){
        return (Integer)set.keySet().toArray()[index];
    }

    // Метод 5: удаляет элемент из множества по его ключу
    public boolean remove(E num){
        return set.remove(num) == VAL;
    }

    // Метод 6: возвращает количество элементов множества
    public int size(){
        return set.size();
    }

    // Метод 7: возвращает истину, если множество пустое
    public boolean isEmpty(){
        return set.isEmpty();
    }
}