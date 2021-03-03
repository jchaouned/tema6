package ejemplo0;

public class Circulo extends Punto {

	// Atributos
	// x,y (posición del centro)
	// radio

	// Métodos
	// mostrar()
	// area(): Devuelve el área
	// perimetro: Devuelve el perímetro

	//double x, y; // Los hereda de la clase Punto
	private double radio; // Radio del círculo
	
	//Añadido
	public Circulo() {
		super();	
	}
	
	//Añadido
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	

	@Override
	public void mostrar() {
		//Si quisiéramos llamar al método mostrar() del padre
		//super.mostrar();
		
		System.out.println("Coordenadas del centro: (" + x + "," + y + ").");
		System.out.println("Radio: " + radio + ".");
	}

	double area() {
		return Math.PI * radio * radio;
	}

	double perimetro() {
		return 2 * Math.PI * radio;
	}

}













