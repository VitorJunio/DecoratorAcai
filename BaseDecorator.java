public class BaseDecorator implements Adicional{
    
    protected Adicional wrappee;
    
    public BaseDecorator(Adicional adicional){
        this.wrappee = adicional;
    }
    @Override
    public String getDescricao() {
        return wrappee.getDescricao();
    }
    @Override
    public String custo() {
        return wrappee.custo();
    }
    
    public Tamanho getTamanho() {
        if (wrappee instanceof Acai) {
            return ((Acai) wrappee).getTamanho();
        } else if (wrappee instanceof BaseDecorator) {
            return ((BaseDecorator) wrappee).getTamanho();
        }
        return Tamanho.Pequeno; 
    }
}
