package main;
public class Estudiante{

//Atributos
    private String nombre;          
    private int edad;   
    private String asignatura;
    private char sexo;

//Constructor
    public Estudiante(String nombre, int edad, String asignatura, char sexo) {     
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
        this.sexo = sexo;
    }

//Métodos get y set
    public String getNombre() {
        return nombre;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }
    public String getAsignatura() {
       return asignatura;
    }
    public String setAsignatura(String asignatura) {
        this.asignatura = asignatura;
        return asignatura;
    }
    public char getSexo() {
        return sexo;
    }
    public char setSexo(char sexo) {
        this.sexo = sexo;
        return sexo;
    }


    public void presentarse(){
        System.out.println("Hola, me llamo " + nombre + ", tengo " + edad + " años, estudio " + asignatura + " y soy " + sexo);
    }

    public void despedirse(){
        System.out.println("Adiós, me llamo " + nombre + ", tengo " + edad + " años, estudio " + asignatura + " y soy " + sexo);
    }


}

