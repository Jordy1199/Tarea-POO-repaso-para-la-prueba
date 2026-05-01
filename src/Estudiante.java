public class Estudiante {

    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Error: El código no puede estar vacío.");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            System.out.println("Error: El promedio debe estar entre 0 y 10.");
        } else {
            this.promedio = promedio;
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula <= 0) {
            System.out.println("Error: El valor de matrícula debe ser mayor que 0.");
        } else {
            this.valorMatricula = valorMatricula;
        }
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPromedio() { return promedio; }
    public double getValorMatricula() { return valorMatricula; }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public double calcularPagoFinal(double descuentoExtra) {
        return valorMatricula - descuentoExtra;
    }
}
