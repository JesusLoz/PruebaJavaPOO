package Pack_PAC_desarrollo;

public class Ingreso extends Dinero{
	
	public Ingreso(double ingreso, String description){
        this.dinero=ingreso;
        this.description=description;
    }

	@Override
    public String toString(){
        return this.description + ": " + this.dinero + " euros";
    }
}
