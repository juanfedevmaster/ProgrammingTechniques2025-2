/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterpatternexample;

import com.pasarelapago.Entities.*;

/**
 *
 * @author jufeq
 */
public class PagoAdapter implements IPagoAdapter{
    
    private final Bancolombia bancolombia;
    private final Davivienda davivienda;
    public PagoAdapter(){
        bancolombia = new Bancolombia();
        davivienda = new Davivienda();
    }
    
    @Override
    public void PagarFactura(double cantidadPago) {
        bancolombia.PagoBancolombia(cantidadPago);
    }

    @Override
    public void PagarFactura(double cantidadPago, int banco) {
        switch (banco) {
            case 1007:
                bancolombia.PagoBancolombia(cantidadPago);
                break;
            case (1051):
                davivienda.PagoDavivienda(cantidadPago);
            default:
                throw new AssertionError();
        }
    }
    
}
