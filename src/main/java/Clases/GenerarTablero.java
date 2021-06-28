/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dell
 */
public class GenerarTablero extends JButton{
    Button b1, b2, b3,b4,b5,b6,b7,b8,b9,b10;
    public GenerarTablero(int columnas, int filas){
        for(int i=0; i<columnas; i++){
            b1 = new Button("Boton 1");
            setBounds(columnas,filas,150,150);
            
        }
    }

}
