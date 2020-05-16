/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerchainresponsability;

/**
 *
 * @author Tonny
 */
public class Coordinador implements Flujo {

    private Flujo next;

    @Override
    public void setNext(Flujo pFlujo) {
        this.next = pFlujo;
    }

    @Override
    public Flujo getNext() {
        return this.next;
    }

    @Override
    public void solicitarPermiso(int pDiasPermiso) {
        if (pDiasPermiso == 1) {
            System.out.println("permiso Normal concedido por el coordinador " + "de " + pDiasPermiso + " dias \n");
        } else {
            this.next.solicitarPermiso(pDiasPermiso);
        }
    }

}
