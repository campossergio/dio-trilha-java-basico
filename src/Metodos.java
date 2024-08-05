package src;

public class Metodos {
    public static void main(String[] args) {
        System.out.println("Métodos, Parâmetros e Visibilidade");

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual? " + smartTv.volume);

        System.out.println("Canal Atual? " + smartTv.canal);
        smartTv.mudarCanal(515);
        System.out.println("Canal Atual? " + smartTv.canal);
    }
}
