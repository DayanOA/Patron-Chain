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
public interface Flujo {

    public void setNext(Flujo pFlujo);

    public Flujo getNext();

    public void solicitarPermiso(int pDiasPermiso);

}
