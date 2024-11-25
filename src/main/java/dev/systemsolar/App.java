package dev.systemsolar;

import javax.naming.Context;

import dev.systemsolar.controllers.ControllerSolarSystem;
import dev.systemsolar.models.TypeOfPlanet;
import dev.systemsolar.models.modelPlanet;
import dev.systemsolar.views.viewSolarSystem;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        modelPlanet earth = new modelPlanet(
            "Earth", 
            1, 
            5.972E24, 
            1.08321E12, 
            12742, 
            150, 
            TypeOfPlanet.TERRESTRE, 
            true, 
            1, 
            1);

        modelPlanet jupiter = new modelPlanet(
            "Jupiter", 
            79, 
            1.898E27, 
            1.43128E15, 
            139820, 
            778, 
            TypeOfPlanet.GASEOSO, 
            true, 
            12, 
            0);

            

            modelPlanet[] planets = {earth, jupiter};

            ControllerSolarSystem controller = new ControllerSolarSystem(planets);
        
    }
}
