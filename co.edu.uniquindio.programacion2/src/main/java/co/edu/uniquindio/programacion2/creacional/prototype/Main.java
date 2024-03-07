package co.edu.uniquindio.programacion2.creacional.prototype;

import co.edu.uniquindio.programacion2.creacional.prototype.model.CuentaAHImpl;

public class Main {

    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);

		/*if (cuentaClonada != null) {
			System.out.println(cuentaClonada);
		}
		System.out.println(cuentaClonada == cuentaAhorro);*/
    }
}
