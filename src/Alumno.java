
public class Alumno {

    //ATRIBUTOS
    String nombre;
    String apellidos;
    String curso;
    double nota1;
    double nota2;
    double nota3;

     //CONSTRUCTOR VACIO
     public Alumno(){
     }

    //CONSTRUCTOR
    public Alumno (String nombre, String apellidos, String curso, double nota1, double nota2, double nota3) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.curso=curso;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }

    //METODOS
    public void mostrarDatos(){
        System.out.println("----------INFORMACIÓN FINAL----------:");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("CURSO: "+curso);
        System.out.println("NOTA N°1: "+nota1);
        System.out.println("NOTA N°2: "+nota2);
        System.out.println("NOTA N°3: "+nota3);
    }

    public void calcularPromedio(){
        double promedio=(nota1+nota2+nota3)/3;
        System.out.println("PROMEDIO FINAL: "+promedio);
    }

}