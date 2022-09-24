package fuelinjection.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private static final RentCompany RENT_COMPANY = new RentCompany();
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return RENT_COMPANY;
    }

    public void addCar(final Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return cars.stream()
                .map(c -> c.getName() + " : " + (int) c.getChargeQuantity() + "리터" + NEWLINE)
                .collect(Collectors.joining());
    }
}
