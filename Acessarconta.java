import contabancaria.InformacoesDaConta;

public class Acessarconta {
    public static void main (String[] args){
        InformacoesDaConta conta1 = new InformacoesDaConta();
        conta1.setNome("Juliano Silva");
        conta1.setNumeroDaConta(123456789);
        conta1.setSaldoDaConta(300.7);
        conta1.informacoesDaConta();
        conta1.despositar(500.9);
        conta1.informacoesDaConta();
        conta1.sacar(900);
        conta1.informacoesDaConta();
        conta1.despositar(300);
        conta1.sacar(300);
        conta1.historicoDetrasacoes();
    }
}
