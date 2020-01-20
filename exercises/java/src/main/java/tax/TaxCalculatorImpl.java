package tax;

public class TaxCalculatorImpl extends TaxCalculator {

    public TaxCalculatorImpl(int year) {
        super(year);
    }

    @Override
    int calculateTax(Vehicle vehicle) {
         int tax = 0;
         int co2Emission = vehicle.getCo2Emissions();

         if (co2Emission == 0) { return tax; }
         else if (co2Emission <= 50) { tax = 10; }
         else if(co2Emission <= 75) { tax = 25; }
         else if (co2Emission <= 90) { tax = 105; }
         else if (co2Emission <= 100) { tax = 125; }
         else if (co2Emission <= 110) { tax = 145; }
         else if (co2Emission <= 130) { tax = 165; }
         else if (co2Emission <= 150) { tax = 205; }
         else if (co2Emission <= 170) { tax = 515; }
         else if (co2Emission <= 190) { tax = 830; }
         else if (co2Emission <= 225) { tax = 1240; }
         else if (co2Emission <= 255) { tax = 1760; }
         else { tax = 2070; }

        return tax;
    }
}
