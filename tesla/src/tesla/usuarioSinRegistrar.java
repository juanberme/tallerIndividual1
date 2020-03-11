package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class usuarioSinRegistrar extends pantallas {

	private PApplet app;
	private PImage pantRegistro;
	private PImage  ingresarGris;
	private PImage regresar;

	public usuarioSinRegistrar(int posX, int posY, int tamX, int tamY, PApplet app) {
		super(posX, posY, tamX, tamY);

		this.app = app;

	}

	public void crearPantalla() {
		pantRegistro = app.loadImage("tesla/imagenes/registro.jpg");
		app.image(pantRegistro, posX, posY, tamX, tamY);

	}
	
	public void feedBack() {
		if (app.mouseX > 254 && app.mouseX < 390 && app.mouseY > 736 && app.mouseY < 776) {
			ingresarGris = app.loadImage("tesla/imagenes/ingresarGris.png");
			app.image(ingresarGris, 254,737,138, 38);
		}
		if(app.mouseX > 41 && app.mouseX < 60 && app.mouseY > 46 && app.mouseY < 78) {
			regresar = app.loadImage("tesla/imagenes/regreso1.png");
			app.image(regresar, 42,51,16,30);
		}
	}

	public void cambioPantalla() {
		
	}

}
