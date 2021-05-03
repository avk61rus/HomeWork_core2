package ru.geekbrains.HomeWork_core2.lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {


    private final Map<String, Set<String>> recording = new TreeMap<>();

    public  void  add(String subscriber, String phoneNumber) {
        Set<String> phones = getPhones(subscriber);
        phones.add(phoneNumber);
    }
    private Set<String> getPhones(String subscriber) {
//        return  recording.getOrDefault(subscriber, new HashSet<>());
        return  recording.computeIfAbsent(subscriber, key -> new HashSet<>());
    }

    public Set<String> get(String subscriber) {return  getPhones(subscriber);}
}





