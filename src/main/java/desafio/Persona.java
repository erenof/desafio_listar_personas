package desafio;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;

    // Generamos las listas nombres y apellidos
    private final String[] nombres = {"Oscar", "Alberto", "Susana", "Roberto", "Anibal", "Mirta", "Juan", "Raul"};
    private final String[] apellidos = {"Taruffeti", "Sarlanga", "Caraballi", "Viruleta", "Gandolfi", "Zarangana"};

    // Metodo para tomar un indice al azar y que luego devuelva el elemento del array en ese indice
    private String getRandomItem(String[] listado) {
        int randomIndex = (int) Math.round(Math.random() * (listado.length - 1));
        return listado[randomIndex];
    }

    // Metodo para ordenar por nombre o apellido
    public static ArrayList<Persona> sortPersonas (ArrayList<Persona> listadoPersonas, String sortBy) {
        switch (sortBy) {
            case "nombre" -> listadoPersonas.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
            case "apellido" -> listadoPersonas.sort((o1, o2) -> o1.getApellido().compareTo(o2.getApellido()));
            case "apellidoInvertido" -> listadoPersonas.sort((o1, o2) -> o2.getApellido().compareTo(o1.getApellido()));
            default -> {
            }
        }
        return listadoPersonas;
    }

    // getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor tomando nombre/apellido al azar de la lista, usando el metodo getRandomItem
    public Persona() {
        this.nombre = getRandomItem(nombres);
        this.apellido = getRandomItem(apellidos);
    }

    //Metodo to string
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;

        if (!getNombre().equals(persona.getNombre())) return false;
        return getApellido().equals(persona.getApellido());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getApellido().hashCode();
        return result;
    }
}
