package desafio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();

        // Agregar las personas en un listado
        ArrayList<Persona> listadoPersonas = new ArrayList<>();
        listadoPersonas.add(persona1);
        listadoPersonas.add(persona2);
        listadoPersonas.add(persona3);
        listadoPersonas.add(persona4);
        listadoPersonas.add(persona5);

        // Imprimir por consola las personas
        System.out.println("Imprimo las personas: ");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        System.out.println(persona5 + "\n");

        // Imprimir el listado de personas
        System.out.println("Imprimo el listado de personas: ");
        System.out.println(listadoPersonas + "\n");

        // Imprimir el listado de personas ordenado por nombre
        System.out.println("Imprimo el listado de personas ordenado por nombre:");
        ArrayList<Persona> listadoOrdenadoPorNombre = Persona.sortPersonas(listadoPersonas, "nombre");
        System.out.println(
                listadoOrdenadoPorNombre.get(0).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(1).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(2).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(3).getNombre() + " - " +
                listadoOrdenadoPorNombre.get(4).getNombre() + "\n"
        );

        // Imprimir el listado de personas ordenado por apellido
        System.out.println("Imprimo el listado de personas ordenado por apellido:");
        ArrayList<Persona> listadoOrdenadoPorApellido = Persona.sortPersonas(listadoPersonas, "apellido");
        System.out.println(
                listadoOrdenadoPorApellido.get(0).getApellido() + " - " +
                        listadoOrdenadoPorApellido.get(1).getApellido() + " - " +
                        listadoOrdenadoPorApellido.get(2).getApellido() + " - " +
                        listadoOrdenadoPorApellido.get(3).getApellido() + " - " +
                        listadoOrdenadoPorApellido.get(4).getApellido() + "\n"
        );

        // Imprimir el listado de personas ordenado inversamente por apellido
        System.out.println("Imprimo el listado de personas ordenado por apellido invertido:");
        ArrayList<Persona> listadoOrdenadoPorApellidoInvertido = Persona.sortPersonas(listadoPersonas, "apellidoInvertido");
        System.out.println(
                listadoOrdenadoPorApellidoInvertido.get(0).getApellido() + " - " +
                        listadoOrdenadoPorApellidoInvertido.get(1).getApellido() + " - " +
                        listadoOrdenadoPorApellidoInvertido.get(2).getApellido() + " - " +
                        listadoOrdenadoPorApellidoInvertido.get(3).getApellido() + " - " +
                        listadoOrdenadoPorApellidoInvertido.get(4).getApellido() + "\n"
        );
    }
}