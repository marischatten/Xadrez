//2.(0.05) Crie todas as peças necessárias para que o jogo de xadrez funcione.
import java.util.ArrayList;


public class Cavalo extends Peca{

		public Cavalo(int cor) {
			super(cor);
		}
		public String getPecaIcone() {

			if(this.cor == Peca.BRANCA) {
				return "c";
			}else {
				return "C";
				}
		}
		//8.Escolha ou o Bispo ou o Cavalo e também implemente o método movimentosPossiveis.
		
		@Override
		public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){
			
			ArrayList<Casa> casas = new ArrayList<Casa>();

			int largura = this.getLargura();
			int altura = (this.getAltura());
			
			Casa c = tabuleiro.getCasaNaPosicao(altura+2,largura+1);
			//frente direita
			if(c.getPeca() == null || c.getPeca() != null  && this.cor != c.getPeca().getCor() ){
				casas.add(c);
				casas.add(this.casa);
			}
			
			c = tabuleiro.getCasaNaPosicao(altura+2,largura-1);
			//frente esquerda
			if(c.getPeca() == null || c.getPeca() != null  && this.cor != c.getPeca().getCor() ){
				casas.add(c);
				casas.add(this.casa);
			}
			return casas;
		}

}