package provaa1p2ViniciusPortoGabrielChuler;

public class CarroHibrido extends Veiculo implements Helicoptero, Lancha, Automovel {

    protected boolean ligado;
    protected boolean movimentoIniciado;
    protected boolean decolado;
    protected boolean helicesAcionadas;
    protected boolean ancoraLancada;
    protected boolean cascoAcionado;
    protected boolean movimentoAutomovel;

    public CarroHibrido(String identificacao, String proprietario, String nomeVeiculo, String fabricante, String cor) {
        super(identificacao, proprietario, nomeVeiculo, fabricante, cor);
        this.ligado = false;
        this.movimentoIniciado = false;
    }

    //veículo    
    @Override
    public void ligar() {
        if(!this.ligado){
            System.out.println("Ligado!");
            this.ligado = true;
        }else{
            System.out.println("Não é possível ligar um veículo ligado!");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado){
            System.out.println("Desligado!");
            this.ligado = false;
        }else{
            System.out.println("Não é possível desligar um veículo desligado!");
        }
    }

    @Override
    public void iniciarMovimento() {
        if(this.ligado){
            if (!this.movimentoIniciado) {
                System.out.println("Movimento iniciado!");
                this.movimentoIniciado = true;
                this.velocidade = 40;
            } else {
                System.out.println("Movimento ja foi iniciado anteriormente!");
            }
        } else {
            System.out.println("Veículo está atualmente desligado");
        }
    }

    @Override
    public void pararMovimento() {
        if(this.movimentoIniciado){
            System.out.println("Movimento terminado!");
            this.movimentoIniciado = false;
            this.velocidade = 0;
        } else {
            System.out.println("Movimento não foi iniciado!");
        }
    }

    @Override
    public void virarParaDireita() {
        if(this.ligado){
            if(this.movimentoIniciado){
                System.out.println("Virando para a direita!");
            } else {
                System.out.println("Movimento não foi iniciado!");
            }
        } else {
            System.out.println("Veículo está atualmente desligado");
        }
    }

    @Override
    public void virarParaEsquerda() {
        if(this.ligado){
            if(this.movimentoIniciado){
                System.out.println("Virando para a esquerda!");
            } else {
                System.out.println("Movimento não foi iniciado!");
            }
        } else {
            System.out.println("Veículo está atualmente desligado");
        }
    }
    
    @Override
    public void voar() {
        if(this.decolado){
            System.out.println("Helicoptero voando!");
        } else {
            System.out.println("Helicoptero não decolou ainda!");
        }
    }

    @Override
    public void decolar() {
        if(this.ligado && this.helicesAcionadas){
            System.out.println("Helicoptero decolou!");
            this.decolado = true;
        } else {
            System.out.println("Helicóptero não conseguiu decolar!");
        }
    }

    @Override
    public void aterrissar() {
        if(this.ligado && this.decolado){
            System.out.println("Helicóptero aterrissou!");
            this.decolado = false;
        } else {
            System.out.println("Helicóptero não pode aterrissar!");
        }

    }

    @Override
    public void acionarHelices() {
        if(this.ligado && !this.cascoAcionado){
            System.out.println("Hélices acionadas!");
            this.helicesAcionadas = true;
        } else {
            System.out.println("Hélices não puderam ser acionadas!");
        }
    }

    ////helicóptero
    @Override
    public void recolherHelices() {
        if(this.ligado && this.helicesAcionadas){
            System.out.println("Hélices recolhidas!");
            this.helicesAcionadas = false;
        } else {
            System.out.println("Hélices não puderam ser recolhidas!");
        }
    }

    @Override
    public void mostrarDadosHelicop() {
        System.out.println("Dados da forma de helicóptero");
        super.mostrarDados();
    }

    @Override
    public void navegar() {
        if(this.ligado && !this.ancoraLancada && this.cascoAcionado){
            System.out.println("Lancha navegado!");
        } else {
            System.out.println("Não foi possível navegar!");
        }
    }

    @Override
    public void lancarAncora() {
        if(this.ligado && this.cascoAcionado && !this.ancoraLancada){
            System.out.println("Ancora lançada!");
            this.ancoraLancada = true;
        } else {
            System.out.println("Não foi possível lancar ancora!");
        }
    }

    @Override
    public void recolherAncora() {
        if(this.ligado && this.cascoAcionado && this.ancoraLancada){
            System.out.println("Ancora recolhida!");
            this.ancoraLancada = false;
        } else {
            System.out.println("Não foi possível recolher ancora!");
        }
    }

    @Override
    public void acionarCasco() {
        if(!this.helicesAcionadas && this.ligado){
            System.out.println("Casco acionado!");
            this.cascoAcionado = true;
        } else {
            System.out.println("Não foi possível acionar casco!");
        }
    }

    @Override
    public void recolherCasco() {
        if(!this.helicesAcionadas && this.ligado && this.cascoAcionado){
            System.out.println("Casco recolhido!");
            this.cascoAcionado = false;
        } else {
            System.out.println("Não foi possível recolher casco!");
        }
    }

    ////lancha
    @Override
    public void mostrarDadosLancha() {
        System.out.println("Dados da forma de lancha");
        super.mostrarDados();
    }

    @Override
    public void movimentar() {
        if(this.ligado && !this.helicesAcionadas && !this.cascoAcionado){
            System.out.println("Movimentando-se como automóvel!");
            this.movimentoAutomovel = true;
        } else {
            System.out.println("Não foi possível movimentar-se como automóvel");
        }
    }

    @Override
    public void trocarPneu() {
        if(!this.ligado && !this.helicesAcionadas && !this.cascoAcionado){
            System.out.println("Pneu trocado!");
        } else {
            System.out.println("Não foi possível trocar o pneu!");
        }
    }

    @Override
    public void trocarMarchaComoAuto() {
        if(this.ligado && !this.helicesAcionadas && !this.cascoAcionado && this.movimentoAutomovel){
            System.out.println("Trocando marcha!");
        } else {
            System.out.println("Não foi possível trocar de marcha!");
        }
    }

    @Override
    public void mostrarDadosAuto() {
        System.out.println("Dados da forma de Automóvel");
        super.mostrarDados();
    }
}
