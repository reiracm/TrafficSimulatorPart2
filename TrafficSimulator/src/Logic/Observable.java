package Logic;

public class Observable {
	private Observer observador;
	
	public void setChange(){
		observador.update(this);
	}
	
	public void setObserver(Observer pObserver){
		observador = pObserver;
		}
	

}
