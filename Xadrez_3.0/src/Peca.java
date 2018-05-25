import java.util.ArrayList;

public abstract class Peca extends Selecionavel{

	public static int BRANCA = 0;
	public static int PRETA = 1;
	
	protected Casa casa;
	protected int cor;

	private int altura;
	private int largura;


	public Peca(int cor){
		super();
		this.cor = cor;
	}

	public void addCasa(Casa c){
		this.casa = c;
		this.altura = c.getAltura();
		this.largura = c.getLargura();
	}

	public boolean temMesmaCor(Peca outra){
		if(this.cor == outra.cor){
			return true;
		}else{
			return false;
		}
	}

	public int getCor(){
		return this.cor;
	}

	public Casa getCasa(){
		return this.casa;
	}

	public int getAltura(){
		return this.altura;
	}

	public int getLargura(){
		return this.largura;
	}

	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){
		return null;
	}

	public String getPecaIcone() {
	
		return null;
	}



}