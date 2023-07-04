public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.edad = 27;
        cliente.nombre = "Miguel";
        cliente.telefono = "+51999999999";
        cliente.credito = 19.5;

        System.out.println("Cliente");
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Nombre: "+cliente.nombre);
        System.out.println("Telefono: "+cliente.telefono);
        System.out.println("Credito: "+cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 28;
        trabajador.nombre = "Augusto";
        trabajador.telefono = "+51999999991";
        trabajador.salario = 900.00;

        System.out.println("Trabajador");
        System.out.println("Edad: "+trabajador.edad);
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Telefono: "+trabajador.telefono);
        System.out.println("Salario: "+trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    Double credito;
}

class Trabajador extends Persona {
    Double salario;
}