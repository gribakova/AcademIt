package ru.academits.gribakova.range_main;

import ru.academits.gribakova.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало первого интервала:");
        double from = scanner.nextDouble();

        System.out.println("Введите конец первого интервала:");
        double to = scanner.nextDouble();

        System.out.println("Введите начало второго интервала:");
        double from1 = scanner.nextDouble();

        System.out.println("Введите конец второго интервала:");
        double to1 = scanner.nextDouble();

        System.out.println("Введите число:");
        double userNumber = scanner.nextDouble();

        Range range = new Range(from, to, from1, to1);

        System.out.println("Диапазон первого интервала: от " + range.getFrom() + " до " + range.getTo());
        System.out.println("Диапазон второго интервала: от " + range.getFrom1() + " до " + range.getTo1());
        System.out.println("Длина первого интервала: " + range.getLength());
        System.out.println("Длина второго интервала: " + range.getLength1());
        System.out.println("Число x = " + userNumber + ": " + range.isInside(userNumber));
        System.out.println("Интервал пересечения: " + range.getIntersection(from, to, from1, to1));
    }
}
