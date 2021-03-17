package taller3.televisores;

public class Tv {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		setNumTV(getNumTV()+1);
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	static int getNumtv() {  //???
		return numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
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
