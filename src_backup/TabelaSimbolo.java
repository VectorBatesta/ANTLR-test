import java.util.ArrayList;
import java.util.HashMap;

public class TabelaSimbolo{
    private HashMap<String, Simbolo> tabela;
    
    public TabelaSimbolo(){
        this.tabela = new HashMap<>();
    }

    public void setTabela(HashMap<String, Simbolo> newTabela){
        this.tabela = newTabela;
    }

    public HashMap<String, Simbolo> getTabela(){
        return this.tabela;
    }

    public void add(Simbolo simbolo){
		//enfia <simbolo.nome, simbolo> dentro do hashmap
        this.tabela.put(simbolo.getNome(), simbolo);
    }

    public boolean exists(String nome){
		//retorna true se ter
		//retorna falso se nao ter
        return this.tabela.get(nome) != null;
    }

	//retorna os valores do hashmap em forma de arraylist
    public ArrayList<Simbolo> getAll(){
        ArrayList<Simbolo> lista = new ArrayList<>();
        
        for(Simbolo s : tabela.values()){
            lista.add(s);
        }
        
        return lista;
    }
    
    //criar getter setter
}