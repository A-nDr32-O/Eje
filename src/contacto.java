public class contacto {
    private String nombre;
    private int telefono;

    public contacto() {
    }

    public contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean equals(contacto c) {
        if (this.trim().equalsIgnoreCase(c.getNombre().trim())){
            return true;
        }
        return false;
    }

    private String trim() {
        return null;
    }


    @Override
    public String toString() {
        return "nombre='" + nombre+ ", telefono=" + telefono;
    }
}
