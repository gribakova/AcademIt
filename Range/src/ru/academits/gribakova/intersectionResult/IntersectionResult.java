package ru.academits.gribakova.intersectionResult;

public class IntersectionResult {

    public double fromIntersection;
    public double toIntersection;

    public IntersectionResult(double fromIntersection, double toIntersection) {
        this.fromIntersection = fromIntersection;
        this.toIntersection = toIntersection;
    }

    public double getFromIntersection() {
        return fromIntersection;
    }

    public void setFromIntersection(double fromIntersection) {
        this.fromIntersection = fromIntersection;
    }

    public double getToIntersection() {
        return toIntersection;
    }

    public void setToIntersection(double toIntersection) {
        this.toIntersection = toIntersection;
    }
}
