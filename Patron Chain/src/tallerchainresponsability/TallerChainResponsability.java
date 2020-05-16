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
public class TallerChainResponsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Permiso permisito = new Permiso();

        permisito.solicitarPermiso(6);
        permisito.solicitarPermiso(1);
        permisito.solicitarPermiso(2);
        permisito.solicitarPermiso(3);
        permisito.solicitarPermiso(4);
        permisito.solicitarPermiso(5);
        permisito.solicitarPermiso(10);

    }

}
