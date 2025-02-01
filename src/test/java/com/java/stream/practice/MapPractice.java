package com.java.stream.practice;

import com.java.stream.practice.dependencies.MyObject;
import com.java.stream.solutions.Solution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapPractice {

    // Problem 1: Square a list of numbers using map
    @Test
    @Disabled
    public void testSquareNumbersUsingMap() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        // TODO: Add expected value for squared numbers
        List<Integer> expected = null;
        List<Integer> result = Solution.squareNumbersUsingMap(numbers);
        assertEquals(expected, result);
    }

    // Problem 2: Convert a list of names to uppercase using map
    @Test
    @Disabled
    public void testConvertNamesToUppercase() {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        // TODO: Add expected value for names in uppercase
        List<String> expected = null;
        List<String> result = Solution.convertNamesToUppercase(names);
        assertEquals(expected, result);
    }

    // Problem 3: Add prefix "Mr. " to a list of names
    @Test
    @Disabled
    public void testAddPrefixToNames() {
        List<String> names = Arrays.asList("Smith", "Jones", "Taylor");
        // TODO: Add expected value for names with the prefix "Mr."
        List<String> expected = null;
        List<String> result = Solution.addPrefixToNames(names);
        assertEquals(expected, result);
    }

    // Problem 4: Convert a list of integers to strings using map
    @Test
    @Disabled
    public void testConvertIntegersToStrings() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        // TODO: Add expected value for the string representation of integers
        List<String> expected = null;
        List<String> result = Solution.convertIntegersToStrings(numbers);
        assertEquals(expected, result);
    }

    // Problem 5: Multiply each number in a list by 10 using map
    @Test
    @Disabled
    public void testMultiplyNumbersByTen() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        // TODO: Add expected value for the numbers multiplied by 10
        List<Integer> expected = null;
        List<Integer> result = Solution.multiplyNumbersByTen(numbers);
        assertEquals(expected, result);
    }

    // Problem 6: Capitalize the first letter of each string in a list
    @Test
    @Disabled
    public void testCapitalizeFirstLetter() {
        List<String> words = Arrays.asList("hello", "world", "java");
        // TODO: Add expected value for capitalized first letter of each word
        List<String> expected = null;
        List<String> result = Solution.capitalizeFirstLetter(words);
        assertEquals(expected, result);
    }

    // Problem 7: Filter even numbers and convert them to strings
    @Test
    @Disabled
    public void testFilterAndConvertEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // TODO: Add expected value for even numbers as strings
        List<String> expected = null;
        List<String> result = Solution.filterAndConvertEvenNumbers(numbers);
        assertEquals(expected, result);
    }

    // Problem 8: Convert a list of strings to their lengths
    @Test
    @Disabled
    public void testConvertStringsToLengths() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        // TODO: Add expected value for the lengths of the strings
        List<Integer> expected = null;
        List<Integer> result = Solution.convertStringsToLengths(words);
        assertEquals(expected, result);
    }

    // Problem 9: Convert Date objects to their string representation
    @Test
    @Disabled
    public void testConvertDatesToStrings() {
        List<java.util.Date> dates = Arrays.asList(new java.util.Date(), new java.util.Date(), new java.util.Date());
        // TODO: Add expected value for the string representation of the dates
        List<String> expected = null;
        List<String> result = Solution.convertDatesToStrings(dates);
        assertEquals(expected, result);
    }

    // Problem 10: Convert a list of objects to their IDs
    @Test
    @Disabled
    public void testConvertObjectsToIds() {
        List<MyObject> objects = Arrays.asList(new MyObject(1), new MyObject(2), new MyObject(3));
        // TODO: Add expected value for the list of IDs
        List<Integer> expected = null;
        List<Integer> result = Solution.convertObjectsToIds(objects);
        assertEquals(expected, result);
    }
}
