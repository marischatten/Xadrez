//4.(0.10) Crie uma nova classe que desenhe o tabuleiro de forma diferente, mas sem reimplementar o método desenhar.
public class NewDesenharTabuleiroI extends DesenharTabuleiro{

	public NewDesenharTabuleiroI(Tabuleiro tabuleiro) {
		super(tabuleiro);
	}
	
	@Override
	protected void criarJuncao(){
		this.juncao = "¬";
	}

	@Override
	protected void criarAntesCasaSelecionada(){
		this.antesCasaSelecionada = ">";
	}
	@Override
	protected void criarDepoisCasaSelecionada(){
		this.depoisCasaSelecionada = "<";
	}
	@Override
	protected void criarEntrelinha(){
		this.entrelinha = "";
		for(int i =0;i<this.tabuleiro.getLargura();i++){
			this.entrelinha+= this.juncao+"___";
		}
		this.entrelinha += "¨¬\n";
	}
}
