/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author Marquita
 */
public class Trabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double d, p, r;
        System.out.println("Insira quantidade padrão de ml por kg ");
        d = sc.nextDouble();
        System.out.println("Insira Peso do paciente ");
        p = sc.nextDouble();
        r = d * p;
        System.out.println("a dosagem é de " + r + "ml");

    }

}
