public class CriaConta { 

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.agencia = 0001;
        primeiraConta.numeroConta = 12345;
        primeiraConta.titular = "Aaron Dias";
        primeiraConta.saldo = 200; 
        
        System.out.println("Agencia: "+ primeiraConta.agencia);
        System.out.println("Conta: "+ primeiraConta.numeroConta);
        System.out.println("Titular: "+ primeiraConta.titular);
        System.out.println("Saldo em Conta: "+ primeiraConta.saldo);
        

        Conta segundaConta = new Conta();
        segundaConta.agencia = 0001;
        segundaConta.numeroConta = 67890;
        segundaConta.titular = "Carlota Silva";
        segundaConta.saldo = 350;
        
        System.out.println("Agencia: "+ segundaConta.agencia);
        System.out.println("Conta: "+ segundaConta.numeroConta);
        System.out.println("Titular: "+ segundaConta.titular);
        System.out.println("Saldo em Conta: "+ segundaConta.saldo);
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
