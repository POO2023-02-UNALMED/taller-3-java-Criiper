package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.control = this;
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void setCanal(int canal){
		tv.canal = canal;
	}
	
		public void setVolumen(int volumen){
		tv.volumen = volumen;
	}
		
	public void canalUp() {
		if (tv.canal >= 1 && tv.canal < 120 && tv.estado == true) {
			tv.canal++;
		}
	}
	
	
	public void canalDown() {
		if (tv.canal > 1 && tv.canal <= 120 && tv.estado == true) {
			tv.canal--;
		}
	}
	
	public void volumenUp() {
		if (tv.volumen >= 0 && tv.volumen < 7 && tv.estado == true) {
			tv.volumen++;
		}
	}
	
	public void volumenDown() {
		if (tv.volumen > 0 && tv.volumen <= 7 && tv.estado == true) {
			tv.volumen--;
		}
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
}

