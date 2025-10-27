/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package adapterpatternexample;

/**
 *
 * @author jufeq
 */
public interface IPagoAdapter {
    void PagarFactura(double cantidadPago);
    void PagarFacturaPorBanco(double cantidadPago, int banco);
}
