package tax;

public class TaxCalculatorImpl extends TaxCalculator {

    private boolean expensiveVehicleCalculatorFeatureToggle;
    private boolean featureSwitchJS;

    public TaxCalculatorImpl(int year) {
        super(year);
    }

    public TaxCalculatorImpl(int year, boolean expensiveVehicleCalculatorFeatureToggle, boolean featureSwitchJS) {
        super(year);
        this.expensiveVehicleCalculatorFeatureToggle = expensiveVehicleCalculatorFeatureToggle;
        this.featureSwitchJS = featureSwitchJS;
    }

    @Override
    int calculateTax(Vehicle vehicle) {
        int tax = 0;
        int co2Emission = vehicle.getCo2Emissions();
        String fuelType = vehicle.getFuelType().toString();

        if (expensiveVehicleCalculatorFeatureToggle && (this.getYear() - vehicle.getDateOfFirstRegistration().getYear()) >= 1) {

            if (vehicle.getListPrice() > 40000) {

                if (fuelType.equals(FuelType.PETROL.toString())) {
                    tax = 450;
                } else if (fuelType.equals(FuelType.ELECTRIC.toString())) {
                    tax = 310;
                } else if (fuelType.equals(FuelType.ALTERNATIVE_FUEL.toString())) {
                    tax = 440;
                }
            }

        } else if (featureSwitchJS && (this.getYear() - vehicle.getDateOfFirstRegistration().getYear()) >= 1) {

            if (fuelType.equals(FuelType.DIESEL.toString()) || fuelType.equals(FuelType.PETROL.toString())) {
                tax = 140;
            } else if (fuelType.equals(FuelType.ALTERNATIVE_FUEL.toString())) {
                tax = 130;
            } else if (fuelType.equals(FuelType.ELECTRIC.toString())) {
                tax = 0;
            }
        } else {
            if (vehicle.getFuelType().equals(FuelType.PETROL)) {
                if (co2Emission == 0) {
                    return tax;
                } else if (co2Emission <= 50) {
                    tax = 10;
                } else if (co2Emission <= 75) {
                    tax = 25;
                } else if (co2Emission <= 90) {
                    tax = 105;
                } else if (co2Emission <= 100) {
                    tax = 125;
                } else if (co2Emission <= 110) {
                    tax = 145;
                } else if (co2Emission <= 130) {
                    tax = 165;
                } else if (co2Emission <= 150) {
                    tax = 205;
                } else if (co2Emission <= 170) {
                    tax = 515;
                } else if (co2Emission <= 190) {
                    tax = 830;
                } else if (co2Emission <= 225) {
                    tax = 1240;
                } else if (co2Emission <= 255) {
                    tax = 1760;
                } else {
                    tax = 2070;
                }
            }

            if (vehicle.getFuelType().equals(FuelType.DIESEL)) {
                if (co2Emission == 0) {
                    return tax;
                } else if (co2Emission <= 50) {
                    tax = 25;
                } else if (co2Emission <= 75) {
                    tax = 105;
                } else if (co2Emission <= 90) {
                    tax = 125;
                } else if (co2Emission <= 100) {
                    tax = 145;
                } else if (co2Emission <= 110) {
                    tax = 165;
                } else if (co2Emission <= 130) {
                    tax = 205;
                } else if (co2Emission <= 150) {
                    tax = 515;
                } else if (co2Emission <= 170) {
                    tax = 830;
                } else if (co2Emission <= 190) {
                    tax = 1240;
                } else if (co2Emission <= 225) {
                    tax = 1760;
                } else {
                    tax = 2070;
                }
            }
        }
        return tax;
    }

}
