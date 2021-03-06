package tesla;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import controlP5.*;

public class Tesla extends PApplet {

	private ControlP5 cp5;
	PImage primera;
	PImage segunda;
	PImage tercera;
	PImage cuarta;
	PImage quinta;
	PImage sexta;
	PImage registroGris;
	PImage compraMenu;
	public int pantallas;
	public boolean escritosR;
	public boolean escritosI;
	PFont font;
	usuarioSinRegistrar UserNoRegister;
	usuarioRegistrado UserRegistered;
	usuarioIniciarSesion UserInitSession;
	compra menuComprar;
	menu Menu;
	historial historial;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PApplet.main("tesla.Tesla");

	}

	public void settings() {

		size(414, 896);
		// size(828,1792);
	}

	public void setup() {
		cp5 = new ControlP5(this);
		pantallas = 0;
		primera = loadImage("tesla/imagenes/primera.jpg");
		segunda = loadImage("tesla/imagenes/pagina2.png");
		tercera = loadImage("tesla/imagenes/pagina3.png");
		cuarta = loadImage("tesla/imagenes/pagina5.png");
		quinta = loadImage("tesla/imagenes/pagina6.png");
		escritosR = false;
		escritosI = false;
		compraMenu = loadImage("tesla/imagenes/compraMenu.png");
		UserNoRegister = new usuarioSinRegistrar(0, 0, 414, 896, this);
		UserRegistered = new usuarioRegistrado(0, 0, 414, 896, this);
		UserInitSession = new usuarioIniciarSesion(0, 0, 414, 896, this);
		menuComprar = new compra (0, 0, 414, 896, this);
		historial = new historial (0, 0, 414, 896, this);
		Menu = new menu( 0, 0, 414, 896, this);
		font = createFont("CovesBold.otf", 30);
		/*if(escritosR == true) {
			escritosParaRegistro();
		}
		if(escritosI == true) {
			escritosParaInicioSesion();
		}*/
		

	}

	public void draw() {
		background(255);
		fill(0);
	
		/**/
		/**/
		/**/
		switch(pantallas) {
		case 0: 
			image (primera,0,0,414,896);
		break;
		case 1:
			image (segunda,0,0,414,896);
		break;
		case 2:
			image (tercera,0,0,414,896);
		break;
		case 3: 
			image (cuarta,0,0,414,896);
		break;
		case 4: 
			image (quinta,0,0,414,896);
		break;
		case 5: 
			UserRegistered.crearPantalla();
		    UserRegistered.feedback();
		break;
		case 6: 
			UserNoRegister.crearPantalla();
			UserNoRegister.feedBack();
			//escritosR = true;
			
		break;
		case 7: 
			UserInitSession.crearPantalla();
			UserInitSession.feedBack();
			
		break;
		case 8: 
			Menu.crearPantalla();
			Menu.feedBack();
		break;
		case 9: 
			historial.crearPantalla();
			historial.feedBack();
		break;
		case 10: 
			menuComprar.crearMenu();
		break;
		case 11: 
			menuComprar.model3();
		break;
		case 12: 
			menuComprar.modelS();
		break;
		case 13: 
			menuComprar.modelX();
		break;
		case 14: 
			menuComprar.ventaModel3();
			if(frameCount == 10) {
				pantallas = 8;
			}
		break;
		case 15: 
			menuComprar.ventaModelS();
			if(frameCount == 10) {
				pantallas = 8;
			}
		break;
		case 16: 
			menuComprar.ventaModelX();
			if(frameCount == 10) {
				pantallas = 8;
			}
		break;
		case 17: 
			Menu.cerraSesion();
		break;
		}
		//para hacer la pantalla de carga
		if(frameCount == 10) {
			pantallas++;
		}
		if(frameCount == 20) {
			pantallas++;
		}
		if(frameCount == 30) {
			pantallas++;
		}
		if(frameCount == 40) {
			pantallas++;
		}
		if(frameCount == 50) {
			pantallas++;
		}
		
		
		
		//image (compraMenu, 0, 0, 414, 1281);
		//menuComprar.crearMenu();
		
		fill(0);
		text("X:" + mouseX + "Y:" + mouseY, mouseX, mouseY);
	}

	public void mousePressed() {
		//ir a la pantalla para registrarse 
		if(mouseX > 58 && mouseX < 352 && mouseY > 492 && mouseY < 560 && pantallas == 5) {
			pantallas = 6;
			escritosR = true;
			//image(registroGris, 58, 493, 294, 65);
		}
		//regresar a la pantalla inicial
		if(mouseX > 41 && mouseX < 60 && mouseY > 46 && mouseY < 78 && pantallas == 6) {
			pantallas = 5;
		}
		//ir a la pantalla de inicio de sesion
		if(mouseX > 58 && mouseX < 352 && mouseY > 588 && mouseY < 656 && pantallas == 5) {
			//image(ingresoGris, 59, 590, 294, 65);
			pantallas = 7;
			escritosI = true;
		}
		
		if(mouseX > 41 && mouseX < 60 && mouseY > 46 && mouseY < 78 && pantallas == 7) {
			pantallas = 5;
		}
		//ir a la pantalla del menu desde el inicio de sesion
		if(mouseX > 254 && mouseX < 390 && mouseY > 720 && mouseY < 757 && pantallas == 7) {
			pantallas = 8;
			//image(continuarGris, 254, 720, 138, 38 );
		}
		//ir a la pantalla del menu desde la pantalla de registro
		if (mouseX > 254 && mouseX < 390 && mouseY > 736 && mouseY < 776 && pantallas == 6) {
			pantallas = 8;
			//image(ingresarGris, 254,737,138, 38);
		}
		
		//cerrar sesion
		if(mouseX > 34 && mouseX < 78 && mouseY > 45 && mouseY < 87 && pantallas == 8) {
			pantallas = 17;
			/*menu = loadImage("tesla/imagenes/usuarioGris.png");
			image(menu, 35, 45, 42,42);*/
		}
		
		if(mouseX > 18 && mouseX < 201 && mouseY > 30 && mouseY < 106 && pantallas == 17) {
			pantallas = 5;
			//sesionRojo = app4.loadImage("tesla/imagenes/sesionRojo.png");
			//app4.image(sesionRojo, 18,28, 183,78);
		}
		//ir al historial
		if(mouseX > 63 && mouseX < 357 && mouseY > 617 && mouseY < 682 && pantallas == 8) {
			pantallas = 9;
			//historiaGris
		}
		//regresar del historial
		if(mouseX > 41 && mouseX < 60 && mouseY > 46 && mouseY < 78 && pantallas == 9) {
			pantallas = 8;
			//regresar = app5.loadImage("tesla/imagenes/regreso1.png");
			
		}
		//ir al menu de compra
		if(mouseX > 63 && mouseX < 357 && mouseY > 517 && mouseY < 583 && pantallas == 8) {
			pantallas = 10;
			//app4.image (comprarGris, 63, 519, 294, 65);
		}
		//ir a comprar el modelo 3
		if(mouseX > 76 && mouseX < 196 && mouseY > 301 && mouseY < 335 && pantallas == 10) {
			pantallas = 11;
			//app6.image(comprarGris, 78, 301, 118, 33);
		}
		//ir a comprar el modelo S
		if(mouseX > 76 && mouseX < 196 && mouseY > 544 && mouseY < 578 && pantallas == 10) {
			pantallas = 12;
			//app6.image(comprarGris, 78, 544, 118, 33);
		}
		//ir a comprar el modelo X
		if(mouseX > 76 && mouseX < 196 && mouseY > 784 && mouseY < 817 && pantallas == 10) {
			pantallas = 13;
			//app6.image(comprarGris, 75, 784, 118, 33);
		}
		if(mouseX > 23 && mouseX < 390 && mouseY > 723 && mouseY < 787 && pantallas == 11) {
			pantallas = 14;
			//app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		
		if(mouseX > 23 && mouseX < 390 && mouseY > 723 && mouseY < 787 && pantallas == 12) {
			pantallas = 15;
			//app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		
		if(mouseX > 23 && mouseX < 390 && mouseY > 723 && mouseY < 787 && pantallas == 13) {
			pantallas = 16;
			//app6.image(comprarGrande, 23, 722, 371, 65 );
		}
		
		
		
		
	}

	public void escritosParaRegistro() {
		
		cp5.addTextfield("usuario").setPosition(32, 505).setSize(350, 36).setFont(font).setFocus(true)
				.setColor(color(255, 255, 255)).setColorBackground(color(255, 255, 255, 1));

		cp5.addTextfield("contraseņa").setPosition(32, 585).setSize(350, 36).setPasswordMode(true).setFocus(true)
				.setColor(color(255, 255, 255)).setColorBackground(color(255, 255, 255, 1));

		cp5.addTextfield("correo").setPosition(32, 664).setSize(350, 36).setColorActive(150).setFont(font)
				.setFocus(true).setColor(color(255, 255, 255)).setColorBackground(color(255, 255, 255, 1));

		cp5.addButton("ingresar").setValue(0).setPosition(255, 737).setSize(138, 38).setColorBackground(255);
		
	}

	public void escritosParaInicioSesion() {
		
		cp5.addTextfield("usuario").setPosition(32, 563).setSize(350, 36).setFont(font).setFocus(true)
				.setColor(color(255, 255, 255)).setColorBackground(color(255, 255, 255, 1));

		cp5.addTextfield("contraseņa").setPosition(32, 641).setSize(350, 36).setPasswordMode(true).setFocus(true)
				.setColor(color(255, 255, 255)).setColorBackground(color(255, 255, 255, 1));
		
	}
	

}
