/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver {
    static ObjectOutputStream salida;
    
    static ObjectOutputStream getInstance() throws FileNotFoundException, IOException{
        if(salida==null){
            salida = new ObjectOutputStream(new FileOutputStream("src/guardado/jugadores.obj", true));
        }
        return salida;
    }
    
    public static void closeStream() throws IOException{
        salida.close();
    }
}
