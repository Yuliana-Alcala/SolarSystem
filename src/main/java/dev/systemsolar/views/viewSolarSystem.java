package dev.systemsolar.views;

public class viewSolarSystem{

   public static void  showAttributeOfPlanets(String planet){
        System.out.println("-------------------- Atributos del Planeta ----------------");
        System.out.println(planet);
       

   }

   public static void  showDensityOfPlanet(double densityOfPlanet){
     
      System.out.println("-------------------- Densidad del Planeta ----------------");
      System.out.println(densityOfPlanet);

 }


   public static void showPlanetIsExterior(boolean isExterior){
      System.out.println("-------------------- Planeta exterior? ----------------");
      if (isExterior) 
         System.out.println("El Planeta es Exterior");
      else
         System.out.println("El Planeta no es exterior");

   }

}
