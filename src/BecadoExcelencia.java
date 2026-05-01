public class BecadoExcelencia extends EstudianteBecado {

    private double bonoExcelencia;

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia < 0) {
            System.out.println("Error: El bono de excelencia no puede ser negativo.");
        } else {
            this.bonoExcelencia = bonoExcelencia;
        }
    }

    public double getBonoExcelencia() { return bonoExcelencia; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bono de excelencia: $" + bonoExcelencia);
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return Math.max(pago, 0);
    }

    @Override
    public double calcularPagoFinal(double descuentoExtra) {
        double pago = super.calcularPagoFinal() - bonoExcelencia - descuentoExtra;
        return Math.max(pago, 0);
    }
}