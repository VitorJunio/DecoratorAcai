public class Acai implements Adicional{
    
    public Tamanho tamanho;
    
    public Acai(Tamanho tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Creme de Açai ";
    }
    
    @Override
    public String custo(){
        if (tamanho == Tamanho.Pequeno){
            return "10 reais.";
        }else if (tamanho == Tamanho.Medio){
            return "15 reais.";
        }else if (tamanho == Tamanho.Grande){
            return "20 reais.";
        }else{
            return "Tamanho não escolhido";
        }
    }
    

    
    public Tamanho getTamanho() {
        return tamanho;
    }

}
