import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante e = new Estudiante();
        System.out.println("=== Datos del Estudiante ===");
        System.out.print("Código: ");
        e.setCodigo(sc.nextLine());
        System.out.print("Nombre: ");
        e.setNombre(sc.nextLine());
        System.out.print("Promedio: ");
        e.setPromedio(sc.nextDouble());
        System.out.print("Valor matrícula: ");
        e.setValorMatricula(sc.nextDouble());

        System.out.println("\n========== RESULTADO ==========");
        e.mostrarDatos();
        System.out.println("Promedio válido: " + e.validarPromedio());
        System.out.println("Pago final: $" + e.calcularPagoFinal());

        sc.close();
    }
}
