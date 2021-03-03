package ejemplo0;

public class Punto {

	protected double x; // Coordenada x del punto
	protected double y; // Coordenada y del punto
	protected String color; // Color del punto
	
	public Punto() {
		
	}
	
	public Punto(double x, double y) {
		this(x, y, null);
	}
	

	public Punto(double x, double y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);

	}
	
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

}
