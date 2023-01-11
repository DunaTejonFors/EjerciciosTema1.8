public class Main {
    public static void main(String[] args) {
        Persona Yo = new Persona();
        Yo.setEdad(23);
        Yo.setNombre("Duna");
        Yo.setTelefono(555);

        System.out.println(Yo.getEdad());
        System.out.println(Yo.getNombre());
        System.out.println(Yo.getTelefono());

    }

}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;
    

    public void setEdad(int edad) {
        this.edad = edad;}
    public int getEdad(){
        return this.edad;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String getNombre(){
        return this.nombre;}

    public void setTelefono(int telefono) {
        this.telefono = telefono;}
    public int getTelefono(){
        return this.telefono;}

}