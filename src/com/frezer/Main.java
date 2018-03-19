package com.frezer;

public class Main {

    public static void main (String [] args) {

        String[] cities = {"Albany","Buffalo","Chicago","Denver","Eastport"};
        double[] temperatures ={33,44,-23,89,0};

        findCityTemp(cities,temperatures,0,0,cities[0],cities[0],0, 0);


    } // end main
    public static void findCityTemp (String[]cities, double[]temperature, double max,double min, String cityHigh,
                                    String cityLow,double tempHigh,double tempLow) {

        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i] > max) {
                max = temperature[i];
                cityHigh = cities[i];
                tempHigh =  temperature[i];
            } // end if
            if (temperature[i] < min) {
                min = temperature[i];
                cityLow = cities[i];
                tempLow = temperature[i];
            }// end if
        } // end for

        System.out.println( "The city with the highest temperature is "+cityHigh+ " with a temperature of " +tempHigh);
        System.out.println("The city with the lowest temperature is "+cityLow+ " with a temperature of " +tempLow);

    } // end findMaxCity

} // end class
