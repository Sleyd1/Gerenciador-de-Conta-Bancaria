package contabancaria;


public class InformacoesDaConta {
    private String nome;
    private int numeroDaConta;
    private double saldoDaConta;

    public double[] transacoes = new double[]{};
    //public double[] sacado = new double[]{};


    public InformacoesDaConta (){

    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta){
        this.saldoDaConta = saldoDaConta;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldoDaConta(){
        return saldoDaConta;
    }

    public void informacoesDaConta(){
        System.out.println("*----------------------------------------*");
        System.out.println("nome do titular: "+ getNome());
        System.out.println("número da conta: "+ getNumeroDaConta());
        System.out.println("saldo da conta: "+ getSaldoDaConta());
        System.out.println("*-----------------------------------------*");
    }

    public void despositar(double valor){
        if (this.saldoDaConta == 0 ){
            this.saldoDaConta = valor;
        } else {

            this.saldoDaConta += valor;
            transacoes = new double[1];
            transacoes[0] = valor;

        }

    }

    public void sacar(double valor){
        if (valor > this.saldoDaConta ){
            System.out.println("[Não foi possivel fazer o saque, você tem " + saldoDaConta +" disponivel para saque.]");

        } else {

            this.saldoDaConta -= valor;
            transacoes = new double[1];
            transacoes[0] = -valor;

        }

    }

    public void historicoDetrasacoes(){
            for ( double c : transacoes){
                if (c < 0){
                    System.out.println("dinheiro sacado: " + c);
                }
                else {
                    System.out.println("dinheiro depositado: "+ c);
                }


            }
        System.out.println("Saldo do dia: "+ getSaldoDaConta());


    }



}
