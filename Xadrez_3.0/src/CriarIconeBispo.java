/*9.O "desenho" das pe�as no terminal est� na mesma classe que controla a l�gica da pe�a. 
 * Fa�a uma sugest�o de como separar estas duas partes. (N�o � preciso necessariamente implementar).
 */

//NESSA RESOLU��O PRECISA SER FEITA UMA CLASSE FILHA PARA CADA TIPO DE PE�A.
public class CriarIconeBispo extends Bispo {


	public CriarIconeBispo(int cor) {
		super(cor);
	}
	
	@Override
	public String getPecaIcone() {

		if(this.cor == Peca.BRANCA) {
			return "b";
		}else {
			return "B";
			}
	}
}
