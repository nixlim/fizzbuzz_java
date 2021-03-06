public class Fizzbuzz {
    public String fizzbuzz(int number) {
        if (number % 15 == 0) {
            return "Fizzbuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    public static void main (String [] args) {
        Fizzbuzz tester = new Fizzbuzz();
        for (int i = 0; i < 100; i++) {
            System.out.println(tester.fizzbuzz(i));
        }
    }
}
