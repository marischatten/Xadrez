//2.(0.05) Crie todas as peças necessárias para que o jogo de xadrez funcione.
import java.util.ArrayList;

public class Torre extends Peca{

	public Torre(int cor){
		super(cor);
	}

	//6.(0.15) Faça com que o método movimentosPossiveis da Torre devolva as casas as quais ela pode se mexer.
	@Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){

		ArrayList<Casa> casas = new ArrayList<Casa>();

		int largura = this.getLargura();
		int altura = this.getAltura();
		
		int cima = altura+1;
		int baixo = altura-1;
		int direita = largura+1;
		int esquerda = largura-1;
	
		
		Casa c;
		while(cima <  8  ){
			
			c = tabuleiro.getCasaNaPosicao(cima,largura);
			if(c.getPeca()==null) {
				casas.add(c);
				
			}else if(this.getCor() != c.getPeca().getCor()  && c.getPeca() != null  ) { 
					casas.add(c);
					break;
			}else{
				break;
			}
			cima++;
			
			
		}

		while(baixo > -1 ) {
			c = tabuleiro.getCasaNaPosicao(baixo,largura);
			if(c.getPeca()==null) {
				casas.add(c);
				
			}else if(this.getCor() != c.getPeca().getCor()  && c.getPeca() != null  ) { 
					casas.add(c);
					break;
			}else{
				break;
			}
			baixo--;
		}

		while(direita < 8) {
			c = tabuleiro.getCasaNaPosicao(altura,direita);
			if(c.getPeca()==null) {
				casas.add(c);
				
			}else if(this.getCor() != c.getPeca().getCor()  && c.getPeca() != null  ) { 
					casas.add(c);
					break;
			}else{
				break;
			}
			direita++;
		}

		while(esquerda > -1 ) {
			c = tabuleiro.getCasaNaPosicao(altura,esquerda);
			if(c.getPeca()==null) {
				casas.add(c);
				
			}else if(this.getCor() != c.getPeca().getCor()  && c.getPeca() != null  ) { 
					casas.add(c);
					break;
			}else{
				break;
			}
			esquerda--;
		}

		casas.add(this.casa);

		return casas;
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "t";
		}else{
			return "T";
		}
	}
}