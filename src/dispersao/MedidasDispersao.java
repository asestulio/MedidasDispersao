/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersao;

import dispersao.calculos.CalculosVarianciaDesvioPadrao;

public class MedidasDispersao {

 
    public static void main(String[] args) {
        int[] numerosArray = {1, 2, 3, 4, 5, 6};

        CalculosVarianciaDesvioPadrao vdp = new CalculosVarianciaDesvioPadrao(numerosArray, true);
        vdp.retornarSumario();
        

        System.out.println("\n\n");

        int[] numerosArray2 = {10, 12, 45, 66, 12, 11, 5};
        CalculosVarianciaDesvioPadrao vdp2 = new CalculosVarianciaDesvioPadrao(numerosArray2, false);
        vdp2.retornarSumario();
        
    }

}
