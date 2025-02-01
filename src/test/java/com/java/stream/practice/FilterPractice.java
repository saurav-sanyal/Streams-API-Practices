package com.java.stream.practice;


import com.java.stream.practice.dependencies.Employee;
import com.java.stream.practice.dependencies.Person;
import com.java.stream.solutions.Solution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FilterPractice {

    // Problem 1: Filter even numbers
    @Test
    @Disabled
    public void testFilterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = Solution.filterEvenNumbers(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 2: Filter numbers greater than 10
    @Test
    @Disabled
    public void testFilterGreaterThan10() {
        List<Integer> numbers = Arrays.asList(5, 15, 20, 8, 11);
        List<Integer> result = Solution.filterGreaterThan10(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 3: Filter strings that start with a vowel
    @Test
    @Disabled
    public void testFilterStringsStartingWithVowel() {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");
        List<String> result = Solution.filterStringsStartingWithVowel(words);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 4: Filter positive numbers
    @Test
    @Disabled
    public void testFilterPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4);
        List<Integer> result = Solution.filterPositiveNumbers(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 5: Filter non-empty strings
    @Test
    @Disabled
    public void testFilterNonEmptyStrings() {
        List<String> words = Arrays.asList("hello", "", "world", " ", "java");
        List<String> result = Solution.filterNonEmptyStrings(words);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 6: Filter null values from list of strings
    @Test
    @Disabled
    public void testFilterNullStrings() {
        List<String> words = Arrays.asList("apple", null, "banana", null, "cherry");
        List<String> result = Solution.filterNullStrings(words);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 7: Filter numbers divisible by 3
    @Test
    @Disabled
    public void testFilterDivisibleBy3() {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 7, 9);
        List<Integer> result = Solution.filterDivisibleBy3(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 8: Filter strings that contain a specific substring
    @Test
    @Disabled
    public void testFilterStringsContainingSubstring() {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
        List<String> result = Solution.filterStringsContainingSubstring(words, "ap");
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 9: Filter list of people who are above 18 years old
    @Test
    @Disabled
    public void testFilterAdults() {
        List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 16), new Person("Charlie", 20));
        List<Person> result = Solution.filterAdults(people);
        List<Person> expected = null; // TODO: Write the solution for expected value
        assertIterableEquals(expected, result);
    }

    // Problem 10: Filter even-indexed elements from a list
    @Test
    @Disabled
    public void testFilterEvenIndexedElements() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> result = Solution.filterEvenIndexedElements(words);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 11: Filter strings with length greater than 5
    @Test
    @Disabled
    public void testFilterLongStrings() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> result = Solution.filterLongStrings(words, 5);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 12: Filter even numbers in a range
    @Test
    @Disabled
    public void testFilterEvenNumbersInRange() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = Solution.filterEvenNumbersInRange(numbers, 3, 8);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 13: Filter strings with specific prefix
    @Test
    @Disabled
    public void testFilterStringsWithPrefix() {
        List<String> words = Arrays.asList("preach", "practice", "apple", "prefix");
        List<String> result = Solution.filterStringsWithPrefix(words, "pre");
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 14: Filter negative numbers
    @Test
    @Disabled
    public void testFilterNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -2, 3, 4, -5);
        List<Integer> result = Solution.filterNegativeNumbers(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 15: Filter strings with more than two words
    @Test
    @Disabled
    public void testFilterStringsWithMoreThanTwoWords() {
        List<String> phrases = Arrays.asList("hello world", "hi", "good morning", "how are you?");
        List<String> result = Solution.filterStringsWithMoreThanTwoWords(phrases);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 16: Filter employees with salaries above 5000
    @Test
    @Disabled
    public void testFilterHighSalaryEmployees() {
        List<Employee> employees = Arrays.asList(new Employee("John", 6000), new Employee("Jane", 4000));
        List<Employee> result = Solution.filterHighSalaryEmployees(employees);
        List<Employee> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 17: Filter out duplicates from a list
    @Test
    @Disabled
    public void testFilterDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 4, 2);
        List<Integer> result = Solution.filterDuplicates(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 18: Filter strings containing only digits
    @Test
    @Disabled
    public void testFilterStringsWithOnlyDigits() {
        List<String> words = Arrays.asList("123", "abc", "456", "789");
        List<String> result = Solution.filterStringsWithOnlyDigits(words);
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 19: Filter integers greater than the average
    @Test
    @Disabled
    public void testFilterGreaterThanAverage() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = Solution.filterGreaterThanAverage(numbers);
        List<Integer> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }

    // Problem 20: Filter strings containing a specific character
    @Test
    @Disabled
    public void testFilterStringsContainingCharacter() {
        List<String> words = Arrays.asList("hello", "world", "java", "code");
        List<String> result = Solution.filterStringsContainingCharacter(words, 'o');
        List<String> expected = null; // TODO: Write the solution for expected value
        assertEquals(expected, result);
    }
}
