// Demonstrate char data type.
/*
* The range of a char is 0 to 65,536. There are no
* negative chars. The standard set of characters known as
* ASCII still ranges from 0 to 127 as
* always, and the extended 8-bit character set, ISO-Latin-1,
* ranges from 0 to 255.
* */
class CharDemo {
    public static void main(String args[]) {
        char ch1, ch2;
        ch1 = 88; // code for X
        ch2 = 'Y';
        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}