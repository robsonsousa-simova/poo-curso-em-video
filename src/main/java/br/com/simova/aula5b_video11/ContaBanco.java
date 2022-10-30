package br.com.simova.aula5b_video11;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0f;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual(){

        System.out.println("--------------------------------\n"
                + "Conta: " + getNumConta() + "\tTipo: " + getTipo() + "\tDono: " + getDono() + "\tSaldo: R$ " + getSaldo() + "\tStatus: " + isStatus() + "\n--------------------------------\n");
    }

    public void abrirConta(String tipo) {

        if (tipo.equals("CC")) {
            this.tipo = tipo;
            this.saldo = 50;
            this.status = true;
            System.out.println(getDono() + ", sua conta tipo " +  getTipo() + " foi aberta com sucesso.");
        } else if (tipo.equals("CP")) {
            this.tipo = tipo;
            this.saldo = 150;
            this.status = true;
            System.out.println(getDono() + ", sua conta tipo " +  getTipo() + " foi aberta com sucesso.");
        } else {
            this.tipo = tipo;
            this.status = false;
            System.out.println(getDono() + ", sua conta não pode ser aberta, pois a Conta tipo " + getTipo() + " é inválida.");
        }
    }

    public void fecharConta() {

        if (status) {

            if (this.saldo > 0) {
                System.out.println(getDono() + " sua conta não pode ser fechada ainda, pois há um saldo positivo no valor de R$ " + getSaldo());
            }

            else if (this.saldo < 0) {
                System.out.println(getDono() + " sua conta não pode ser fechada pois há um saldo negativo de R$ " + getSaldo());
            }else {
                this.status = false;
                System.out.println(getDono() + ", fechou sua conta com sucesso.");
            }

        } else {

            System.out.println(getDono() + " não é possível fechar uma conta que não foi aberta. Status: " + isStatus());
        }
    }

    public void depositar(float valor) {

        if (status) {
            this.saldo = saldo + valor;
            System.out.println(getDono() + ", depositou R$ " + valor  + " em sua conta.");
        } else {
            System.out.println(getDono() + ", não é possível depositar em uma conta fechada.");
        }
    }

    public void sacar(float valor) {

        if (status) {
            if (saldo >= valor) {
                this.saldo = saldo - valor;
                System.out.println(getDono() + ", sacou R$ " + valor + " de sua conta.");
            } else {
                System.out.println(getDono() + ", saldo insuficiente  para saque.");
            }
        } else {
            System.out.println(getDono() + ", não é possível sacar, pois sua conta está fechada.");
        }
    }

    public void pagarMensal() {
        int valor = 0;

        if (tipo.equals("CC")) {
            valor = 12;
        } else if (tipo.equals("CP")) {
            valor = 20;
        }

        if (status) {
            this.saldo = (saldo - valor);
            System.out.println(getDono() + " pagou a mensalidade de R$ " + valor + " com sucesso.");
        } else {
            System.out.println(getDono() + ", não é possível pagar a mensalidade de uma conta que está fechada.");
        }
    }
}
