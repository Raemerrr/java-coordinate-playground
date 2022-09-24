package fuelinjection.domain;

public class Sonata implements Car {
    private static final double distancePerLiter = 10;
    private final double tripDistance;

    public Sonata(final double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    public double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
