//Packages

//Write a program to define functions for subtract, multiply, divide, factorial and reversing the digits of a number in a package, import this class in another package and use all the methods defined in the primary package


package co.managerial;

public class Test1
{
    public int subtract(int a, int b){
        return a - b;
    }
  public int multiply(int a, int b){
        return a * b;
    }
   public int fact(int n){
       int factorial = 1;

       for(int i=1; i <= n; i++){
           factorial = factorial * i;

       }
       return factorial;
   }
   public int reverseDigits(int num){
        int rev = 0;
        int last;

      while(num > 0) {
            last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
       return rev;
   }

}
