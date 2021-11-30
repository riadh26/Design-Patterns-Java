public class Main {

    public static void main(String[] args) {
        Counter.getInstance().increment();
        Counter.getInstance().increment();
        Counter.getInstance().decrement();
        System.out.println("Counter value = " + Counter.getInstance().value());
    }
}
