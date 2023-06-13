
public class Simbolo{
    public String nome;
    public int tipo;
    public String valor;

    public static final int REAL = 0;
    public static final int INT = 1;

    public Simbolo(String nome, String tipo, String valor){
        this.nome = nome;
        this.valor = valor;
        if (tipo.equals("INT")) this.tipo = INT;
        else this.tipo = REAL;
    }

    public String generateCode(){
        String str;
        
        if (this.tipo == REAL){
            str = "\n\tdouble " + this.nome + ";\n";
        }
        else{
            str = "\n\tint " + this.nome + ";\n";
        }
        
        return str;
    }
    
    //fazer construtores setter e getter
    
    public String getNome(){
        return this.nome;
    }
}