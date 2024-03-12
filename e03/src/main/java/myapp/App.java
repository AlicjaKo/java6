package myapp;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static List<Integer> generateNumbers() {    
        return IntStream.rangeClosed(1, 100)
                        .boxed()
                        .collect(Collectors.toList());
      
    }

    public static int sumOfAll(Stream<Integer> stream) {
        return stream.mapToInt(el -> el)
                     .sum();
    }

    public static int sumOfEven(Stream<Integer> numbers) {
        return numbers.mapToInt(el -> el)
                      .filter(el -> el%2==0)
                      .sum();
    }

    public static int sumOfOdd(Stream<Integer> numbers) {
        return numbers.mapToInt(el -> el)
                      .filter(el -> !(el%2==0))
                      .sum();
    }

    public static double average(Stream<Integer> stream) {
        return stream.mapToDouble(el -> el)
                     .average()
                     .orElse(0);
    }

    public static int productOfEvenNumbers(Stream<Integer> stream) {
        return stream.mapToInt(el -> el)
                     .filter(el -> el%2==0)
                     .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> findLargest(Stream<Integer> stream) {
         return stream.max(Integer::compareTo);
    }

    public static Optional<Integer> findSmallest(Stream<Integer> stream) {
        return stream.min(Integer::compareTo);
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
