import java.util.InputMismatchException;
import java.util.Scanner; and
/*Sexo Todos los dias*/
=======
//Brayan Smith Matabanchoy
main
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        boolean salir = false;
        int opcion;

        Agenda agendaTelefonica= new Agencia(3);
        String nombre;
        int telefono;

        Contacto c;

        while (!salir){
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("Escribe un nombre");
                        nombre = teclado.next();

                        System.out.println("Escribe un telefono");
                        telefono = teclado.nextInt();

                        c = new Contacto(nombre, telefono);

                        agendaTelefonica.aniadirContacto(c);
                    break;

                    case 2:
                        agendaTelefonica.listarContactos();
                    break;

                    case 3:
                        System.out.println("Escribre un nombre");
                        nombre = teclado.next();

                        agendaTelefonica.buscarPorNombre(nombre);
                    break;
                    case 4:

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        c = new Contacto(nombre, 0);

                        if (agendaTelefonica.existeContacto(c)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe contacto");
                        }

                    break;
                    case 5:

                        System.out.println("Escribe un nombre");
                        nombre = sn.next();

                        c = new Contacto(nombre, 0);

                        agendaTelefonica.eliminarContacto(c);

                    break;
                    case 6:

                        System.out.println("Hay " + agendaTelefonica.huecosLibre() + " contactos libre");

                    break;
                    case 7:

                        //como devuelve un booleano, lo meto en un if
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("La agenda esta llena");
                        } else {
                            System.out.println("Aun puedes meter contactoss");
                        }

                    break;
                    case 8:
                        salir = true;
                    break;
                    default:
                        System.out.println("Solo numeros entre 1 y 8");

                }
            }catch (InputMismatchException e){
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
        }

    }
}