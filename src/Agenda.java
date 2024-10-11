public class Agenda {
    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[10];
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio];
    }

    public void anadirContacto(Contacto c) {
        if (existeContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena, no se pueden añadir más contactos");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    System.out.println("Se ha añadido el contacto");
                    return;
                }
            }
        }
    }

    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        if (huecosLibre() == contactos.length) {
            System.out.println("No hay contactos que mostrar");
        } else {
            for (Contacto contacto : contactos) {
                if (contacto != null) {
                    System.out.println(contacto);
                }
            }
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto != null && contacto.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su teléfono es " + contacto.getTelefono());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public boolean agendaLlena() {
        return huecosLibre() == 0;
    }

    public void eliminarContacto(Contacto c) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha encontrado el contacto para eliminar");
        }
    }

    public int huecosLibre() {
        int contadorLibres = 0;
        for (Contacto contacto : contactos) {
            if (contacto == null) {
                contadorLibres++;
            }
        }
        return contadorLibres;
    }
}
