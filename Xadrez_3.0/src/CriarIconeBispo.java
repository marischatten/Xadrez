/*9.O "desenho" das peças no terminal está na mesma classe que controla a lógica da peça. 
 * Faça uma sugestão de como separar estas duas partes. (Não é preciso necessariamente implementar).
 */

//NESSA RESOLUÇÃO PRECISA SER FEITA UMA CLASSE FILHA PARA CADA TIPO DE PEÇA.
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
