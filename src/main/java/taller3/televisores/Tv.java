package taller3.televisores;

public class Tv {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTv;
	
	public Tv(Marca marc, boolean est) {
		marca = marc;
		estado = est;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marc) {
		marca = marc;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control contr) {
		control = contr;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int pre) {
		precio = pre;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volum) {
		volumen = volum;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int cana) {
		canal = cana;
	}
	
	static int conteo() {  //???
		return numTv++;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (getCanal() > 0 &&  getCanal() < 121 && getEstado() == true) {
			canal = canal++;
		}
		
	}
	
	public void canalDown() {
		if (getCanal() > 0 &&  getCanal() < 121 && getEstado() == true) {
			canal = canal--;
		}
	}
	
	public void volumenUp() {
		if (getVolumen() >= 0 &&  getVolumen() < 8 && getEstado() == true) {
			volumen = volumen++;
		}
				
	}
	
	public void volumenDown() {
		if (getVolumen() >= 0 &&  getVolumen() < 8 && getEstado() == true) {
			volumen = volumen--;
		}
	}
		
}
