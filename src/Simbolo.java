public class Simbolo(){
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

    
    //fazer construtores setter e getter
}