package Clases;

import Ventanas.DatosJugar;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Tablero extends JPanel implements ComponentListener , ActionListener {
    DatosJugar d = new DatosJugar();
    private JButton[][] mCasillas = null ;
    DatosJugar f = new DatosJugar();
    private int mNumeroDeFilas=8;
    
    private int mNumeroDeColumnas=8;
    
    private int mSeparacion = 2 ; 
    
    public void acomodar() {
        
        int ancho = this.getWidth();
        
        int alto = this.getHeight();
        
        int dimensionMenor = Math.min( ancho , alto ); 
        
        int anchoDeCasilla = dimensionMenor / mNumeroDeColumnas ; 
        
        int altoDeCasilla = dimensionMenor / mNumeroDeFilas ;
        
        int xOffset = (ancho - dimensionMenor) / 2 ; 
        
        int yOffset = (alto - dimensionMenor) / 2 ; 
        
        for( int fila = 0 ; fila < mNumeroDeFilas ; fila ++ ) {
            
            for( int columna = 0 ; columna < mNumeroDeColumnas ; columna ++ ) {
                
                JButton temp = mCasillas[fila][columna] ;                            
                
                temp.setBounds(xOffset + columna * anchoDeCasilla, yOffset + fila * altoDeCasilla, anchoDeCasilla - mSeparacion, altoDeCasilla - mSeparacion );
                            
            }
            
        }
        
        
        
    }
    public Tablero() {        
        
        this.setBackground(Color.BLACK);
        
        this.addComponentListener(this);
        
        this.setLayout(null);                
        
    }

    public void inicializar() {
        
        mCasillas = new JButton[mNumeroDeFilas][mNumeroDeColumnas];
        
        for( int fila = 0 ; fila < mNumeroDeFilas ; fila ++ ) {
            
            for( int columna = 0 ; columna < mNumeroDeColumnas ; columna ++ ) {
                
                JButton temp = new JButton();
                temp.setBackground(Color.orange);
                temp.addActionListener(this);
                
                temp.setText( fila + "," + columna );                            
                
                mCasillas[fila][columna] = temp;                        
                
                this.add(temp);
                
            }
                
            
        }
    }

    public void componentResized(ComponentEvent e) {
        
        this.acomodar();
        
    }

    public void componentMoved(ComponentEvent e) {
    }

    public void componentShown(ComponentEvent e) {
    }

    public void componentHidden(ComponentEvent e) {
    }

    public void setNumeroDeFilas(int mNumeroDeFilas) {
        this.mNumeroDeFilas = mNumeroDeFilas;
    }

    public int getNumeroDeFilas() {
        return mNumeroDeFilas;
    }

    public void setNumeroDeColumnas(int mNumeroDeColumnas) {
        this.mNumeroDeColumnas = mNumeroDeColumnas;
    }

    public int getNumeroDeColumnas() {
        return mNumeroDeColumnas;
    }

    private Random r = new Random();
    
    private Color getRandColor() {
    
        return new Color( r.nextInt(255), r.nextInt(255), r.nextInt(255) );
        
    }

    public void actionPerformed(ActionEvent e) {        
        
        if( e.getSource() instanceof JButton ) {
            
            JButton temp = (JButton) e.getSource() ;
            
            temp.setBackground(Color.green);
            
        }
        
    }
    
    public void Fichas(){
    
}
}
