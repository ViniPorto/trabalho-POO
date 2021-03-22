/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaa1p2ViniciusPortoGabrielChuler;

/**
 *
 * @author chuler
 */
public abstract class Veiculo {
    
    protected String identificacao;
    protected String proprietario;
    protected String nomeVeiculo;
    protected String fabricante;
    protected String cor;
    protected int velocidade;
    
    public Veiculo(String identificacao, String proprietario, String nomeVeiculo, String fabricante, String cor){
        this.identificacao = identificacao;
        this.proprietario = proprietario;
        this.nomeVeiculo = nomeVeiculo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.velocidade = 0;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void iniciarMovimento();
    public abstract void pararMovimento();
    public abstract void virarParaDireita();
    public abstract void virarParaEsquerda();
    
    protected void mostrarDados(){
        System.out.println("--------------------------------");
        System.out.println("Identificacao: " + this.identificacao);
        System.out.println("Proprietário: " + this.proprietario);
        System.out.println("Nome do Veículo: " + this.nomeVeiculo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cor: " + this.cor);
        System.out.println("--------------------------------");
    }
    
    
}
