package fuelinjection.domain;

public class K5 implements Car {
    private static final double distancePerLiter = 13;
    private final double tripDistance;

    public K5(final double tripDistance) {
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
        return "K5";
    }
}
