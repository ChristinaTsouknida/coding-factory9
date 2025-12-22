package gr.aueb.cf.cf9.ch17.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        var evenNumbers3 = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toArray();

        List<String> cities = List.of("Athens", "Berlin", "Paris", "Tokyo");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var filteredArr = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .toArray();

    }
}
