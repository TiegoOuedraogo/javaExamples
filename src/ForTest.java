/*
Demonstrate the for loop.
Call this file "ForTest.java".
*/
class ForTest {
    public static void main(String args[]) {
        int x;
        for(x = 0; x<10; x = x+1)
            System.out.println("This is x: " + x);
        System.out.println("------------------------While looo------------------------");
        x = 1;
        while (x < 100){
            System.out.println("X is now: "+ x + " This is using while loop");
            x+=7;
        }
    }
}