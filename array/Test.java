package array;

/**
 * @Author: yuisama
 * @Date: 2019/12/3 21:04
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        // {1,10,2,3,4,0}
        myArray.add(1,10);
        myArray.remove(4);
        myArray.print();

    }
}
