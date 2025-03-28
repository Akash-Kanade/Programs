public class TemperatureConverter {
    public static void main(String[] args) {
      

        System.out.println( "Temperature in Fahrenheit : "+ toFahrenheit(25));

    

        System.out.println( "Temperature in Celsius : "+ toCelsius(77));

    }

   static double toFahrenheit(double temp)
    {
        return ((double) 9 /5) * temp + 32;
    }
   static double toCelsius(double temp)
    {
        return ((double) 5 /9) * (temp - 32);
    }
}
