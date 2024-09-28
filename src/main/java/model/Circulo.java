// PACKAGES
package model;

public class Circulo {

   // ATTRIBUTES
   private double raio;

   // CONSTRUCTORS
   public Circulo() {
      this(0);
   }

   public Circulo(double raio) {
      this.raio = raio;
   }

   // GETTERS AND SETTERS 
   public double getRaio() {
      return raio;
   }

   public void setRaio(double raio) {
      // VALIDATE
      if (raio < 0) {
         raio = 1;
      }

      this.raio = raio;
   }

   // AREA
   public double getArea() {
      return getRaio() * getRaio() * Math.PI;
   }
}
