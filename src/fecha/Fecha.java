package fecha;

/**
 * Clase que guaarda atributos para saber fechas
 * 
 * @author anonimo
 */
public class Fecha {
	/**
	 * Atributo del dia para la fecha
	 */
	private int dia; // d�a
	/**
	 * Atributo del dia para la fecha
	 */
	private int month; // mes
	/**
	 * Atributo del dia para la fecha
	 */
	private int año; // a�o

	/**
	 * Constructor vacio
	 */
	public Fecha() {

	}

	/**
	 * Constructor de la clase Fecha
	 * 
	 * @param dia  dia del mes
	 * @param mes  mes del año
	 * @param anio año segun el calendario
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.month = mes;
		this.año = anio;
	}

	/**
	 * Funcion booleana que comprueba si la fecha es correcta
	 * 
	 * @return un booleano para ver si la fecha es correcta
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto; 
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = año > 0;
		mesCorrecto = month >= 1 && month <= 12;
		switch (month) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = dia >= 1 && dia <= 29;
			} else {
				diaCorrecto = dia >= 1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	/**
	 * Metodo esBisiesto. Ciertos años tiene en febrero un dia mas, metodo inerno
	 * 
	 * @return si el año es bisiesto
	 */
	private boolean esBisiesto() {
		return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
	}

	// M�todo diaSiguiente
	/**
	 * Pasa de dia y compruba si se ha cambiado de mes
	 */
	public void diaSiguiente() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			month++;
			if (!fechaCorrecta()) {
				month = 1;
				año++;
			}
		}
	}

	/**
	 * Metodo toString de la clase
	 * 
	 * @return devuelve el objeto pasado a cadena
	 */
	public String toString() {
		String texto = "";
		if (dia < 10 && month < 10) {
			texto = "0" + dia + "-0" + month + "-" + año;
		} else if (dia < 10 && month >= 10) {
			texto = "0" + dia + "-" + month + "-" + año;
		} else if (dia >= 10 && month < 10) {
			texto = dia + "-0" + month + "-" + año;
		} else {
			texto = dia + "-" + month + "-" + año;
		}
		return texto;
	}

}
