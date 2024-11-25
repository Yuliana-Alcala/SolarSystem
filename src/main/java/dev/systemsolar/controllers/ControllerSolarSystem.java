package dev.systemsolar.controllers;

import dev.systemsolar.models.modelPlanet;
import dev.systemsolar.views.viewSolarSystem;

public class ControllerSolarSystem {
    
    private modelPlanet[] planets;

    
    
    public ControllerSolarSystem(modelPlanet[] planets) {   
        this.planets = planets;        
        getAttributeOfPlanet();
        
    }
    
    public void getAttributeOfPlanet(){
        for (modelPlanet planet : planets) {
            String planetAttributes = planet.returnValueAttributeOfPlanets();
            double densityOfPlanet = planet.calculateDensityOfPlanet();
            boolean isAExterior = planet.determineIfPlanetIsExterior();

            viewSolarSystem.showAttributeOfPlanets(planetAttributes);
            viewSolarSystem.showDensityOfPlanet(densityOfPlanet);
            viewSolarSystem.showPlanetIsExterior(isAExterior);
            
        }
             
        
    }   


}
