/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakinfo (){
        System.out.println ("=====================");
        System.out.println ( "Panjang : "+panjang);
        System.out.println ( "Lebar : "+lebar);
        System.out.println ("=====================");
    }
    
    double hitungluas (){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
}
