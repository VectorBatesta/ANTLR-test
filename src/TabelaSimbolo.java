import java.util.HashMap;

public class TabelaSimbolo{
    private HashMap<String, Simbolo> tabela;
    
    public TabelaSimbolo(){
        this.tabela = new HashMap<String, Simbolo>();
    }

    public void setTabela(HashMap<String, Simbolo> tabela){
        this.tabela = tabela;
    }

    public HashMap getTabela(){
        return this.tabela;
    }

    public void add(Simbolo simbolo){
        this.tabela.put(simbolo.getNome(), simbolo);
    }

    public boolean exists(String){
        return this.tabela.get(nome) != null;
    }

    //criar getter setter
}