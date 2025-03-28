public class Persona {
    String nombre;
    int edad;

    //Constructor
    public Persona(String nombre, int edad){
        this.nombre= nombre;
        this.edad= edad;
    };

    //Metodo para saludar
    public void saludar(){
        System.out.println("Hola mi nombre es "+nombre+" y tengo "+edad+" años.");
    };

    //Metodo main
    public static void main(String[] args) {
        //Crear Objeto
        Persona persona1=new Persona("Armando", 25);
        //Llamamos al método saludar
        persona1.saludar();
    }

}
