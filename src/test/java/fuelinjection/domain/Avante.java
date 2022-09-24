package fuelinjection.domain;

public class Avante implements Car {
    private static final double distancePerLiter = 15;
    private final double tripDistance;

    public Avante(final double tripDistance) {
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
        return "Avante";
    }
}
