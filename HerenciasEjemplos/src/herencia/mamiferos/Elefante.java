package herencia.mamiferos;

import programacion_classes_abstract.Mamifero;

public class Elefante extends Mamifero{

	/*
	 * Metodo Constructor de la clase Elefante
	 * 
	 * super() Llamada a la clase padre de la que se heredan los metodos
	 * 
	 * @param en super() pasamos un boolean false ya que un elefante no es un vertebrado oviparo
	 */
	public Elefante(int peso, int altura) {
		super(false,peso, 4, altura);
	}
	
	/*
	 * Metodo desplazarse heredado de la clase Vertebrado
	 */
	public void desplazarse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Camino una distancoia de "+metros+" dando unas zancadas enormes.");
	}

	/*
	 * Metodo respirar heredado de la clase Vertebrado
	 */
	public void respirar() {
		// TODO Auto-generated method stub
		System.out.println("Uso mis pulmones de 20kg para resiprar.");
	}

	/*
	 * Metodo emitirRuido heredado de la clase Vertebrado
	 */
	public void emitirRuido() {
		// TODO Auto-generated method stub
		System.out.println("BRRRRRRRRRRRRRRRRRR (a esto se le llama barbitar)");
	}	
}
