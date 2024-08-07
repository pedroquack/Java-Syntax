public class Usuario {
    public static void main(String[] args) {
        TV smartTv = new TV();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV LIGADA?".concat(" ").concat(smartTv.ligada.toString()));
        System.out.println("CANAL:".concat(" ") + smartTv.canal);
        System.out.println("VOLUME:".concat(" ") + smartTv.volume);

        smartTv.ligar();
    }
}
