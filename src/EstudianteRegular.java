public class EstudianteRegular extends Estudiante {

    private int numeroMaterias;

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias <= 0) {
            System.out.println("Error: El número de materias debe ser mayor que 0.");
        } else {
            this.numeroMaterias = numeroMaterias;
        }
    }

    public int getNumeroMaterias() { return numeroMaterias; }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de materias: " + numeroMaterias);
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }

    @Override
    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }
}
