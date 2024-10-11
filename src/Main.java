import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;

        while (!salir) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            try {
                System.out.print("Escribe una de las opciones: ");
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Escribe un nombre: ");
                        nombre = teclado.nextLine();
                        System.out.print("Escribe un teléfono: ");
                        telefono = teclado.nextInt();

                        Contacto c = new Contacto(nombre, telefono);
                        agendaTelefonica.anadirContacto(c);
                        break;

                    case 2:
                        agendaTelefonica.listarContactos();
                        break;

                    case 3:
                        System.out.print("Escribe un nombre: ");
                        nombre = teclado.nextLine();
                        agendaTelefonica.buscarPorNombre(nombre);
                        break;

                    case 4:
                        System.out.print("Escribe un nombre: ");
                        nombre = teclado.nextLine();
                        Contacto cExistente = new Contacto(nombre, 0);

                        if (agendaTelefonica.existeContacto(cExistente)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe contacto");
                        }
                        break;

                    case 5:
                        System.out.print("Escribe un nombre: ");
                        nombre = teclado.nextLine();
                        Contacto cEliminar = new Contacto(nombre, 0);
                        agendaTelefonica.eliminarContacto(cEliminar);
                        break;

                    case 6:
                        System.out.println("Hay " + agendaTelefonica.huecosLibre() + " contactos libres");
                        break;

                    case 7:
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("La agenda está llena");
                        } else {
                            System.out.println("Aún puedes meter contactos");
                        }
                        break;

                    case 8:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }
        }

        teclado.close();
    }
}
