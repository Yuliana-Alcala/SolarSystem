package dev.systemsolar.models;


public class modelPlanet {

    private String name = null;
    private int amountSatellite = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int averageDistanceToSun = 0;
    private TypeOfPlanet typeOfPlanet;
    private boolean observableWithNakeEye = false;
    

    public modelPlanet(String name, int amountSatellite, double mass, double volume, int diameter, int averageDistanceToSun,
            TypeOfPlanet typeOfPlanet, boolean observableWithNakeEye) {
        this.name = name;
        this.amountSatellite = amountSatellite;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.typeOfPlanet = typeOfPlanet;
        this.observableWithNakeEye = observableWithNakeEye;
    }

    

    public String getName() {
        return name;
    }



    public int getAmountSatellite() {
        return amountSatellite;
    }



    public double getMass() {
        return mass;
    }



    public double getVolume() {
        return volume;
    }



    public int getDiameter() {
        return diameter;
    }



    public int getAverageDistanceToSun() {
        return averageDistanceToSun;
    }



    public TypeOfPlanet getTypeOfPlanet() {
        return typeOfPlanet;
    }



    public boolean isObservableWithNakeEye() {
        return observableWithNakeEye;
    }



    public String returnValueAttributeOfPlanets() {
        return String.format(
            "Name: %s\nSatellites: %d\nMass: %.2f\nVolume: %.2f\nDiameter: %d km\nDistance to Sun: %d km\nType: %s\nObservable with Naked Eye: %b",
            name, amountSatellite, mass, volume, diameter, averageDistanceToSun, typeOfPlanet, observableWithNakeEye
        );
    }

    public double calculateDensityOfPlanet(double mass, double volume){
        double densityOfPlanet = mass / volume;
        return densityOfPlanet;

    }

    public boolean determineIfPlanetIsExterior(){
        double beltAsteroide = 3.4;
        boolean isExterior;
        if (getAverageDistanceToSun() > beltAsteroide){

             isExterior = true;
        }else{
             isExterior = false;
        }

        return isExterior;       
    
    }
    
    

}



/*-


-:
-orbitalPeriodOfPlanetYears():
-orbitalPeriodOfPlanetDays():*/

