//2.(0.05) Crie todas as pe�as necess�rias para que o jogo de xadrez funcione.
public class Rainha extends Peca{

		public Rainha(int cor) {
			super(cor);
		}
		public String getPecaIcone() {

			if(this.cor == Peca.BRANCA) {
				return "q";
			}else {
				return "Q";
				}
		}

}