package Clases;
import Clases.Tablero;
import Ventanas.DatosJugar;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    
    private Tablero mTablero = new Tablero();
    
    public MainFrame() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(new BorderLayout());
        this.setSize( new Dimension(400, 300) );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(mTablero, BorderLayout.CENTER );
        DatosJugar f = new DatosJugar();
        //mTablero.setNumeroDeColumnas(f.colum);
        //mTablero.setNumeroDeFilas(f.fil);
        
        mTablero.inicializar();
                
    }
}
