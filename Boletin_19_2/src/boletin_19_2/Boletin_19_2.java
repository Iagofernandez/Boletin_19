/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19_2;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotasAlumnos obx=new NotasAlumnos();
        int[] notas=new int[30];

        notas=obx.crearArray(notas);
        obx.mostrar(notas);
        obx.media(notas);
obx.listaNotas(notas);
    }
    
}
