package dev.systemsolar.controllers;

import dev.systemsolar.models.modelPlanet;
import dev.systemsolar.views.viewSolarSystem;

public class ControllerSolarSystem {
    
    private modelPlanet modelPlanet;

    
    
    public ControllerSolarSystem(modelPlanet planet) {   
        this.modelPlanet = planet;        
        getAttributeOfPlanet();
        
    }
    
    public void getAttributeOfPlanet(){
        
        String planetAttributes = String.format(
            "Name: %s\nSatellites: %d\nMass: %.2f\nVolume: %.2f\nDiameter: %d km\nDistance to Sun: %d km\nType: %s\nObservable with Naked Eye:%b\nOrbital Period: %d years\n Orbital Period %d days",
            modelPlanet.getName(),
            modelPlanet.getAmountSatellite(),
            modelPlanet.getMass(),
            modelPlanet.getVolume(),
            modelPlanet.getDiameter(),
            modelPlanet.getAverageDistanceToSun(),
            modelPlanet.getTypeOfPlanet(),
            modelPlanet.isObservableWithNakeEye(),
            modelPlanet.getOrbitalPeriodOfPlanetYears(),
            modelPlanet.getOrbitalPeriodOfPlanetDays()
        );
        
        double densityOfPlanet = modelPlanet.calculateDensityOfPlanet(modelPlanet.getMass(),modelPlanet.getVolume());
        boolean isAExterior = modelPlanet.determineIfPlanetIsExterior();

        viewSolarSystem.showAttributeOfPlanets(planetAttributes);
        viewSolarSystem.showDensityOfPlanet(densityOfPlanet);
        viewSolarSystem.showPlanetIsExterior(isAExterior);
        
    }

    


}
