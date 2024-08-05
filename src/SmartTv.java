package src;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal Atual: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal Atual: " + canal);
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
}
