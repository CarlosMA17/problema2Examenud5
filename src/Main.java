import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salida = true;
        int opcion;
        String concepto;
        int importe;
        Scanner sc = new Scanner(System.in);
        LibroCuentas libro = new LibroCuentas();

        while (salida) {
            System.out.println("\nSeleccione una opción:\n" +
                    "\n" +
                    "1.\tAñadir un gasto.\n" +
                    "2.\tVer lista de gastos.\n" +
                    "3.\tCalcular gasto total.\n" +
                    "4.\tSalir.\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("introduzca el concepto del gasto que desea añadir:");
                    sc = new Scanner(System.in);
                    concepto = sc.nextLine();
                    System.out.println("introduce el importe del gasto que desea añadir:");
                    importe = sc.nextInt();
                    Gasto gasto = new Gasto(concepto, importe);
                    System.out.println("escribiendo el gasto en el libro...");
                    libro.añadirGasto(gasto);
                    System.out.println("gasto añadido");
                    break;
                case 2:
                    libro.mostrarGastos();
                    break;
                case 3:
                    String impresion = libro.toString();
                    libro.mostrarGastosYBorrar();
                    System.out.println(impresion);
                    break;
                case 4:
                    salida=false;
                    break;

            }
        }
    }
}
