import java.util.ArrayList;
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

    public boolean exists(String nome){
        return this.tabela.get(nome) != null;
    }

    public ArrayList<Simbolo> getAll(){
        ArrayList<Simbolo> lista = new ArrayList<>();
        
        for(Simbolo s : tabela.values()){
            lista.add(s);
        }
        
        return lista;
    }
    
    //criar getter setter
}