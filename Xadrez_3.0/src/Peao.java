//2.(0.05) Crie todas as peças necessárias para que o jogo de xadrez funcione.
import java.util.ArrayList;

public class Peao extends Peca{

	public Peao(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "p";
		}else{
			return "P";
		}
	}
	//7.(0.10) Faça com que o movimentosPossiveis do Peao devolva as casas as quais ele pode se mexer. 
	@Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){
		
		ArrayList<Casa> casas = new ArrayList<Casa>();

		int largura = this.getLargura();
		int altura = (this.getAltura());
		
		Casa c = tabuleiro.getCasaNaPosicao(altura,largura);
		Peca p = c.getPeca();
		if(p.getCor()== Peca.BRANCA && p.getAltura() == 1 ) {
			c = tabuleiro.getCasaNaPosicao(altura+1,largura);
			casas.add(c);
			c = tabuleiro.getCasaNaPosicao(altura+2,largura);
			casas.add(c);	
			
		}else {
			c = tabuleiro.getCasaNaPosicao(altura+1,largura);
			casas.add(c);
		}

		
		c = tabuleiro.getCasaNaPosicao(altura+1,largura);
		if(c.getPeca()!= null) {
			p = c.getPeca();
			if(p.getCor() != this.cor  ) {
				casas.add(c);
			}
		}	
		c = tabuleiro.getCasaNaPosicao(altura+1,largura-1);
		if(c.getPeca()!= null) {
			p = c.getPeca();
			if(p.getCor()!= this.cor) {
				casas.add(c);
			}
		}
		
		casas.add(this.casa);
		
		return casas;
	}
}