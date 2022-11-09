package Pack_PAC_desarrollo;
import java.util.List;
import java.util.ArrayList;
public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto>gastos;
	private List<Ingreso>ingresos;
	
	public Cuenta(Usuario usuario){
		this.usuario=usuario;
        this.saldo=0;
        this.gastos=new ArrayList<>();
        this.ingresos=new ArrayList<>();
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo(double saldo){
        this.saldo=saldo;
    }
	
	Usuario getUsuario() {
		return this.usuario;
	}
	
	void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public double addIngresos(String description, double cantidad) {
		Ingreso ingreso=new Ingreso(cantidad, description);
	    this.ingresos.add(ingreso);
	    setSaldo(this.saldo+cantidad);
	    return this.getSaldo();
		
	}
	
	public double addGastos(String description, double cantidad){
        try{
            if(this.saldo-cantidad<0){
                throw new GastoException();
            }
        } catch(GastoException e){
            System.out.println(e);
            return -1;
        }
        Gasto gasto=new Gasto(cantidad, description);
        this.gastos.add(gasto);
        setSaldo(this.saldo-cantidad);
        return this.getSaldo();
        }
	List<Ingreso>getIngresos(){
		return this.ingresos;
		
	}
	
	List<Gasto>getGastos(){
		return this.gastos;
	}
	@Override
	public String toString() {
		return "El saldo actual de la cuenta del usuario " + this.usuario.getNombre() + " es " + this.saldo + " euros";
    }
}
