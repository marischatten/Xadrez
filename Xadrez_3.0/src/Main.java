public class Main{
	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro(8,8); //(0.05) Mude o tabuleiro para que tenha o tamanho real de um jogo de xadrez
		DesenharTabuleiro desenharTabuleiro = new DesenharTabuleiro(tabuleiro);

		Peca pb1 = new Peao(Peca.BRANCA);
		Peca pb2 = new Peao(Peca.BRANCA);
		Peca pb3 = new Peao(Peca.BRANCA);
		Peca pb4 = new Peao(Peca.BRANCA);
		Peca pb5 = new Peao(Peca.BRANCA);
		Peca pb6 = new Peao(Peca.BRANCA);
		Peca pb7 = new Peao(Peca.BRANCA);
		Peca pb8 = new Peao(Peca.BRANCA);

		tabuleiro.addPeca(pb1, 1, 0);
		tabuleiro.addPeca(pb2, 1, 1);
		tabuleiro.addPeca(pb3, 1, 2);
		tabuleiro.addPeca(pb4, 1, 3);
		tabuleiro.addPeca(pb5, 1, 4);
		tabuleiro.addPeca(pb6, 1, 5);
		tabuleiro.addPeca(pb7, 1, 6);
		tabuleiro.addPeca(pb8, 1, 7);
		
		Peca pp1 = new Peao(Peca.PRETA);
		Peca pp2 = new Peao(Peca.PRETA);
		Peca pp3 = new Peao(Peca.PRETA);
		Peca pp4 = new Peao(Peca.PRETA);
		Peca pp5 = new Peao(Peca.PRETA);
		Peca pp6 = new Peao(Peca.PRETA);
		Peca pp7 = new Peao(Peca.PRETA);
		Peca pp8 = new Peao(Peca.PRETA);
		

		tabuleiro.addPeca(pp1, 6, 0);
		tabuleiro.addPeca(pp2, 6, 1);
		tabuleiro.addPeca(pp3, 6, 2);
		tabuleiro.addPeca(pp4, 6, 3);
		tabuleiro.addPeca(pp5, 6, 4);
		tabuleiro.addPeca(pp6, 6, 5);
		tabuleiro.addPeca(pp7, 6, 6);
		tabuleiro.addPeca(pp8, 6, 7);

		Peca tb1 = new Torre(Peca.BRANCA);
		Peca tb2 = new Torre(Peca.BRANCA);
		
		tabuleiro.addPeca(tb1, 0, 0);
		tabuleiro.addPeca(tb2, 0, 7);
		
		Peca tp1 = new Torre(Peca.PRETA);
		Peca tp2 = new Torre(Peca.PRETA);

		tabuleiro.addPeca(tp1, 7, 0);
		tabuleiro.addPeca(tp2, 7, 7);
		
		Peca cb1 = new Cavalo(Peca.BRANCA);
		Peca cb2 = new Cavalo(Peca.BRANCA);
		
		tabuleiro.addPeca(cb1, 0, 1);
		tabuleiro.addPeca(cb2, 0, 6);
		
		Peca cp1 = new Cavalo(Peca.PRETA);
		Peca cp2 = new Cavalo(Peca.PRETA);
		
		tabuleiro.addPeca(cp1, 7, 1);
		tabuleiro.addPeca(cp2, 7, 6);
		
		Peca bb1 = new Bispo(Peca.BRANCA);
		Peca bb2 = new Bispo(Peca.BRANCA);
		
		tabuleiro.addPeca(bb1, 0, 2);
		tabuleiro.addPeca(bb2, 0, 5);
		
		Peca bp1 = new Bispo(Peca.PRETA);
		Peca bp2 = new Bispo(Peca.PRETA);
		
		tabuleiro.addPeca(bp1, 7, 2);
		tabuleiro.addPeca(bp2, 7, 5);
		
		Peca qb = new Rainha(Peca.BRANCA);
		Peca qp = new Rainha(Peca.PRETA);
		
		tabuleiro.addPeca(qb, 0, 3);
		tabuleiro.addPeca(qp, 7, 3);
		
		Peca rb = new Rei(Peca.BRANCA);
		//Peca rp = new Rei(Peca.PRETA);
		
		tabuleiro.addPeca(rb, 0, 4);
		//tabuleiro.addPeca(rp, 7, 4);
		

		Peca b1 = new Bispo(Peca.PRETA);
		tabuleiro.addPeca(b1,3,3);
		Peca t1 = new Torre(Peca.PRETA);
		tabuleiro.addPeca(t1,2,2);
		Peca p1 = new Peao(Peca.PRETA);
		tabuleiro.addPeca(p1, 4, 6);
		
		
		//t1.selecionar();
		//b1.selecionar();
		//p1.selecionar();
		
		tabuleiro.atualizar();
		
		String s = desenharTabuleiro.desenhar();
		System.out.println(s);
		//3.(0.10) Tente criar um objeto do tipo Peca. O que acontece? Porqu�? (pesquisar o que � uma classe abstrata).
		/*criar objeto do tipo pe�a
		 * Peca peca = new Peca();
		 *	As classes abstratas s�o as que n�o permitem realizar qualquer tipo de inst�ncia.
		 *  S�o classes feitas especialmente para serem modelos para suas classes derivadas.
		 *  As classes derivadas, via de regra, dever�o sobrescrever os m�todos para realizar a implementa��o dos mesmos. 
		 *  As classes derivadas das classes abstratas s�o conhecidas como classes concretas.
		 *	Como medida de seguran�a, as classes abstratas somente podem ser estendidas, sendo que a cria��o de um objeto a partir da mesma � um procedimento evitado. 
		 *  Al�m disso, caso um ou mais m�todos abstratos estejam presentes nessa classe abstrata,  a classe filha ser�, ent�o, for�ada a definir tais m�todos, pois, caso contr�rio,  a classe filha tamb�m se tornar� abstrata.
		 *	A funcionalidade dos m�todos abstratos que s�o herdados pelas classes filha normalmente � atribu�da de acordo com o objetivo ou o prop�sito dessas classes. 
		 *	� poss�vel, por�m, n�o atribuirmos uma funcionalidade a esses m�todos abstratos. Neste caso, faz-se necess�rio, pelo menos, declarar tais m�todos.

		 */
		
	}
}