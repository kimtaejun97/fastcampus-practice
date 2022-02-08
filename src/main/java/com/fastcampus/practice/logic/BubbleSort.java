package com.fastcampus.practice.logic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(final List<T> list) {
        final List<T> sorted = new ArrayList<>(list);

        for (int i = sorted.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sorted.get(j).compareTo(sorted.get(j + 1)) > 0) {
                    T temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }

}
