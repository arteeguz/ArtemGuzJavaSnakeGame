
public class Temperature {
	
	private double ftemp;
	
	public Temperature(double ftemp) {			//class constructor 
		this.ftemp=ftemp;						//accept temperature and stores it in the ftemp 
	}
	
	public void setFahrenheit(double ftemp) {
		this.ftemp = ftemp;						//accept temperature and update the ftemp variable
	} 
	
	public double getFahrenheit() {
		return ftemp;							//return temp in F
	}
	
	public double getCelsius() {
		return (5.0/9.0)*(getFahrenheit()-32);	//return temp C
	}
	
	public double getKelvin() {
		return getCelsius()+273;				//return temp in K
	}
}
