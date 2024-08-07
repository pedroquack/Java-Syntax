public class TV {
    Boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void mudarCanal(Integer canal){
        this.canal = canal;
        System.out.println("Canal mudado para: " + this.canal);
    }
}
