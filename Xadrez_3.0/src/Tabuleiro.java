import java.util.ArrayList;

public class Tabuleiro{
	private Casa casas[][];
	private int altura;
	private int largura;

	public Tabuleiro(int altura,int largura){
		
		this.casas = new Casa[altura][largura];
		this.altura = altura;
		this.largura = largura;

		for(int i =0;i<this.altura;i++){
			for(int j =0;j<this.largura;j++){
				casas[i][j] = new Casa(i,j);
			}
		}	
	}

	public int getAltura(){
		return this.altura;
	}

	public int getLargura(){
		return this.largura;
	}

	public void addPeca(Peca p, int x, int y){
		Casa c = this.casas[x][y];
		p.addCasa(c);
		c.addPeca(p);
	}

	public Casa getCasaNaPosicao(int x, int y){
		Casa c = this.casas[x][y];
		return c;
	}

	private void desselecionarCasas(){
		for(int i =0;i<this.altura;i++){
			for(int j =0;j<this.largura;j++){
				casas[i][j].desselecionar();
			}
		}
	}

	private ArrayList<Peca> acharTodasAsPecasSelecionadas(){
		ArrayList<Peca> pecas = new ArrayList<Peca>();
		for(int i =0;i<this.altura;i++){
			for(int j =0;j<this.largura;j++){
				Peca p = casas[i][j].getPeca();
				if(p != null && p.selecionada() == true){
					pecas.add(p);
				}
			}
		}
		return pecas;
	}

	public void atualizar(){

		ArrayList<Peca> pecasSelecionadas = this.acharTodasAsPecasSelecionadas();
		this.desselecionarCasas();
		
		ArrayList<Casa> casasSelecionadas = new ArrayList<Casa>();

		for(int i = 0;i<pecasSelecionadas.size();i++){
			ArrayList<Casa> casas = pecasSelecionadas.get(i).movimentosPossiveis(this);
			casasSelecionadas.addAll(casas);
		}

		for(int i = 0;i<casasSelecionadas.size();i++){
			casasSelecionadas.get(i).selecionar();
		}

	}

	
}