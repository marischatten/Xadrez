//2.(0.05) Crie todas as peças necessárias para que o jogo de xadrez funcione.
import java.util.ArrayList;

public class Bispo extends Peca{
	
	/*9.O "desenho" das peças no terminal está na mesma classe que controla a lógica da peça. 
	 * Faça uma sugestão de como separar estas duas partes. (Não é preciso necessariamente implementar).
	 */
	
	/*AQUI PENSEI EM ADICIONAR COMO ATRIBUTO O ÍCONE A CADA TIPO DE PEÇA, E CRIAR A CLASSE FILHO COM O METODO QUE RETORNA O ÍCONE.
	 * 
	 * OU PENSEI TAMBEM EM INSERIR O ICONE COM ATRIBUTO NA CLASSE PAI(PECA), POREM DEVERIA TER UM METODO QUE VERIFICASSE QUAL 
	 * ÍCONE ATRIBUIR, ENTÃO O TIPO DE PEÇA SERIA PASSADO POR PARAMETRO QUANDO FOSSE CRIADO A PEÇA.
	 * OUTRA ALTERNATIVA É CIAR UM NOVA CLASSE, SENDO FILHA DA "PECA", QUE FICASSE RESPOSÁVEL PELOS ICONES, 
	 * POREM NÃO ESTARIA VISIVEL PARA AS ESPECIALIZAÇÕES.
	 */
	
		private static String icone;
		//String nome="Bispo";
		/*
		public void setIcone() {
			if(this.cor == Peca.BRANCA) {
				this.icone = "b";
			}else {
				this.icone = "B";
			}
		}
		public String getIcone() {
			return this.icone;
		}*/
	
		public Bispo(int cor) {
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

		//8.Escolha ou o Bispo ou o Cavalo e também implemente o método movimentosPossiveis.
		@Override
		public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){

			ArrayList<Casa> casas = new ArrayList<Casa>();

			int largura = this.getLargura();
			int altura = this.getAltura();
			
			int diagonalA=altura;
			int diagonalL=largura;
			
			Peca p;
			
			
			while((diagonalA > -1) && (diagonalL > -1)){
				Casa ca = tabuleiro.getCasaNaPosicao(diagonalA-1,diagonalL-1);
				if(ca.getPeca()!= null) {
					p = ca.getPeca();
					if(p.getCor() != this.cor  ) {
						casas.add(ca);
						break;
					}else if(p.getCor() ==this.cor){
						break;
					}
				}else if (ca.getPeca()== null){	
					casas.add(ca);
					diagonalA--;
					diagonalL--;
				}
				
			}
			
			diagonalA=altura;
			diagonalL=largura;
			
			while((diagonalA > -1) && (diagonalL < tabuleiro.getLargura() )) {
				Casa cb = tabuleiro.getCasaNaPosicao(diagonalA-1,diagonalL+1);
				if(cb.getPeca()!= null) {
					p = cb.getPeca();
					if(p.getCor() != this.cor  ) {
						casas.add(cb);
						break;
					}else if(p.getCor() ==this.cor){
						break;
					}
				}else{	
				casas.add(cb);
				diagonalA--;
				diagonalL++;
				}
			}
			
			diagonalA=altura;
			diagonalL=largura;
			
			while((diagonalA < tabuleiro.getAltura()) && (diagonalL > -1)) {
				Casa cc = tabuleiro.getCasaNaPosicao(diagonalA+1,diagonalL-1);
				if(cc.getPeca()!= null) {
					p = cc.getPeca();
					if(p.getCor() != this.cor  ) {
						casas.add(cc);
						break;
					}else if(p.getCor() ==this.cor){
						break;
					}
				}else{
				casas.add(cc);
				diagonalA++;
				diagonalL--;
				}
			}
			
			diagonalA=altura;
			diagonalL=largura;
			
			while((diagonalA < tabuleiro.getAltura()) && (diagonalL < tabuleiro.getLargura() )) {
				Casa cd = tabuleiro.getCasaNaPosicao(diagonalA+1,diagonalL+1);
				
				if(cd.getPeca()!= null) {
					p = cd.getPeca();
					if(p.getCor() != this.cor  ) {
						casas.add(cd);
						break;
					}else if(p.getCor() ==this.cor){
						break;
					}
				}else{
					casas.add(cd);
					diagonalA++;
					diagonalL++;
				}
			
				
			}
			
			
			
			casas.add(this.casa);

			return casas;
		}

}