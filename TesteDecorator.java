
public class TesteDecorator {

    public static void main(String[] args) {
        
        Adicional acaiPequeno = new Acai(Tamanho.Pequeno);
        System.out.println(acaiPequeno.getDescricao() + " Valor: R$ " + acaiPequeno.custo());
        
        Adicional acaiMedio = new Acai(Tamanho.Medio);
        System.out.println(acaiMedio.getDescricao() + " Valor: R$ " + acaiMedio.custo());
        
        Adicional acaiGrande = new Acai(Tamanho.Grande);
        System.out.println(acaiGrande.getDescricao() + " Valor: R$ " + acaiGrande.custo());
        
        Adicional acaiMorango = new Morango(acaiPequeno);
        System.out.println(acaiMorango.getDescricao() + " Valor: R$ " + acaiMorango.custo());
        
        Adicional acaiBanana = new Banana(acaiMedio);
        System.out.println(acaiBanana.getDescricao() + " Valor: R$ " + acaiBanana.custo());
        
        Adicional acaiLeiteCondensado = new Banana(acaiGrande);
        System.out.println(acaiLeiteCondensado.getDescricao() + " Valor: R$ " + acaiLeiteCondensado.custo());
        
        Adicional acaiBananaLeiteCondensado = new Banana(new LeiteCondensado(acaiMedio));
        System.out.println(acaiBananaLeiteCondensado.getDescricao() + " Valor: R$ " + acaiBananaLeiteCondensado.custo());

        
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(acaiGrande)));
        System.out.println(acaiCompleto.getDescricao() + " Valor: R$ " + acaiCompleto.custo());
    }
}
