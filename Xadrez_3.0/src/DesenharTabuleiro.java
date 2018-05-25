public class DesenharTabuleiro{

	private Tabuleiro tabuleiro;

	protected String entrelinha;
	protected String antesCasaVazia;
	protected String depoisCasaVazia;
	protected String antesCasaSelecionada;
	protected String depoisCasaSelecionada;
	protected String coluna;
	protected String juncao;

	public DesenharTabuleiro(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		this.criarAntesCasaVazia();
		this.criarDepoisCasaVazia();
		this.criarAntesCasaSelecionada();
		this.criarDepoisCasaSelecionada();
		this.criarColuna();
		this.criarJuncao();

		this.criarEntrelinha();
	}

	protected void criarColuna(){
		this.coluna = "|";
	}

	protected void criarJuncao(){
		this.juncao = "+";
	}

	protected void criarAntesCasaVazia(){
		this.antesCasaVazia = " ";
	}

	protected void criarDepoisCasaVazia(){
		this.depoisCasaVazia = " ";
	}

	protected void criarAntesCasaSelecionada(){
		this.antesCasaSelecionada = "-";
	}

	protected void criarDepoisCasaSelecionada(){
		this.depoisCasaSelecionada = "-";
	}

	protected void criarEntrelinha(){
		this.entrelinha = "";
		for(int i =0;i<this.tabuleiro.getLargura();i++){
			this.entrelinha+= this.juncao+"---";
		}
		this.entrelinha += "+\n";
	}

	public String desenhar(){
		String tab = "";
		
		tab += this.entrelinha;

		for(int j =0;j<this.tabuleiro.getAltura();j++){
			String linha = "";
			
			for(int i =0;i<this.tabuleiro.getLargura();i++){

				String antes = this.antesCasaVazia;
				String depois = this.depoisCasaVazia;

				if(this.tabuleiro.getCasaNaPosicao(j,i).selecionada()){
					antes = this.antesCasaSelecionada;
					depois = this.depoisCasaSelecionada;
				}

				if(this.tabuleiro.getCasaNaPosicao(j,i).temPeca()){
					Peca p = this.tabuleiro.getCasaNaPosicao(j,i).getPeca();
					String icone = p.getPecaIcone();
					linha+= this.coluna+antes+icone+depois;
				}else{
					linha+= this.coluna+antes+" "+depois;
				}
			}

			tab += linha+this.coluna+"\n";
			tab += this.entrelinha;
		}
		return tab;
	}
	

}