package tax;

public class TaxCalculatorAlternative extends TaxCalculator{

@Override
    int calculateTax(Vehicle vehicle) {
        int tax = 0;
        int co2Emission = vehicle.getCo2Emissions();

        if(vehicle.getFuelType().equals(FuelType.PETROL)) {
            if (co2Emission == 0) { return tax; }
            else if (co2Emission <= 50) { tax = 0; }
            else if(co2Emission <= 75) { tax = 15; }
            else if (co2Emission <= 90) { tax = 95; }
            else if (co2Emission <= 100) { tax = 115; }
            else if (co2Emission <= 110) { tax = 135; }
            else if (co2Emission <= 130) { tax = 155; }
            else if (co2Emission <= 150) { tax = 195; }
            else if (co2Emission <= 170) { tax = 505; }
            else if (co2Emission <= 190) { tax = 820; }
            else if (co2Emission <= 225) { tax = 1230; }
            else if (co2Emission <= 255) { tax = 1750; }
            else { tax = 2060; }
        }

        return 0;
    }


 public Vehicle vehicle;
    public TaxCalculatorAlternative(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
