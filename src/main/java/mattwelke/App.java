package mattwelke;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var money = AutoValueMoney.create("CAD", 100);
        System.out.println("Money: " + money);
    }
}
