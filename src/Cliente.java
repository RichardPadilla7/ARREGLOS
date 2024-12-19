public class Clientes {
    private String nombre;
    private String cedula;

    public Clientes(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public void Informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
    }

}
