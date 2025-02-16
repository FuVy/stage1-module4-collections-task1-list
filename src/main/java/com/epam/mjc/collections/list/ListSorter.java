package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        var numA = Integer.parseInt(a);
        var numB = Integer.parseInt(b);
        var absA = Math.abs(numA);
        var absB = Math.abs(numB);
        if (absA > absB) {
            return 1;
        }
        if (absB > absA) {
            return -1;
        }
        if (numA < 0) {
            return -1;
        }
        if (numB < 0) {
            return 1;
        }
        return 0;
    }
}
