package Pack_PAC_desarrollo;

public abstract class Dinero {

	protected double dinero;
	protected String description;
	
	public double getDinero() {
		return this.dinero;
	}
	
	public void setDinero(double dinero){
        this.dinero=dinero;
    }
	String getDescription() {
		return this.description;
	}
	
	void setDescription(String description){
		this.description = description;
	}
}
