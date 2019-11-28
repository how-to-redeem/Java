//交换两个整数的值


package work;

public class swap {
    public static void main(String[] args){
        int arr[] ={10,20};
        swap(arr);
        System.out.println("交换后：arr ={"+arr[0]+"  "+arr[1]+"}");
    }
    public static void swap(int arr[]){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
