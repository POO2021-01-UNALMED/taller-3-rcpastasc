package taller3.televisores;

public class Control {
	private Tv tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
		
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();				
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void enlazar(Tv tv) {
		this.tv = tv;
		tv.setControl(this);
		
	}
	
	public Tv getTv() {
		return tv;
	}
	
	public void setTv(Tv tv) {
		this.tv = tv;
		
	}

}
