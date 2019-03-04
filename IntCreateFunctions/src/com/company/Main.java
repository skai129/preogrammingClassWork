package com.company;

public class Main {

    public static void main(String[] args) {
        // Function Name: MyPrintFunction
        // Inputs: none
        // What it should do: Print the message: "In MyPrintFunction"
        // Returns: nothing
        System.out.println("start of MyPrintFunction call:");
        MyPrintFunction();

        // Function Name: BobPrinter
        // Inputs: none
        // What it should do: Print the message: "bob bob bob bob bob"
        // Returns: nothing
        System.out.println("start of BobPrinter call:");
        BobPrinter();

        // Function Name: Add
        // Inputs: 2 integers (num1 and num2)
        // What it should do: add num1 and num2
        // Returns: the integer that is result of adding num1 and num2 together
        System.out.println("start of Add calls:");
        int sum = Add(1,2);
        System.out.println(sum);
        sum = Add(46,23);
        System.out.println(sum);
        sum = Add(102,4);
        System.out.println(sum);
        // Function Name: Sub
        // Inputs: 2 integers (num1 and num2)
        // What it should do: subtract num2 from num1
        // Returns: the integer that is result of subtracting num2 from num1
        System.out.println("start of Sub calls:");
        int difference = Sub(3,4);
        System.out.println(difference);
        difference = Sub(9,3);
        System.out.println(difference);
        difference =Sub(65,96);
        System.out.println(difference);
        // Function Name: Add1
        // Inputs: 1 integer
        // What it should do: add 1 to the integer
        // Returns: the new integer
        System.out.println("start of Add1 calls:");
        int sum2 = Add1(5);
        System.out.println(sum2);
        sum2 =Add1(419);
        System.out.println(sum2);
        sum2 = Add1(43);
        System.out.println(sum2);
    }
    static void MyPrintFunction(){
        System.out.println("In MyPrintFunction");
    }
    static void BobPrinter(){
        System.out.println("bob bob bob bob bob");
    }
    static int Add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    static int Sub(int num1, int num2){
        int difference = num2 - num1;
        return difference;
    }
    static int Add1(int integer){
        int sum = integer + 1;
        return sum;
    }
}
