/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.conceptforge.exercicespoo.Exercice03;

import java.util.Scanner;

/**
 *
 * @author renob
 */
public class Exercice03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entez la hauteur du sapin : ");
        int hauteur = sc.nextInt();
        SapinV2 monBeauSapin = new SapinV2(hauteur);
        
    }
    
}
