package co.educational;
import co.managerial.Test1;


public class Test2 {

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println("sub ="+obj.subtract(5, 3));
        System.out.println("mul ="+obj.multiply(5, 3));
        System.out.println("factorial ="+obj.fact(5));
        System.out.println("reverse digit ="+obj.reverseDigits(567));
    }


}
