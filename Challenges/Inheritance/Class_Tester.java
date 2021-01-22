public class Class_Tester {
    public static void main(String[] args) {
        Class_1 parent = new Class_1(10, 16);
        Class_2 child = new Class_2(1, 2, 3);

        System.out.println(parent);
        child.print();
        child.set(10, 10, 10);
        child.print();
    }
}