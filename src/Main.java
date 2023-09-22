public class Main
{
    public static void main(String[] args)
    {
//        // Створити кілька об'єктів класу. Запрограмувати роботу з об'єктами з застосування усіх методів класу.
//        Measurer gas1 = new Measurer("Gas1", "m3", "0.000",
//                "99999.000", 0.5, "Working");
//        gas1.getListing();
//
//        Measurer gas2 = new Measurer();
//        gas2.setStatus("Broken");
//        System.out.println(); gas2.getListing();

        Measurer m1 = new Measurer();
        m1.measure();
    }
}