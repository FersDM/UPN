package Sesion01;

import javax.swing.JOptionPane;

public class Ejemplo05 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        String apaterno = JOptionPane.showInputDialog("Ingresa tu apellido paterno");
        String amaterno = JOptionPane.showInputDialog("Ingresa tu apellido materno");

        JOptionPane.showMessageDialog(null, "Estimado(a) " + nombre + " " + apaterno + " " + amaterno + " muy pronto seras un JavaLover.");
    }
}
