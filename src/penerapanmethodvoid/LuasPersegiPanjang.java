/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapanmethodvoid;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class LuasPersegiPanjang {
    Scanner in = new Scanner(System.in);//input scanner
    double panjang, lebar, total;//variabel
    
    void input(){
        System.out.println("Masukkan panjamg Persegi Panjang :");
        panjang = in.nextDouble();
        
        System.out.println("Masukkan lebar Persegi Panjang");
        lebar = in.nextDouble();
    }
    void hitung(){
        total = panjang * lebar;
    }
    void hasil(){
        System.out.println("========================================");
        System.out.println("Hasuil Luas Persegi Panjang  :"+total);
    }
}
