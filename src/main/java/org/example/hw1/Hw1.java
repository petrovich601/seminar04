package org.example.hw1;

import java.util.LinkedList;
import java.util.Scanner;
/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        LinkedList<Integer> lsTmp = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ls.add(i);
        }
        scanner.close();
        System.out.println(ls);
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            lsTmp.addFirst(ls.pop());
        }
        System.out.println(lsTmp);
    }
}
