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
	private int d; // d�a
	/**
	 * Atributo del dia para la fecha
	 */
	private int m; // mes
	/**
	 * Atributo del dia para la fecha
	 */
	private int a; // a�o

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
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * Funcion booleana que comprueba si la fecha es correcta
	 * 
	 * @return un booleano para ver si la fecha es correcta
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
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
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	// M�todo diaSiguiente
	/**
	 * Pasa de dia y compruba si se ha cambiado de mes
	 */
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Metodo toString de la clase
	 * 
	 * @return devuelve el objeto pasado a cadena
	 */
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
