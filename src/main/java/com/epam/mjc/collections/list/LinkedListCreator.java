package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (var num : sourceList) {
            if (num % 2 == 1) {
                list.addFirst(num);
            } else {
                list.addLast(num);
            }
        }
        return list;
    }
}
