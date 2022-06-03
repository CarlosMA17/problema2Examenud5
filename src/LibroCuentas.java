import java.util.ArrayList;

public class LibroCuentas {
    ArrayList gastos = new ArrayList();



    public ArrayList getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList gastos) {
        this.gastos = gastos;
    }

    public void añadirGasto(Gasto gasto) {
        gastos.add(0, gasto);
    }

    public void eliminarGasto() {
        gastos.remove(0);
    }

    public void mostrarGastos() {
        for (int i = 0; i < gastos.size(); i++) {
            System.out.println(gastos.get(i));
        }
    }

}
