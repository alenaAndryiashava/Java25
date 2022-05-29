package com.company;

import java.util.*;

public class Task {
    //1. Given a List . Implement a method that will remove all adjacent
    // identical characters, leaving only one.
    //For example: {a,,b,c,c,b,a,a,a,f} -> {a,,b,c,a,f}

    public static List<Character> removeDuplicates(List<Character> input){
        Set<Character> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

    //2.Given a List of words. Implements the method that return the Map where key
    // is a word and the value is how many times the word appears in the list.
    public static Map<String,Integer> wordsByNumberOccurrence(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for (String word :words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }else map.put(word,1);
        }
        return  map;

    }
    //3 Given two lists of String.
    // Implement the method that returns a set of strings that are present in both lists.
    public static Set<String> joinTwoLists(List<String> list1, List<String> list2){
        Set <String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>();
        for (String string:list2){
            if (set1.contains(string)){
                set2.add(string);
            }
        }
        return set2;
    }
    //4. Given a List . Person has unique int id and name.
    // All persons in the list except one are unique.
    // Implements the method that finds a non-unique Person in the list.
    // Implement this task all ways you know and evaluate the time and
    // space complexity of each way.
    public static Person findNonUniquePerson(List<Person> personList){ //O(n)2
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            for (int j = i+1; j < personList.size(); j++) {
                if (person.equals(personList.get(j))) {
                    return person;
                }
            }
        }
        return null;
    }
    public static Person findNonUniquePersonHashSet(List<Person> personList){ //O(n)
        Set<Person> personSet = new HashSet<>();
        for (Person person:personList) {
            if (personSet.contains(person)) {
                return person;
            }
            personSet.add(person);
        }
        return null;
    }

    //5. Given two lists of String. Implement the method that checks if one list is cyclic version
    // of the other. For example:
    //{word1, word2, word3, word4} , { word3, word4, word1, word2} -> true
    //{word1, word2, word3, word4} , { word4, word3, word2, word1} -> false

    public static boolean isListCyclic(List<String>list1,List<String>list2){
        int j = 0;
        for (; j < list2.size(); j++) {
            if(list2.get(j).equals(list1.get(0))){
                break;
            }
        }
        for (int i = 0; i < list1.size(); i++,j++) {
            j = j == list2.size() ? 0 : j;
            if(!list1.get(i).equals(list2.get(j))){
                return false;
            }
        }

        return true;
    }

}
