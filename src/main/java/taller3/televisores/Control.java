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
		if(tv.estado == true && canal >= 1 && canal <= 120){
			tv.canal = canal;
		}
	}	
	
	public void setVolumen(int volumen){
		if(tv.estado == true && volumen >= 0 && volumen <= 7) {
			tv.volumen = volumen;
		}
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
	
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return tv;
	}
}

