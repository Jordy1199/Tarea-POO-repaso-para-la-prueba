public class RegularConRecargo extends EstudianteRegular {

    private double recargoPendiente;

    public void setRecargoPendiente(double recargoPendiente) {
        if (recargoPendiente < 0) {
            System.out.println("Error: El recargo pendiente no puede ser negativo.");
        } else {
            this.recargoPendiente = recargoPendiente;
        }
    }

    public double getRecargoPendiente() { return recargoPendiente; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Recargo pendiente: $" + recargoPendiente);
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargoPendiente;
    }

    @Override
    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
