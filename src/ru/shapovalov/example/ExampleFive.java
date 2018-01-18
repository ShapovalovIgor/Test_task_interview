package ru.shapovalov.example;

public class ExampleFive {
    private static class Foo<T> {
        T value1, value2;

        public void print() {
            System.out.println(value1);
            System.out.println(value2);
        }
    }

    public static <T> Foo<T> create(Object o1, Object o2) {
        Foo<T> result = new Foo<T>();
        result.value1 = (T) o1;
        result.value2 = (T) o2;
        return result;
    }

    public static void main(String[] args) {
        Double pi = 3.14;
        String hello = "hello";
        Foo<Integer> test = create(pi, hello);
        test.print();
    }
}
