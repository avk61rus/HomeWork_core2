package ru.geekbrains.HomeWork_core2.lesson3;

import java.util.*;

public class MyCollection {

    public static void main(String[] args) {
        System.out.println("\n" + wordsSet);
        System.out.println(getWordsSet(wordsSet.split(" ")));
        System.out.println(WordsCount(wordsSet.split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "11111111111");
        phonebook.add("Петров", "2222222222");
        phonebook.add("Сидоров", "3333333333");
        phonebook.add("Кузнецов", "4444444444");
        phonebook.add("Иванов", "5555555555");
        phonebook.add("Сидоров", "6666666666");

        System.out.println("\n"+"телефон Иванов: " + phonebook.get("Иванов"));
        System.out.println("телефон Петров: " + phonebook.get("Петров"));
        System.out.println("телефон Сидоров: " + phonebook.get("Сидоров"));
        System.out.println("телефон Кузнецов: " + phonebook.get("Кузнецов"));
        System.out.println("Почемуто не получается вывести телфон методом getOrDefault?");
    }


    private static final String wordsSet = "one один " +
            "три " + "пять " + "четыре " + "три " + "пять " + "четыре " + "два " + "пять " + "три " + "четыре " +
            "пять " + "один " + "два " + "четыре " + "пять ";

    private static TreeSet<String> getWordsSet(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> WordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            map.put(word, map.getOrDefault(word, 0) + 1);
        } return map;
    }



}
