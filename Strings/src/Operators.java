public class Operators {
    public static void main(String[] args) {
        System.out.println("a"+"b");
        System.out.println('a'+'b');
        System.out.println((char)('a'+22));

        System.out.println("A"+1);
        //this is same as after a few steps: "A"+"1"
        //integer will be converted to Integer that will call toString()

        System.out.println();

    }
}
