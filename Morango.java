
public class Morango extends BaseDecorator{
    
    public Morango(Adicional adicional) {
        super(adicional);
    }
    @Override
    public String getDescricao() {
        return "Morango + ("+super.getDescricao()+")";
    }
    
    @Override
    public String custo() {
        
        if (getTamanho() == Tamanho.Pequeno){
            return wrappee.custo() + "1 reais.";
        }else if (getTamanho() == Tamanho.Medio){
            return wrappee.custo() + "2 reais.";
        }else if (getTamanho() == Tamanho.Grande){
            return wrappee.custo() + "3 reais.";
        }else{
            return "Tamanho não escolhido";
        }
        
    }
}
