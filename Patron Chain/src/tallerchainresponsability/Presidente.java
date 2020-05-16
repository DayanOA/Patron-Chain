/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerchainresponsability;

import java.util.Scanner;

/**
 *
 * @author Tonny
 */
public class Presidente implements Flujo {

    private Flujo next;
    private static Scanner sc = new Scanner(System.in);

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
        System.out.println("Desea permiso Normal o Especial");
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    System.out.print("Permiso Normal concedido por el presidente " + "de " + pDiasPermiso + " dias \n");
                    break;
                case 2:
                    System.out.print("Permiso Especial concedido por el presidente " + "de " + pDiasPermiso + " dias \n");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opc != 1 && opc != 2);

    }

    private static int menu() {
        System.out.print(
                "\n1. Permiso Normal"
                + "\n2. Permiso Especial \n"
        );
        return Integer.parseInt(sc.nextLine());
    }

}
