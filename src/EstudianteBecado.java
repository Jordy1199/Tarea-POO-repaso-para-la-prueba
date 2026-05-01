public class EstudianteBecado extends Estudiante {

    private double porcentajeBeca;

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca < 0 || porcentajeBeca > 100) {
            System.out.println("Error: El porcentaje de beca debe estar entre 0 y 100.");
        } else {
            this.porcentajeBeca = porcentajeBeca;
        }
    }

    public double getPorcentajeBeca() { return porcentajeBeca; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje de beca: " + porcentajeBeca + "%");
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = getValorMatricula() * (porcentajeBeca / 100);
        return getValorMatricula() - descuento;
    }

    @Override
    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}