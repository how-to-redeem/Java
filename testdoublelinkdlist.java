package oj;

public class testdoublelinkdlist {
    public static void main(String[] args){
    DoubleLinkedList test = new DoubleLinkedList();
    test.addLast(1);
    test.addLast(2);
    test.addLast(2);
    test.addLast(3);
    test.addLast(4);
    test.print();
    test.remove(2);
    test.print();
}
}