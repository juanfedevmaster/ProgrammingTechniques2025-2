/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterpatternexample;

import com.pasarelapago.Entities.Bancolombia;
import com.pasarelapago.Entities.Davivienda;
import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class AdapterPatternExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        IPagoAdapter pagoAdapter = new PagoAdapter();
        System.out.println("Ingrese código del banco");
        int codigoBanco = scan.nextInt();
        pagoAdapter.PagarFactura(10000,codigoBanco);
    }
    
}
