//2.(0.05) Crie todas as pe�as necess�rias para que o jogo de xadrez funcione.
public class Rei extends Peca{

		public Rei(int cor) {
			super(cor);
		}
		public String getPecaIcone() {

			if(this.cor == Peca.BRANCA) {
				return "r";
			}else {
				return "R";
				}
		}

}
