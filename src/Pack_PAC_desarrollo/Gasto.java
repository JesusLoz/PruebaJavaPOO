package Pack_PAC_desarrollo;

public class Gasto extends Dinero{
	
	Gasto(double gasto, String description){
		this.dinero=gasto;
        this.description=description;
		
	}

	 @Override
	 public String toString(){
		 return this.description + ": " + this.dinero + " euros";
	 }
}
