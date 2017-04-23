
// TODO: Auto-generated Javadoc
/**
 * The Class Hipoteca.
 */
public class Hipoteca {
	
	/** The capital. */
	private double capital;
	
	/** The interes. */
	private double interes;
	
	/** The plazo. */
	private int plazo;
	
	/** The periocidad. */
	private int periocidad;
	
	/** The amortizacion. */
	private double amortizacion;
	
	/**
	 * Instantiates a new hipoteca.
	 */
	Hipoteca() {
		
	}
	

	/**
	 * Instantiates a new hipoteca.
	 *
	 * @param capital the capital
	 * @param interes the interes
	 * @param plazo the plazo
	 */
	Hipoteca(double capital, double interes, int plazo) {
		this.capital = capital;
		this.interes = interes;
		this.plazo = plazo;
		this.periocidad = 12;
	}
	
	/**
	 * Instantiates a new hipoteca.
	 *
	 * @param capital the capital
	 * @param interes the interes
	 * @param plazo the plazo
	 * @param periodicidad the periodicidad
	 */
	Hipoteca(double capital, double interes, int plazo, int periodicidad) {
		this.capital = capital;
		this.interes = interes;
		this.plazo = plazo;
		this.periocidad = periodicidad;
	}

	/**
	 * Gets the interes cuota.
	 *
	 * @return the interes cuota
	 */
	private double getInteresCuota() {
		return this.interes/this.periocidad;
	}
	
	/**
	 * Gets the indice interes cuota.
	 *
	 * @return the indice interes cuota
	 */
	private double getIndiceInteresCuota() {
		return this.getInteresCuota()/100;
	}
		
	/**
	 * Gets the cuota.
	 *
	 * @return the cuota
	 */
	public double getCuota() {
		//double interesMensual = this.getInteresMensual();
		//return (capital*interesMensual)/(100*(1-Math.pow((1+interesMensual/100),-this.plazo)));
		double iic = this.getIndiceInteresCuota();
		return (this.capital*iic)/(1-Math.pow(1+iic, -getNumeroCuotas()));
	}
	
	/**
	 * Show cuadro.
	 */
	public void showCuadro(){
		
	}
	
	/**
	 * Show cuota.
	 */
	public void showCuota() {
	}
	
	/**
	 * Gets the cuadro.
	 *
	 * @return the cuadro
	 */
	public void getCuadro() {
	}

	/**
	 * Gets the numero cuotas.
	 *
	 * @return the numero cuotas
	 */
	private int getNumeroCuotas() {
		return this.plazo*this.periocidad;
	}

	/**
	 * Gets the capital.
	 *
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Sets the capital.
	 *
	 * @param capital the new capital
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Gets the interes.
	 *
	 * @return the interes
	 */
	public double getInteres() {
		return interes;
	}

	/**
	 * Sets the interes.
	 *
	 * @param interes the new interes
	 */
	public void setInteres(double interes) {
		this.interes = interes;
	}

	/**
	 * Gets the plazo.
	 *
	 * @return the plazo
	 */
	public int getPlazo() {
		return plazo;
	}

	/**
	 * Sets the plazo.
	 *
	 * @param plazo the new plazo
	 */
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
