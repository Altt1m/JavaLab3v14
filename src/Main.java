public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
//        // Створити кілька об'єктів класу. Запрограмувати роботу з об'єктами з застосування усіх методів класу.
//        Measurer gas1 = new Measurer("Gas1", "m3", "0.000",
//                "99999.000", 0.5, "Working");
//        gas1.getListing();
//
//        Measurer gas2 = new Measurer();
//        gas2.setStatus("Broken");
//        System.out.println(); gas2.getListing();


        Thermometer thermo1 = new Thermometer("Thermo1", "", "34", "43",
                                            0.1, "Off", 18, 1.7, 0.8);
        thermo1.getListing();

        Thermometer thermo2 = new Thermometer();

        thermo1.measure(); thermo2.measure();
        Thermometer.calibrate();
        Thermometer.switchThermalUnit();
        thermo1.getListing();
        thermo2.getListing();
        thermo1.measure(); thermo2.measure();
        Thermometer.switchThermalUnit();
        thermo1.getListing();
        thermo2.getListing();
    }



}