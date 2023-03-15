
package ejercicio_21_cap3;

import java.awt.geom.Area;
import java.lang.Math;
import javax.swing.JOptionPane;


public class Ejercicio_21_Cap3 {
 // atributos
    double Lado1,Lado2,Lado3,Peri,Area,SemiPeri;
    
    //Metodos
    public void Entrada (){
        Lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor Numerico DEl Lado"));
        Lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor Numerico DEl Lado"));
        Lado3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Valor Numerico DEl Lado"));

        Peri = Lado1+Lado2+Lado3;
        SemiPeri = (Lado1+Lado2+Lado3)/2;
        Area = Math.sqrt(SemiPeri * (SemiPeri - Lado1) * (SemiPeri - Lado2) * (SemiPeri - Lado3));
        
    }    
        
    public void Salida (){
        System.out.println("El Perimetro es: "+Peri+"\nEl Semiperimetro es:"+SemiPeri+"\nEl Area es: "+Area);
        JOptionPane.showMessageDialog(null,"El Perimetro es: "+Peri+"\nEl Semiperimetro es:"+SemiPeri+"\nEl Area es: "+Area);
    }        

   
    public static void main(String[] args) {
        Ejercicio_21_Cap3 Triangulo = new Ejercicio_21_Cap3();
        Triangulo.Entrada();
        Triangulo.Salida();        
    }
        // TODO code application logic he
    
}
