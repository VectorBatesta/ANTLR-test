
import java.io.IOException;
import java.util.HashMap;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {
    public static void main(String[] args) throws IOException {
        String nomeArquivo = "programa21.gyh";
        
        HashMap<Integer, String> table = new HashMap<Integer, String>();
        table.put(123, "aaaa");
        table.put(312, "fusca");
        
        System.out.println(table.get(123));
        
        //0 - lexica
        //1 - sintatica
        //2 - semantica
        int selecao = 1;

        //LEXICA
        if (selecao == 0){
            CharStream cs = CharStreams.fromFileName(nomeArquivo);
            GyhLangLexer lexer = new GyhLangLexer(cs);

            Token t;

            while( (t = lexer.nextToken()).getType() != Token.EOF){
                System.out.println("<" + lexer.VOCABULARY.getSymbolicName(t.getType()) + ", " + t.getText() + ">");
            }
        }
        
        //SINTATICA
        else if (selecao == 1){
            CharStream cs = CharStreams.fromFileName(nomeArquivo);
            GyhLangLexer lexer = new GyhLangLexer(cs);

            CommonTokenStream token = new CommonTokenStream(lexer);
            GyhLangParser parser = new GyhLangParser(token);

            parser.prog();
        }
    }
}
