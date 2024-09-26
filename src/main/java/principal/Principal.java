// PACKAGES
package principal;


// IMPORTS
import model.Triangulo;
import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		// INSTAINTIATE
		Triangulo tri = new Triangulo();
		
		
		// COLECT
		tri.setBase(Double.parseDouble(JOptionPane.showInputDialog("Base")));
		tri.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura")));
		
		
		// OUTPUT
		JOptionPane.showMessageDialog(null, "Area " + tri.getArea());
	}

}
