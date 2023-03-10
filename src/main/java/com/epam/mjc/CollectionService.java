package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).toList();
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(List::stream).min(Integer::compareTo);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce((n1, n2) -> n1 + n2).get();
    }
}
