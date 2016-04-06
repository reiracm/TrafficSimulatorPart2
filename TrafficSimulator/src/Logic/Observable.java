package Logic;

public class Observable {
	private Observer observador;
	
	public void setChange(){
		if (observador != null){
		observador.update(this);
		System.out.println("No es nulo");
		}
		else{
			System.out.println("observador nulo");
		}
	}
	
	public void setObserver(Observer pObserver){
		observador = pObserver;
		}
	

}
