// Filename: Temperature.java
public class Temperature {
    public static void main(String[] args) { // Changed from String args to String[] args
        double fahr = 62.5;
        // Convert Fahrenheit to Celsius
        double celsius = f2c(fahr); // No need to cast to float
        System.out.println(fahr + "F = " + celsius + "C");
    }

    // Changed parameter type from float to double
    static double f2c(double fahr) { // Also made this method static
        return (fahr - 32) * 5 / 9;
    }
}