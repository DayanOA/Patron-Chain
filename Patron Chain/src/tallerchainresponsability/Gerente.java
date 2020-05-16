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
public class Gerente implements Flujo {

    private static Scanner sc = new Scanner(System.in);
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

        if (pDiasPermiso > 3 && pDiasPermiso <= 5) {

            System.out.println("Desea permiso Normal o Especial");
            int opc;
            do {
                opc = menu();
                switch (opc) {
                    case 1:
                        System.out.print("Permiso Normal concedido por el Gerente " + "de " + pDiasPermiso + " dias \n");
                        break;
                    case 2:
                        this.next.solicitarPermiso(pDiasPermiso);
                        break;

                    default:
                        System.out.println("Opción inválida. \n");
                }

            } while (opc != 1 && opc != 2);

        } else {
            this.next.solicitarPermiso(pDiasPermiso);
        }
    }

    private static int menu() {
        System.out.print(
                "\n1. Permiso Normal"
                + "\n2. Permiso Especial \n"
        );
        return Integer.parseInt(sc.nextLine());
    }

}
