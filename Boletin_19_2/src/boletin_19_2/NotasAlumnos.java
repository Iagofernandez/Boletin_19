/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class NotasAlumnos {
      public int[] crearArray(int[]lista){
        for(int i=0;i<lista.length;i++){
            lista[i]=(int) (Math.random()*10)+1;
        }
        return lista;
    }
    public void mostrar(int[] lista){
        int aprob=0,susp=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>=5){
                aprob++;
            }
            else{
                susp++;
            }
        }
        JOptionPane.showMessageDialog(null,"Los aprobados son: "+ aprob+"\nLos suspensos son: "+ susp);
    }
    public void media(int[] lista){
        int media=0;
        for(int i=0;i<lista.length-1;i++){
            media=media+lista[i];
        }
        media=media/lista.length;
        JOptionPane.showMessageDialog(null,"La media es: "+media);
    }
    public void listaNotas(int[] lista){
        int mejorNota=0;
        for (int i=0;i<lista.length-1;i++){
            if(lista[i]>mejorNota){
            mejorNota=lista[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Mejor nota de toda la clase"+ mejorNota);
    }
}

