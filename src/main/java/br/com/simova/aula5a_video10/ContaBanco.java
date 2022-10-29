package br.com.simova.aula5a_video10;

public class ContaBanco {

    // Atributos de Classe. Também chamados de Membros de classe.
    public int numeroConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Método construtor com 3 parâmetros
    public ContaBanco(int numeroConta, String tipo, String dono) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0.0d;
        this.setStatus(false);
    }

    // Getters and Setters methods
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        if (this.tipo == "CC") { // Linha 63 se condição satisfeita, então execute bloco condicional (linha 64)
            this.setSaldo(50);
        } else if (this.tipo.equals("CP")) { // Linha 65 se condição satisfeita, então execute bloco condicional (linha 66)
            this.setSaldo(150);
        } else { // Se nenhuma condição foi satisfeita, então execute bloco condicional (linha 65)
            System.out.println("Tipo de conta inválida.");
        }

        this.status = true;
    }

    public void fecharConta() {

        if (status == false) { // comparação explícita
            System.out.println(getDono() + ", não é possível fechar sua conta, pois você não possui conta aberta. ;)");
        }

        if (status) { // comparação implícita
            if (saldo < 0.0) {
                System.out.println(getDono() + ", não é possível fechar sua conta, pois o saldo da conta está negativo em R$ "
                        + getSaldo() + " . Quite o débito antes de fechar a conta.");
            } else {
                this.status = false;
                System.out.println(getDono() + ", sua conta: Conta Número: " + getNumeroConta() + " foi encerrada.");
            }
        }
    }

    public void depositar(double valor) {

        if (status) {
            if (valor < 0.0) {
                this.setSaldo(saldo);
                System.out.println(getDono() + " não é possível depositar um valor menor que zero.");
            } else if (valor == 0.0) {
                this.setSaldo(saldo);
                System.out.println(getDono() + " não é possível depositar um valor igual a zero.");
            } else {
                System.out.println(getDono() + " fez um depósito no valor de R$ " + valor);
                this.setSaldo(saldo + valor);
            }
        } else {
            System.out.println(getDono() + " não é possível depositar, pois sua conta não está aberta.");
        }
    }

    public void sacar(double valor) {

        if (status) {
            if (valor > 0.0 && valor <= saldo) {
                System.out.println(this.getDono() + " fez um saque no valor de R$ " + valor);
                this.setSaldo(saldo - valor);
            } else if (valor < 0.0) {
                this.setSaldo(saldo);
                System.out.println(getDono() + ", não é possível sacar um valor menor que zero.");
            } else if (valor == 0.0) {
                this.setSaldo(saldo);
                System.out.println(getDono() + ", não é possível sacar um valor igual a zero.");
            } else {
                this.setSaldo(saldo);
                System.out.println(getDono() + ", não é possível sacar um valor maior que o saldo.");
            }
        } else {
            System.out.println(getDono() + ", não é possível sacar, pois sua conta não está aberta.");
        }
    }

    public void pagarMensalidade() {

        if (status){
            if (this.tipo.equals("CC")) {
                setSaldo(saldo - 12);
                System.out.println(getDono() + " pagou R$ 12,00 de mensalidade de conta.");
            }

            if (this.tipo.equals("CP")) {
                setSaldo(saldo - 20);
                System.out.println(getDono() + " pagou R$ 20,00 de mensalidade de conta.");
            }
        }else {
            System.out.println(getDono() + ", sua conta não está aberta. Logo não é possível pagar mensalidade.");
        }
    }

    public void exibirInformacoesConta() {
        System.out.println("Número Conta: " + this.getNumeroConta()
                + "\nTipo Conta: " + this.getTipo()
                + "\nDono: " + this.getDono()
                + "\nSaldo: R$ " + this.getSaldo()
                + "\nStatus: " + this.getStatus());
    }

    public void exibirTipoAndSaldoConta() {
        System.out.println(
                "Dono: " + getDono() + " Tipo Conta: " + this.getTipo() + "\tSaldo: R$ " + this.getSaldo());
    }

    @Override // Método toString é extendido da classe Object. @Override significa que o método herdado foi subescrito.
    public String toString() {
        return "Número Conta: " + numeroConta
                + "\nTipo Conta: " + tipo
                + "\nDono: " + dono
                + "\nSaldo: R$ " + saldo
                + "\nStatus: " + status;
    }
}
