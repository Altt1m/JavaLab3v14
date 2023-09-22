import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class Thermometer extends Measurer
{
    private double length;
    private double width;
    private double height;

    public Thermometer()
    {

    }

    public Thermometer(String name, String unit, String lowerLimit, String upperLimit,
                       double inaccuracy, String status, double length, double width, double height)
    {
        super(name, unit, lowerLimit, upperLimit, inaccuracy, status);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    protected void setValues()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFill the thermometer's fields, please.");
        System.out.print("Name: "); this.name = scanner.nextLine();
        System.out.print("Measuring unit: "); this.unit = scanner.nextLine();
        System.out.print("Lower limit: "); this.lowerLimit = scanner.nextLine();
        System.out.print("Upper limit: "); this.upperLimit = scanner.nextLine();
        System.out.print("Inaccuracy: "); this.inaccuracy = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: "); this.length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: "); this.width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: "); this.height = Double.parseDouble(scanner.nextLine());
        System.out.print("Status: "); this.status = scanner.nextLine();
        System.out.println(MessageFormat.format("Thermometer \"{0}\" successfully created.", this.name));
    }

    @Override
    public void getListing()
    {
        System.out.println("\nName: " + name);
        System.out.println("Measuring unit: " + unit);
        System.out.println("Lower limit: " + lowerLimit);
        System.out.println("Upper limit: " + upperLimit);
        System.out.println("Inaccuracy: " + inaccuracy);
        System.out.println("Status: " + status);
        System.out.println("Length " + length);
        System.out.println("Width " + width);
        System.out.println("Height " + height);
    }

    public static void calibrate() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Start calibration? y/n "); String answer = scan.nextLine();
        if (answer.equals("y"))
        {
            boot();
        }

    }

    private static void boot() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print("Calibrating."); Thread.sleep(400);
            System.out.print("."); Thread.sleep(400);
            System.out.print("."); Thread.sleep(400);
            System.out.println();
        }
        System.out.println("Success!");
    }

    @Override
    public void measure()
    {
        int units = new Random().nextInt(Integer.parseInt(lowerLimit), Integer.parseInt(upperLimit));
        System.out.println(MessageFormat.format("Thermometer \"{0}\" has {1} {2} shown on it.", this.name, units, this.unit));
    }

}
