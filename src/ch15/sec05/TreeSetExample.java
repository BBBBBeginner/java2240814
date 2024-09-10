package ch15.sec05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        System.out.println(scores);

        System.out.println("scores = " + scores.getFirst());
        System.out.println("scores = " + scores.getLast());
        System.out.println("scores = " + scores.lower(95));
        System.out.println("scores = " + scores.higher(95));
        System.out.println("scores = " + scores.floor(95));
        System.out.println("scores = " + scores.ceiling(95));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        System.out.println(descendingSet);

        NavigableSet<Integer> range1 = scores.tailSet(80, true);
        System.out.println(range1);

        NavigableSet<Integer> subSet = scores.subSet(80, true, 90, false);
        System.out.println(subSet);

    }
}