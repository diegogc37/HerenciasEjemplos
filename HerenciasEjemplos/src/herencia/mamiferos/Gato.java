package herencia.mamiferos;

import programacion_classes_abstract.Mamifero;

public class Gato extends Mamifero{

	private String nombre;
	
	public Gato(String nombre, int peso, int altura) {
		super(false,peso, 4, altura);
		this.nombre=nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void emitirRuido() {
		System.out.println("Miau.");
	}
	
	public void desplazarse(int metros) {
		System.out.println("Me desplazo a lo sigiloso una distancia de "+metros);
	}
	
	public void respirar() {
		System.out.println("Respiro con dos pulmones estandar.");
	}
}
