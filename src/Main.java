import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Becado de Excelencia ---
        BecadoExcelencia be = new BecadoExcelencia();
        System.out.println("=== Datos del Becado de Excelencia ===");
        System.out.print("Código: ");
        be.setCodigo(sc.nextLine());
        System.out.print("Nombre: ");
        be.setNombre(sc.nextLine());
        System.out.print("Promedio: ");
        be.setPromedio(sc.nextDouble());
        System.out.print("Valor matrícula: ");
        be.setValorMatricula(sc.nextDouble());
        System.out.print("Porcentaje de beca (0-100): ");
        be.setPorcentajeBeca(sc.nextDouble());
        System.out.print("Bono de excelencia: ");
        be.setBonoExcelencia(sc.nextDouble());
        sc.nextLine();

        RegularConRecargo rcr = new RegularConRecargo();
        System.out.println("\n=== Datos del Estudiante Regular con Recargo ===");
        System.out.print("Código: ");
        rcr.setCodigo(sc.nextLine());
        System.out.print("Nombre: ");
        rcr.setNombre(sc.nextLine());
        System.out.print("Promedio: ");
        rcr.setPromedio(sc.nextDouble());
        System.out.print("Valor matrícula: ");
        rcr.setValorMatricula(sc.nextDouble());
        System.out.print("Número de materias: ");
        rcr.setNumeroMaterias(sc.nextInt());
        System.out.print("Recargo pendiente: ");
        rcr.setRecargoPendiente(sc.nextDouble());

        Estudiante e1 = be;
        Estudiante e2 = rcr;

        System.out.println("\n========== RESULTADOS ==========");
        e1.mostrarDatos();
        System.out.println("Pago final: $" + e1.calcularPagoFinal());
        System.out.println("--------------------------------");
        e2.mostrarDatos();
        System.out.println("Pago final: $" + e2.calcularPagoFinal());
        System.out.println("--------------------------------");

        sc.close();
    }
}