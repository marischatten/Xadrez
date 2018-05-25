
public class NewDesenharTabuleiroII extends DesenharTabuleiro {

	public NewDesenharTabuleiroII(Tabuleiro tabuleiro) {
		super(tabuleiro);
	}
	
	//5.(0.10) Crie uma classe que desenhe o tabuleiro de forma diferente, mas agora reimplementando o método desenhar.
	//O TABULEIRO FICA MAIOR
	
	@Override
	protected void criarEntrelinha(){
		this.entrelinha = "";
		for(int i =0;i<this.tabuleiro.getLargura();i++){
			this.entrelinha+= this.juncao+"---";
		}
		this.entrelinha += "+\n";
	}
	
	
	@Override
	public String desenhar(){ 
		
		String tab = "";
		
		tab += this.entrelinha;

		for(int j =0;j<this.tabuleiro.getAltura();j++){
			String linha = "";
			
			for(int i =0;i<this.tabuleiro.getLargura();i++){

				String antes = this.antesCasaVazia+this.antesCasaVazia;
				String depois = this.depoisCasaVazia+this.depoisCasaVazia;

				if(this.tabuleiro.getCasaNaPosicao(j,i).selecionada()){
					antes = this.antesCasaSelecionada+this.antesCasaSelecionada;
					depois = this.depoisCasaSelecionada+this.depoisCasaSelecionada;
				}

				if(this.tabuleiro.getCasaNaPosicao(j,i).temPeca()){
					Peca p = this.tabuleiro.getCasaNaPosicao(j,i).getPeca();
					String icone = p.getPecaIcone();
					linha+= this.coluna+this.coluna+antes+icone+depois;
				}else{
					linha+= this.coluna+this.coluna+antes+" "+depois;
				}
			}

			tab += linha+this.coluna+"\n"; //this.coluna
			tab += this.entrelinha;
		}
		return tab;
	}
}
