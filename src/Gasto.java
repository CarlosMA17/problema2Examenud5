public class Gasto {
    public String concepto;
    public int importe;

    public Gasto(String concepto, int importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Gasto con concepto: " + concepto + '\n' +
                " importe: " + importe +
                " euros ||\n";
    }
}
