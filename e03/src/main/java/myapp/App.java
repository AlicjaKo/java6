package myapp;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static List<Integer> generateNumbers() {
        // TODO
    }

    public static int sumOfAll(Stream<Integer> stream) {
        // TODO
    }

    public static int sumOfEven(Stream<Integer> numbers) {
        // TODO
    }

    public static int sumOfOdd(Stream<Integer> numbers) {
        // TODO
    }

    public static double average(Stream<Integer> stream) {
        // TODO
    }

    public static int productOfEvenNumbers(Stream<Integer> stream) {
        // TODO
    }

    public static Optional<Integer> findLargest(Stream<Integer> stream) {
        // TODO
    }

    public static Optional<Integer> findSmallest(Stream<Integer> stream) {
        // TODO
    }

    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers();

        int sum = sumOfAll(numbers.stream());
        System.out.println("The sum of all the numbers: " + sum);

        sum = sumOfEven(numbers.stream());
        System.out.println("The sum of all even numbers is: " + sum);

        sum = sumOfOdd(numbers.stream());
        System.out.println("The sum of all odd numbers is: " + sum);

        double avg = average(numbers.stream());
        System.out.println("The avg of all the numbers is: " + avg);

        int product = productOfEvenNumbers(numbers.stream());
        System.out.println("The product of all the even numbers is: " + product);

        Optional<Integer> max = findLargest(numbers.stream());
        if (max.isPresent()) {
            System.out.println("The maximum numbers is: " + max.get());
        } else {
            System.out.println("Couldn't determine");
        }

        Optional<Integer> min = findSmallest(numbers.stream());
        if (min.isPresent()) {
            System.out.println("The maximum numbers is: " + min.get());
        } else {
            System.out.println("Couldn't determine");
        }
    }
}
