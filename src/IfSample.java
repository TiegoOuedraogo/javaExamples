/*
Demonstrate the if.
Call this file "IfSample.java".
*/
class IfSample {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 20;
        if(x < y)
            System.out.println("X is :" + x + " and Y is: " + y + "\n therfore x is less than y");
        x = x * 2;
        if(x == y) System.out.println("X is :" + x + " and Y is: " + y + "\n therfore now equal to y");

        x = x * 2;
        if(x > y) System.out.println("X is :" + x + " and Y is: " + y + "\n therfore now greater than y");
        // this won't display anything
        if(x == y) System.out.println("X is :" + x + " and Y is: " + y + "\n therfore you won't see this");
    }
}
