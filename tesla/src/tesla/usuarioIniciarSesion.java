package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class usuarioIniciarSesion extends pantallas {

	private PApplet app2;
	private PImage usuarioInicio;
	private PImage continuarGris;
	private PImage regresar;

	public usuarioIniciarSesion(int posX, int posY, int tamX, int tamY, PApplet app2) {
		super(posX, posY, tamX, tamY);

		this.app2 = app2;

	}

	public void crearPantalla() {
		usuarioInicio = app2.loadImage("tesla/imagenes/iniciarSesion.png");
		app2.image(usuarioInicio, posX, posY, tamX, tamY);

	}
	
	public void feedBack() {
		if(app2.mouseX > 254 && app2.mouseX < 390 && app2.mouseY > 720 && app2.mouseY < 757) {
			continuarGris = app2.loadImage("tesla/imagenes/continuarGris.png");
			app2.image(continuarGris, 254, 720, 138, 38 );
		}
		if(app2.mouseX > 41 && app2.mouseX < 60 && app2.mouseY > 46 && app2.mouseY < 78) {
			regresar = app2.loadImage("tesla/imagenes/regreso1.png");
			app2.image(regresar, 38,52,16,30);
		}
		
		
	}
	
	public void cambioPantalla() {
		
	}

}
