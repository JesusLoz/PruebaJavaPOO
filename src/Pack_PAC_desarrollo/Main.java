package Pack_PAC_desarrollo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Usuario usuario1 = new Usuario();
		crearUsuario(usuario1, sc);
		Cuenta cuenta=new Cuenta(usuario1);
		int option=-1;
		
		while(option!=0){
            mostrarMenu();
            option=Integer.valueOf(sc.nextLine());
            switch(option){
            case 1:
                gastarDinero(cuenta, sc);
                break;
            case 2:
                ingresarDinero(cuenta,sc);
                break;
            case 3:
                mostrarGastos(cuenta);
                break;
            case 4:
                System.out.println(cuenta.getIngresos());
                break;
            case 5:
                System.out.println(cuenta);
                break;
        }
    }
    System.out.println("Fin del programa.\n"
            + "Gracias por utilizar la aplicación.");
	}
    
    
    private static void crearUsuario(Usuario usuario1, Scanner sc){
        System.out.println("Introduzca el nombre del usuario");
        String nombre=sc.nextLine();
        usuario1.setNombre(nombre);
        System.out.println("Introduzca la edad del usuario");
        int edad=Integer.valueOf(sc.nextLine());
        usuario1.setEdad(edad);
        System.out.println("Introduzca el DNI del usuario");
        String DNI=sc.nextLine();
        while(!usuario1.setDNI(DNI)){
            System.out.println("Formato incorrecto");
            System.out.println("Introduzca el DNI del usuario válido");
            DNI=sc.nextLine();
        }
        usuario1.setDNI(DNI);
        System.out.println("Usuario creado correctamente");
    }
    private static void mostrarMenu(){
        System.out.println("Realiza una nueva acción\n" 
        					+ "1 Introduce un nuevo gasto\n"
        					+ "2 Introduce un nuevo ingreso\n" 
        					+ "3 Mostrar gastos\n" 
        					+ "4 Mostrar ingresos\n" 
        					+ "5 Mostrar saldo\n" + "0 Salir");
        
     }
    private static void ingresarDinero(Cuenta cuenta, Scanner sc){
        System.out.println("Introduce la descripción");
        String concepto=sc.nextLine();
        System.out.println("Introduce la cantidad");
        double ingreso=Double.valueOf(sc.nextLine());
        cuenta.addIngresos(concepto, ingreso);
        System.out.println(cuenta);
    }
    
    private static void gastarDinero(Cuenta cuenta, Scanner sc){
        System.out.println("Introduce la descripción");
        String description=sc.nextLine();
        System.out.println("Introduce la cantidad");
        double gasto=Double.valueOf(sc.nextLine());
        cuenta.addGastos(description, gasto);
        System.out.println(cuenta);
        
    }
    
    private static void mostrarGastos(Cuenta cuenta){
        for(int i=0; i<cuenta.getGastos().size(); i++){
            System.out.println(cuenta.getGastos().get(i).toString());
        }
    }
    
    private static void mostrarIngresos(Cuenta cuenta){
        for(int i=0; i<cuenta.getIngresos().size(); i++){
            System.out.println(cuenta.getIngresos().get(i).toString());
        }
    }
    
	  
}
        
        