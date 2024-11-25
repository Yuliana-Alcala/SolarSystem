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
        modelPlanet venus = new modelPlanet("venus", 2,2.5,3.52,5,8,TypeOfPlanet.GASEOSO, true,4,6);

        modelPlanet jupiter = new modelPlanet("jupiter", 2,2.5,3.52,5,8,TypeOfPlanet.GASEOSO, true,4,6);

            

        ControllerSolarSystem controller = new ControllerSolarSystem(venus);
        
    }
}
