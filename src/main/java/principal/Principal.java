// PACKAGES
package principal;

// IMPORTS
import model.Triangulo;
import model.Circulo;
import javax.swing.JOptionPane;

public class Principal {

   public static void main(String[] args) {
      // INSTAINTIATE
      Triangulo tri = new Triangulo();
      Circulo cir = new Circulo();

      // COLECT
      tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Base")));
      tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura")));
      cir.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Raio do círculo")));

      // OUTPUT
      JOptionPane.showMessageDialog(null, "Area do triângulo " + tri.getArea());
      JOptionPane.showMessageDialog(null, "Area do círculo " + cir.getArea());
   }

}
