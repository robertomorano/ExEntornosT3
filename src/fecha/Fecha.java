package fecha;

/**
 * Clase que guaarda atributos para saber fechas
 * 
 * @author anonimo
 */
public class Fecha {
<<<<<<< HEAD
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
=======
	public static final int DIEZ = 10;
	public static final int DIEZ = DIEZ;
	private int d; //d�a
	private int m; //mes
	private int a; //a�o
>>>>>>> PMD-Refactor

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
<<<<<<< HEAD
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
=======
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		boolean diaMayor1 = d >= 1;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && d <= 29;
			} else {
				diaCorrecto = diaMayor1 && d <= 28;
>>>>>>> PMD-Refactor
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
<<<<<<< HEAD
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default:
			diaCorrecto = dia >= 1 && dia <= 31;
=======
			diaCorrecto = diaMayor1 && d <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && d <= 31;
>>>>>>> PMD-Refactor
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
<<<<<<< HEAD
	/**
	 * Metodo esBisiesto. Ciertos años tiene en febrero un dia mas, metodo inerno
	 * 
	 * @return si el año es bisiesto
	 */
=======
>>>>>>> PMD-Refactor
	private boolean esBisiesto() {
		return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
	}

	// M�todo diaSiguiente
<<<<<<< HEAD
	/**
	 * Pasa de dia y compruba si se ha cambiado de mes
	 */
	public void diaSiguiente() {
		dia++;
=======
	public void nextDay() {
		d++;
>>>>>>> PMD-Refactor
		if (!fechaCorrecta()) {
			dia = 1;
			month++;
			if (!fechaCorrecta()) {
				month = 1;
				año++;
			}
		}
	}

<<<<<<< HEAD
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
=======
	// M�todo toString
	public String toString() {
		if (d < DIEZ && m < DIEZ) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < DIEZ && m >= DIEZ) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= DIEZ && m < DIEZ) {
			return d + "-0" + m + "-" + a;
>>>>>>> PMD-Refactor
		} else {
			texto = dia + "-" + month + "-" + año;
		}
		return texto;
	}

}
