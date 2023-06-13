public class ComandoLeitura extends Comando{
    private String id;

    @Override
    public String generateCode() {
        return "\n\tscanf(\"%d\", %"+ this.id +"\");";
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String entra){
        this.id = entra;
    }
}