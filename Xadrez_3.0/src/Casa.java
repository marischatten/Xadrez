public class Casa extends Selecionavel{
	private Peca peca;
	private int altura;
	private int largura;

	public Casa(int a, int l){
		super();
		this.largura = l;
		this.altura = a;
		this.peca = null;
	}

	public void addPeca(Peca p){
		this.peca = p;
	}

	public Peca getPeca(){
		return this.peca;
	}

	public Peca removePeca(){
		Peca p = this.peca;
		this.peca = null;
		return p;
	}

	public boolean temPeca(){
		if(this.peca != null){
			return true;
		}else{
			return false;
		}
	}
	public int getAltura(){
		return this.altura;
	}
	public int getLargura(){
		return this.largura;
	}
}