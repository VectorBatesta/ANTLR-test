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
    
    public void setVarTabela(TabelaSimbolo newVarTabela){
        this.varTabela = newVarTabela;
    }
    
    public void generateTarget() throws IOException{
        StringBuilder str = new StringBuilder();
        
		//dependencias
		//int main(void){
        str.append("#include <stdio.h>\n"
                +  "#include <stdlib.h>\n"
                +  "#include <stdbool.h>\n"
                +  "#include <string.h>\n"
                
                +  "\nint main(void){\n");
        
        for(Simbolo s : varTabela.getAll()){
            str.append(s.generateCode());
        }
        
        for(Comando m : comandos){
            str.append(m.generateCode());
        }
        
        str.append("\n\treturn 0;\n"        //  return 0;
                +  "}");                    //}
        
        FileWriter arq = new FileWriter(new File("codigoResultante.c"));
        arq.write(str.toString());
		arq.close();
    }
    
    public ArrayList<Comando> getComandos(){
        return this.comandos;
    }
    
    public void setComandos(ArrayList<Comando> entradaComandos){
        this.comandos = entradaComandos;
    }
}
