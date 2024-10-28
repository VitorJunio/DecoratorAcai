
public class Banana extends BaseDecorator{
    
    public Banana(Adicional adicional) {
        super(adicional);
    }
    @Override
    public String getDescricao() {
        return "Banana + ("+super.getDescricao()+")";
    }
    
    
    @Override
    public String custo() {
        
        if (getTamanho() == Tamanho.Pequeno){
            return wrappee.custo() + "1.5 reais.";
        }else if (getTamanho() == Tamanho.Medio){
            return wrappee.custo() + "2.5 reais.";
        }else if (getTamanho() == Tamanho.Grande){
            return wrappee.custo() + "3.5 reais.";
        }else{
            return "Tamanho não escolhido";
        }
        
    }
}
