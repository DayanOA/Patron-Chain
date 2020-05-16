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
public class Permiso implements Flujo {

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

        Coordinador coordinador = new Coordinador();
        Director director = new Director();
        Gerente gerente = new Gerente();
        Vicepresidente vicepresidente = new Vicepresidente();
        Presidente presidente = new Presidente();

        this.next = coordinador;

        coordinador.setNext(director);
        director.setNext(gerente);
        gerente.setNext(vicepresidente);
        vicepresidente.setNext(presidente);

        this.next.solicitarPermiso(pDiasPermiso);
    }

}
