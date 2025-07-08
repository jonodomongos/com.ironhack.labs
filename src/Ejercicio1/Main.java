package Ejercicio1;

public class Main {
    public static void main(String[] args) {

/*
      ENUNCIADO EJERCICIO1
      Vais a crear una clase conductora (con main) que tenga las variables con:
      - vuestro nombre
      - vuestro apellido
      - vuestra edad
      - mensaje de bienvenida

      Tenéis que mostrar por consola:

      “MSGBIENVENIDA NOMBRE APELLIDOS, tienes EDAD años”
      Si eres mayor de 30 escribir “El tiempo pasa”, si no escribir “Eres muy joven!!”
*/

        String miNombre = "Jonatan";
        String miApellido = "Rodríguez";
        int miEdad = 33;
        String mensajeBienvenida = "Bienvenidos a mi primer programa.";

        enunciado1(mensajeBienvenida, miNombre, miApellido, miEdad);
        enunciado2(miEdad);
    }

    public static void enunciado1(String mensajeBienvenida, String miNombre, String miApellido, int miEdad) {
        System.out.println(mensajeBienvenida + " Me llamo " + miNombre + " " + miApellido + " y tengo " + miEdad + " años.");
    }

    public static void enunciado2(int miEdad) {
        System.out.println((miEdad > 30) ? "El tiempo pasa" : "Eres muy joven!!");

/*
      Alternativa con bucle if...else
      if (miEdad > 30) System.out.println("El tiempo pasa");
      else System.out.println("Eres muy joven!!");
*/
    }
}