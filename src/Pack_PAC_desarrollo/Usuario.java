package Pack_PAC_desarrollo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	private String nombre;
	private int edad;
	private String DNI;

public Usuario(){
	this.nombre = nombre;
	this.DNI = DNI;
	this.edad = edad;
}
	


public String getNombre() {

	return this.nombre;
}
	
void setNombre(String nombre){

	this.nombre= nombre;
}
	
int getEdad() {

	return this.edad;
}
public void setEdad(int edad){

	this.edad=edad;
}

String getDNI() {

	return this.DNI;
}

boolean setDNI(String DNI) {
	Pattern patt = Pattern.compile("\\d{8}-?[A-Z]?{1}");
    Matcher matc = patt.matcher(DNI);
    if (matc.matches()){
        this.DNI=DNI;
        return true;
    } else {
        return false;
    }
}
	
@Override
public String toString(){
    return "Nombre: " + this.nombre + ". Edad: " + this.edad + " años. DNI: " + this.DNI; 
	}
}
