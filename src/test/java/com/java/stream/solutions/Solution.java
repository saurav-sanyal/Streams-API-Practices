package com.java.stream.solutions;

import com.java.stream.practice.dependencies.Employee;
import com.java.stream.practice.dependencies.MyObject;
import com.java.stream.practice.dependencies.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Solution for Problem 1: Filter even numbers
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    // Solution for Problem 2: Filter numbers greater than 10
    public static List<Integer> filterGreaterThan10(List<Integer> numbers) {
        return numbers.stream().filter(n -> n > 10).collect(Collectors.toList());
    }

    // Solution for Problem 3: Filter strings that start with a vowel
    public static List<String> filterStringsStartingWithVowel(List<String> words) {
        return words.stream().filter(s -> s.matches("^[aeiouAEIOU].*")).collect(Collectors.toList());
    }

    // Solution for Problem 4: Filter positive numbers
    public static List<Integer> filterPositiveNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
    }

    // Solution for Problem 5: Filter non-empty strings
    public static List<String> filterNonEmptyStrings(List<String> words) {
        return words.stream().filter(s -> !s.isEmpty() && !s.trim().isEmpty()).collect(Collectors.toList());
    }

    // Solution for Problem 6: Filter null values from list of strings
    public static List<String> filterNullStrings(List<String> words) {
        return words.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    // Solution for Problem 7: Filter numbers divisible by 3
    public static List<Integer> filterDivisibleBy3(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 3 == 0).collect(Collectors.toList());
    }

    // Solution for Problem 8: Filter strings that contain a specific substring
    public static List<String> filterStringsContainingSubstring(List<String> words, String substring) {
        return words.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
    }

    // Solution for Problem 9: Filter list of people who are above 18 years old
    public static List<Person> filterAdults(List<Person> people) {
        return people.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
    }

    // Solution for Problem 10: Filter even-indexed elements from a list
    public static List<String> filterEvenIndexedElements(List<String> words) {
        return words.stream().filter(e -> words.indexOf(e) % 2 == 0).collect(Collectors.toList());
    }

    // Solution for Problem 11: Filter strings with length greater than 5
    public static List<String> filterLongStrings(List<String> words, int length) {
        return words.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }

    // Solution for Problem 12: Filter even numbers in a range
    public static List<Integer> filterEvenNumbersInRange(List<Integer> numbers, int start, int end) {
        return numbers.stream().filter(n -> n >= start && n <= end && n % 2 == 0).collect(Collectors.toList());
    }

    // Solution for Problem 13: Filter strings with specific prefix
    public static List<String> filterStringsWithPrefix(List<String> words, String prefix) {
        return words.stream().filter(s -> s.startsWith(prefix)).collect(Collectors.toList());
    }

    // Solution for Problem 14: Filter negative numbers
    public static List<Integer> filterNegativeNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n < 0).collect(Collectors.toList());
    }

    // Solution for Problem 15: Filter strings with more than two words
    public static List<String> filterStringsWithMoreThanTwoWords(List<String> phrases) {
        return phrases.stream().filter(p -> p.split(" ").length > 2).collect(Collectors.toList());
    }

    // Solution for Problem 16: Filter employees with salaries above 5000
    public static List<Employee> filterHighSalaryEmployees(List<Employee> employees) {
        return employees.stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList());
    }

    // Solution for Problem 17: Filter out duplicates from a list
    public static List<Integer> filterDuplicates(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    // Solution for Problem 18: Filter strings containing only digits
    public static List<String> filterStringsWithOnlyDigits(List<String> words) {
        return words.stream().filter(s -> s.matches("\\d+")).collect(Collectors.toList());
    }

    // Solution for Problem 19: Filter integers greater than the average
    public static List<Integer> filterGreaterThanAverage(List<Integer> numbers) {
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        return numbers.stream().filter(n -> n > average).collect(Collectors.toList());
    }

    // Solution for Problem 20: Filter strings containing a specific character
    public static List<String> filterStringsContainingCharacter(List<String> words, char character) {
        return words.stream().filter(s -> s.indexOf(character) >= 0).collect(Collectors.toList());
    }

    public static List<Integer> squareNumbersUsingMap(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<String> convertNamesToUppercase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> addPrefixToNames(List<String> names) {
        return names.stream()
                .map(name -> "Mr. " + name)
                .collect(Collectors.toList());
    }

    public static List<String> convertIntegersToStrings(List<Integer> numbers) {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public static List<Integer> multiplyNumbersByTen(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());
    }

    public static List<String> capitalizeFirstLetter(List<String> words) {
        return words.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.toList());
    }

    public static List<String> filterAndConvertEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    public static List<Integer> convertStringsToLengths(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static List<String> convertDatesToStrings(List<java.util.Date> dates) {
        return dates.stream()
                .map(date -> date.toString())
                .collect(Collectors.toList());
    }

    public static List<Integer> convertObjectsToIds(List<MyObject> objects) {
        return objects.stream()
                .map(MyObject::getId)
                .collect(Collectors.toList());
    }

}

