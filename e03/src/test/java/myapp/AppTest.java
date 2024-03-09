package myapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AppTest {

    @Test
    public void testGenerateNumbers() {
        List<Integer> numbers = App.generateNumbers();
        Assertions.assertEquals(100, numbers.size());
        Assertions.assertEquals(1, numbers.get(0));
        Assertions.assertEquals(100, numbers.get(99));
    }

    @Test
    public void testSumOfAll() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(15, App.sumOfAll(numbers));
    }

    @Test
    public void testSumOfEven() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(6, App.sumOfEven(numbers));
    }

    @Test
    public void testSumOfOdd() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(9, App.sumOfOdd(numbers));
    }

    @Test
    public void testAverage() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(3.0, App.average(numbers), 0.001);
    }

    @Test
    public void testProductOfEvenNumbers() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(8, App.productOfEvenNumbers(numbers));
    }

    @Test
    public void testFindLargest() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> max = App.findLargest(numbers);
        Assertions.assertTrue(max.isPresent());
        Assertions.assertEquals(5, max.get());
    }

    @Test
    public void testFindSmallest() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> min = App.findSmallest(numbers);
        Assertions.assertTrue(min.isPresent());
        Assertions.assertEquals(1, min.get());
    }
}
