/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02;

/**
 *
 * @author Lenovo
 */
public class RectangleAksi {
    public static void main (String []args ){
        Rectangle rl = new Rectangle ();
        rl.panjang = 9;
        rl.lebar = 3;
        
        rl.cetakinfo();
        System.out.println("Luas rectangle = " +rl.hitungluas ());
    
}
}
