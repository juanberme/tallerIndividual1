package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class compra extends pantallas {

	PApplet app6;
	PImage menuCompra;
	PImage modelX;
	PImage modelS;
	PImage model3;
	PImage scroll;
	PImage comprarGris;
	PImage compararGris;
	PImage comprarGrande;
	PImage scrollUp;
	PImage seleccion;
	PImage ventaModelX;
	PImage ventaModelS;
	PImage ventaModel3;
	private PImage regresar;
	

	public compra(int posX, int posY, int tamX, int tamY, PApplet app6) {
		super(posX, posY, tamX, tamY);
		this.app6 = app6;
	}

	public void crearMenu() {
		menuCompra = app6.loadImage("tesla/imagenes/finalMenu.png");
		app6.image(menuCompra, posX, posY, tamX, tamY);
		//comprar gris 1 model3
		comprarGris = app6.loadImage("tesla/imagenes/comprarChiquitoGris.png");
		if(app6.mouseX > 76 && app6.mouseX < 196 && app6.mouseY > 301 && app6.mouseY < 335) {
			app6.image(comprarGris, 78, 301, 118, 33);
		}
		//comPARAR gris 1 model3
		compararGris = app6.loadImage("tesla/imagenes/compararGris.png");
		if(app6.mouseX > 246 && app6.mouseX < 365 && app6.mouseY > 301 && app6.mouseY < 335) {
			app6.image(compararGris, 247, 301, 118, 33);
		}
		//comprar gris 2 modelS
		if(app6.mouseX > 76 && app6.mouseX < 196 && app6.mouseY > 544 && app6.mouseY < 578) {
			app6.image(comprarGris, 78, 544, 118, 33);
		}
		//comparar gris 2 modelS
		if(app6.mouseX > 246 && app6.mouseX < 365 && app6.mouseY > 544 && app6.mouseY < 578) {
			app6.image(compararGris, 246, 544, 118, 33);
		}
		//comprar gris 3 modelX
		if(app6.mouseX > 76 && app6.mouseX < 196 && app6.mouseY > 784 && app6.mouseY < 817) {
			app6.image(comprarGris, 75, 784, 118, 33);
		}
		//comparar gris 3 modelX
		if(app6.mouseX > 246 && app6.mouseX < 365 && app6.mouseY > 784 && app6.mouseY < 817) {
			app6.image(compararGris, 244, 784, 118, 33);
		}
		if(app6.mouseX > 41 && app6.mouseX < 60 && app6.mouseY > 46 && app6.mouseY < 78) {
			regresar = app6.loadImage("tesla/imagenes/regreso1.png");
			app6.image(regresar, 45,44,16,30);
		}
	}

	public void modelX() {
		modelX = app6.loadImage("tesla/imagenes/modelX.png");
		app6.image(modelX, posX, posY, tamX, tamY);
		comprarGrande = app6.loadImage("tesla/imagenes/comprarGrande.png");
		if(app6.mouseX > 23 && app6.mouseX < 390 && app6.mouseY > 723 && app6.mouseY < 787) {
			app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		seleccion = app6.loadImage("tesla/imagenes/selColor.png");
		if(app6.mouseX > 23 && app6.mouseX < 390 && app6.mouseY > 723 && app6.mouseY < 787) {
			app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		seleccion = app6.loadImage("tesla/imagenes/selColor.png");
		if(app6.mouseX > 56 && app6.mouseX < 115 && app6.mouseY > 509 && app6.mouseY < 571 ) {
			app6.image(seleccion, 53, 509, 68, 68);
		}
		if(app6.mouseX > 135 && app6.mouseX < 200 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 135, 509, 68, 68);
		}
		if(app6.mouseX > 220 && app6.mouseX < 283 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 217, 509, 68, 68);
		}
		if(app6.mouseX > 302 && app6.mouseX < 364 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 299 , 509, 68, 68);
		}

	}

	public void modelS() {
		modelS = app6.loadImage("tesla/imagenes/modelS.png");
		app6.image(modelS, posX, posY, tamX, tamY);
		comprarGrande = app6.loadImage("tesla/imagenes/comprarGrande.png");
		if(app6.mouseX > 23 && app6.mouseX < 390 && app6.mouseY > 723 && app6.mouseY < 787) {
			app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		seleccion = app6.loadImage("tesla/imagenes/selColor.png");
		if(app6.mouseX > 23 && app6.mouseX < 390 && app6.mouseY > 723 && app6.mouseY < 787) {
			app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		seleccion = app6.loadImage("tesla/imagenes/selColor.png");
		if(app6.mouseX > 56 && app6.mouseX < 115 && app6.mouseY > 509 && app6.mouseY < 571 ) {
			app6.image(seleccion, 53, 509, 68, 68);
		}
		if(app6.mouseX > 135 && app6.mouseX < 200 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 135, 509, 68, 68);
		}
		if(app6.mouseX > 220 && app6.mouseX < 283 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 217, 509, 68, 68);
		}
		if(app6.mouseX > 302 && app6.mouseX < 364 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 299 , 509, 68, 68);
		}

	}

	public void model3() {
		model3 = app6.loadImage("tesla/imagenes/model3.png");
		app6.image(model3, posX, posY, tamX, tamY);
		comprarGrande = app6.loadImage("tesla/imagenes/comprarGrande.png");
		if(app6.mouseX > 23 && app6.mouseX < 390 && app6.mouseY > 723 && app6.mouseY < 787) {
			app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		seleccion = app6.loadImage("tesla/imagenes/selColor.png");
		if(app6.mouseX > 56 && app6.mouseX < 115 && app6.mouseY > 509 && app6.mouseY < 571 ) {
			app6.image(seleccion, 53, 509, 68, 68);
		}
		if(app6.mouseX > 135 && app6.mouseX < 200 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 135, 509, 68, 68);
		}
		if(app6.mouseX > 220 && app6.mouseX < 283 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 217, 509, 68, 68);
		}
		if(app6.mouseX > 302 && app6.mouseX < 364 && app6.mouseY > 509 && app6.mouseY < 575) {
			app6.image(seleccion, 299 , 509, 68, 68);
		}
	}
	
	public void ventaModelX() {
		ventaModelX = app6.loadImage("tesla/imagenes/modelXComprado.png");
		app6.image(ventaModelX, posX, posY, tamX, tamY);
	}
	
	public void ventaModel3() {
		ventaModel3 = app6.loadImage("tesla/imagenes/model3Comprado.png");
		app6.image(ventaModel3, posX, posY, tamX, tamY);
	}

	public void ventaModelS() {
		ventaModelS = app6.loadImage("tesla/imagenes/modelSComprado.png");
		app6.image(ventaModelS, posX, posY, tamX, tamY);
	}
	
	public void selColor() {
		
	}

}
