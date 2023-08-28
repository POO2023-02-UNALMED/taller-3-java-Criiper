package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv){
		this.tv = tv;
		tv.control = this;
		
	}
	
	public void setTv() {
		return;
	}
	
	public TV getTv() {
		return tv;
	}
}

