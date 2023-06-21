public class Simbolo{
    public String nome;
    public int tipo;
    public String valor;

    public static final int REAL = 0;
    public static final int INT = 1;

	//entra significa "entrada"
    public Simbolo(String nomeEntra, String tipoEntra, String valorEntra){
        this.nome = nomeEntra;
        this.valor = valorEntra;
        if (tipoEntra.equals("INT")){
			this.tipo = INT;
		}
        else {
			this.tipo = REAL;
		}
    }

    public String generateCode(){
        if (this.tipo == REAL){
            return "\n\tdouble " + this.nome + ";\n";
        }
        else{
            return "\n\tint " + this.nome + ";\n";
        }
    }
	
	@Override
	public String toString(){
		return "[nome: " + this.nome +
			   ", tipo: " + this.tipo +
			   ", valor: " + this.valor + "]\n";
	}
    
    //fazer construtores setter e getter
    
    public String getNome(){
        return this.nome;
    }
	
	public void setNome(String n){
		this.nome = n;
	}
	
	public int getTipo(){
		return this.tipo;
	}
	
	public void setTipo(int t){
		this.tipo = t;
	}
	
	public String getValue(){
		return this.valor;
	}
	
	public void setValue(String v){
		this.valor = v;
	}
}