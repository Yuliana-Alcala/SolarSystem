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
            "Name: %s\nSatellites: %d\nMass: %.2f\nVolume: %.2f\nDiameter: %d km\nDistance to Sun: %d km\nType: %s\nObservable with Naked Eye: %b",
            modelPlanet.getName(),
            modelPlanet.getAmountSatellite(),
            modelPlanet.getMass(),
            modelPlanet.getVolume(),
            modelPlanet.getDiameter(),
            modelPlanet.getAverageDistanceToSun(),
            modelPlanet.getTypeOfPlanet(),
            modelPlanet.isObservableWithNakeEye()
        );
        
        double densityOfPlanet = modelPlanet.calculateDensityOfPlanet(modelPlanet.getMass(),modelPlanet.getVolume());

        viewSolarSystem.showAttributeOfPlanets(planetAttributes, densityOfPlanet);
        
        
    }

    


}
