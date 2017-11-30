
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso Aguerrido
 */
public class max_min {
    
    public static void deber4() {
        
        int num, max = 0, min = 0, suma = 0, promedio=0;
 
        for (int i = 1; i < 11; i++) {
          
            num=Integer.parseInt(JOptionPane.showInputDialog(i+" INGRESE UN NUMERO"));            
            if (min != 0 && max != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                min = num;
                max = num;
            }
            suma = suma +num;
            promedio = suma/10;
        }
        JOptionPane.showMessageDialog(null,"Numero Maximo: " + max + 
                "\nNumero Minimo: " + min + "\nPromedio: " + promedio);
        
    }
    
}
