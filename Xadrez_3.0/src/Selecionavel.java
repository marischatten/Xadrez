public class Selecionavel{

	private boolean selecionada;
	
	public Selecionavel(){
		this.selecionada = false;
	}

	public void selecionar(){
		this.selecionada = true;
	}

	public void desselecionar(){
		this.selecionada = false;
	}

	public boolean selecionada(){
		return this.selecionada;
	}
}