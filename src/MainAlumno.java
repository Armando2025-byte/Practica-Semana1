import java.util.Scanner;

public class MainAlumno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // CREAR OBJETO
        Alumno alumno1 = new Alumno();

        // SOLCITAR DATOS
        System.out.print("INGRESE SU NOMBRE: ");
        alumno1.nombre = scan.nextLine();
        System.out.print("INGRESE SUS APELLIDOS: ");
        alumno1.apellidos = scan.nextLine();
        System.out.print("INGRESE EL CURSO: ");
        alumno1.curso = scan.nextLine();
        System.out.print("INGRESE NOTA N°1: ");
        alumno1.nota1 = scan.nextDouble();
        System.out.print("INGRESE NOTA N°2: ");
        alumno1.nota2 = scan.nextDouble();
        System.out.print("INGRESE NOTA N°3: ");
        alumno1.nota3 = scan.nextDouble();

        scan.close();

        // LLAMAR A LOS METODOS
        alumno1.mostrarDatos();
        alumno1.calcularPromedio();

    }
}