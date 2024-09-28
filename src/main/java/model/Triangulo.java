// PACKAGES
package model;

public class Triangulo {
   // ATRIBUTES

   private double base;
   private double altura;

   // CONSTGRUCTOR
   public Triangulo() {
      this(0, 0);
   }

   public Triangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
   }

   // Geters and seters
   public double getBase() {
      return base;
   }

   public double getAltura() {
      return altura;
   }

   public void setBase(double base) {
      if (base < 0) {
         base = 1;
      }

      this.base = base;
   }

   public void setAltura(double altura) {
      if (altura < 0) {
         altura = 1;
      }
      this.altura = altura;
   }

   // CALCULATE THE AREA
   public double getArea() {
      return (getBase() * getAltura()) / 2;
   }

}
