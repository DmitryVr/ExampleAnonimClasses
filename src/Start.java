public class Start {

    private static class Popcorn {
        void doSomething() {
            System.out.println("version1");
        }

        void doSomething2() {
            System.out.println("old class");
        }
    }

    public static void main(String[] args) {

        Popcorn popcorn = new Popcorn() { // создается класс, который extends от Popcorn, но не имеет имени
            @Override
            void doSomething() {
                System.out.println("version2");
            }
        };

        popcorn.doSomething();
        popcorn.doSomething2();

        // реализация интерфейса
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        comparable.compareTo(new Object());


        method(new Popcorn() { // изменение при вызове метода
            @Override
            void doSomething() {
                System.out.println("bla");
            }
        });

    }

    static void method(Popcorn popcorn) {
        popcorn.doSomething();
    }
}
