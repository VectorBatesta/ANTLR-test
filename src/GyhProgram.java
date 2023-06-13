
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GyhProgram {
    private TabelaSimbolo varTabela;
    private ArrayList<Comando> comandos;
    
    public TabelaSimbolo getVarTabela(){
        return varTabela;
    }
    
    public void setVarTabela(TabelaSimbolo varTabela){
        this.varTabela = varTabela;
    }
    
    public void generateTarget() throws IOException{
        StringBuilder str = new StringBuilder();
        
        str.append("#include <stdio.h>\n"
                +  "#include <stdlib.h>\n"
                +  "#include <stdbool.h>\n"
                +  "#include <string.h>\n"
                
                +  "\n\nint main(void){\n");//int main(void){
        
        for(Simbolo symbol : varTabela.getAll()){
            str.append(symbol.generateCode());
        }
        
        for(Comando cmd : comandos){
            str.append(cmd.generateCode());
        }
        
        str.append("\n\treturn 0;\n"        //  return 0;
                +  "}\n");                  //}
        
        FileWriter arq = new FileWriter(new File("codigo.c"));
        arq.write(str.toString());
    }
    
    
    public ArrayList<Comando> getComandos(){
        return comandos;
    }
    
    public void setComando(ArrayList<Comando> entrada){
        this.comandos = entrada;
    }
}
