package main;

public class main {
   
    public static void main (String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, "Matemáticas", 'M');
        estudiante1.presentarse();
        estudiante1.despedirse();

        Estudiante estudiante2 = new Estudiante("Luis", 22, "Física", 'H');
        estudiante2.presentarse();
        estudiante2.despedirse();

        estudiante2.setNombre("Luis Miguel");
        estudiante2.presentarse();
        estudiante2.despedirse();

    }

      
}
