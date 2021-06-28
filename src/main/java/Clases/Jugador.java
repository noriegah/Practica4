
package Clases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Jugador implements Serializable {
    private int id;
    private String nombre;
    private String apellido;

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Jugador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public void guardar() throws FileNotFoundException, IOException{   
        File file = new File("src/guardado");
        if(!file.exists())file.mkdirs();

        ObjectOutputStream salida=Saver.getInstance();
        salida.writeObject(this);
        System.out.println("\n\n Registros Almacenados.");
        salida.reset();  
    }
    
    public void cargar() throws FileNotFoundException, IOException, ClassNotFoundException{
        File file = new File("src/guardado");      
        
        if(file.exists()){
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("src/guardado/employee.obj"));
            ArrayList<Object> newData=new ArrayList<>();
            try{
                while(true){
                    newData.add(entrada.readObject());
                }                     
            }catch(IOException e){                
            }finally{
                entrada.close();  
                System.out.println(newData.size()+" Registros Cargados.\n\n");
                for(int i=0; i<newData.size(); i++){
                    System.out.println(((Jugador)newData.get(i)).getId());
                }
            }               
        }else{
            return;
        }        
    }

    
}
