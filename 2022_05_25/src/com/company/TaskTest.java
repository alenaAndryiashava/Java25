package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testRemoveDublicates() {
        List<Character> actual = Arrays.asList('a','b','c','c','b','a','a','f');
        List<Character> expected = Arrays.asList('a','b','c','f');

        assertEquals(expected, Task.removeDuplicates(actual));
    }
    @Test
    void testRemoveDuplicates_no_duplicates() {
        List<Character> actual = Arrays.asList('a','b','c','f');
        List<Character> expected = Arrays.asList('a','b','c','f');

        assertEquals(expected, Task.removeDuplicates(actual));
    }
    @Test
    void testWordsByNumberOccurrence() {
        Map<String,Integer> expected = new HashMap<>();
        List<String> actual = Arrays.asList("true","abc","def","true","abc","true");
        expected.put("abc",2);
        expected.put("def",1);
        expected.put("true",3);
        assertEquals(expected, Task.wordsByNumberOccurrence(actual));
    }
    @Test
    void testWordsByNumberOccurrence_empty() {
        Map<String,Integer> expected = new HashMap<>();
        List<String> words = Arrays.asList();
        assertEquals(expected, Task.wordsByNumberOccurrence(words));
    }
    @Test
    void testWordsByNumberOccurrence_twoWords() {
        Map<String, Integer> expected = new HashMap<>();
        List<String> actual = Arrays.asList("abc", "abc");
        expected.put("abc", 2);
        assertEquals(expected, Task.wordsByNumberOccurrence(actual));
    }

    @Test
    void testJoinTwoLists() {
        List<String> list1 = Arrays.asList("a", "b","b");
        List<String> list2 = Arrays.asList("c", "d","a","b");
        Set<String> expected = new HashSet<>();
        expected.add("b");
        expected.add("a");
        assertEquals(expected,Task.joinTwoLists(list1,list2));
    }
    @Test
    void testFindNonUniquePerson() {
        Person person1 = new Person(1,"Person 1");
        Person person2 = new Person(2,"Person 2");
        Person person3 = new Person(3,"Person 3");
        Person person4 = new Person(1,"Person 4");
        List<Person> persons = Arrays.asList(person1,person2,person3,person4);
        assertEquals(person1, Task.findNonUniquePerson(persons));

    }
    @Test
    void testFindNonUniquePersonHashSet() {
        Person person1 = new Person(1, "Person 1");
        Person person2 = new Person(2, "Person 2");
        Person person3 = new Person(3, "Person 3");
        Person person4 = new Person(1, "Person 4");
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);
        assertEquals(person1, Task.findNonUniquePersonHashSet(persons));
    }
    @Test
    void testIsListCyclic() {
        List<String> list1 = Arrays.asList("word1", "word2", "word3", "word4");
        List<String> list2 = Arrays.asList("word3", "word4", "word1", "word2");
        assertTrue(Task.isListCyclic(list1, list2));

        List<String> list3 = Arrays.asList("word4", "word3", "word2", "word1");
        assertFalse(Task.isListCyclic(list1, list3));
    }

}