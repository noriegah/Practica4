
package Clases;

import chuidiang.ejemplos.objeto_fichero.MiObjectOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jugador implements Serializable {
    private String nombre;
    private String apellido;
    private int id;

    public Jugador(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void anhadeFichero ()
    {
        File file = new File("src/guardado");
        if(!file.exists())file.mkdirs();
        try
        {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(
                    new FileOutputStream("src/guardado/jugadores.obj",true));
            // Se hace el new fuera del bucle, sólo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().

            
            oos.writeUnshared(this);
            oos.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    
    
    public void guardar() throws FileNotFoundException, IOException{   
        File file = new File("src/guardado");
        if(!file.exists())file.mkdirs();

        /* salida=new ObjectOutputStream(new FileOutputStream("src/guardado/jugadores.obj",true));
        salida.writeObject(this);
        salida.close();
        */
        MiObjectOutputStream oos = null;

        try 
        {
            oos = new MiObjectOutputStream(
                    new FileOutputStream("src/guardado/jugadores.obj",true));
            // Se hace el new fuera del bucle, sólo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().

            
            oos.writeUnshared(this);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally 
        {
            if (oos != null)
            {
                try 
                {
                  
                    oos.close();
                    
                    System.out.println("Operación de escritura terminada");
                } 
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        }
    
    
}
