package ru.academits.gribakova.range;

import ru.academits.gribakova.intersectionResult.IntersectionResult;

public class Range {
    private double from;
    private double to;
    private double from1;
    private double to1;

    public Range(double from, double to, double from1, double to1) {
        this.from = from;
        this.to = to;
        this.from1 = from1;
        this.to1 = to1;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getFrom1() {
        return from1;
    }

    public void setFrom1(double from1) {
        this.from1 = from1;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getTo1() {
        return to1;
    }

    public void setTo1(double to1) {
        this.to1 = to1;
    }

    public double getLength() {
        return to - from;
    }

    public double getLength1() {
        return to1 - from1;
    }

    public boolean isInside(double x) {
        return (x >= from && x <= to);
    }

    double fromIntersection;
    double toIntersection;

    IntersectionResult intersectionResult = new IntersectionResult(fromIntersection, toIntersection);

    public Object getIntersection(double from, double to, double from1, double to1) {
        if (from1 > from && from1 > to) {
            return null;
        }

        if ((from1 > from & to > from1) || (from == from1 & to == to1)) {
            fromIntersection = from1;
            toIntersection = to1;
        }

        if (from1 > from & to1 > to) {
            fromIntersection = from1;
            toIntersection = to;
        }

        if (from > from1 & to > to1) {
            fromIntersection = from;
            toIntersection = to1;
        }

        return new IntersectionResult(fromIntersection, toIntersection);
    }
}