class SwapExample {

    static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntWrapper x = new IntWrapper(5);
        IntWrapper y = new IntWrapper(10);

        swap(x, y);

        System.out.println("x = " + x.value + ", y = " + y.value);
    }
}

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}