package dpc.templatemethod.demo;

public class Main {

    public static void main(String[] args) {

        Array<Integer> array = new Array<>();
        array.add(5);
        array.add(12);
        array.add(52);
        array.add(21);
        array.add(3); 
        System.out.println(array.find(5));    // true
        System.out.println(array.find(99));   // false

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addNode(5);
        list.addNode(12);
        list.addNode(52);
        list.addNode(21);
        list.addNode(3);
        System.out.println(list.find(52));   // true
        System.out.println(list.find(99));   // false
    }

}
