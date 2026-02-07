public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;
        int mod = a % b;

        boolean greater = a > b;
        boolean equal = a == b;

        boolean logic = (a > b) && (b > 0);

        a += 2;
        b--;

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(greater);
        System.out.println(equal);
        System.out.println(logic);
        System.out.println(a);
        System.out.println(b);
    }
}