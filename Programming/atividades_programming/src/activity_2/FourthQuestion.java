package activity_2;

public class FourthQuestion {
    public static void main(String[] args) {
        System.out.println("One to Ten");
        oneToTen();
        System.out.println();
        System.out.println("Ten to One");
        tenToOne();
    }

    public static void oneToTen() {
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }
    }
    public static void tenToOne() {
        for (int count = 10; count >= 1; count--) {
            System.out.println(count);
        }
    }
}
