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
        if(ligada){
            volume++;
        System.out.println("Volume aumentado para: " + volume);
        }else{
            System.out.println("A tv está desligada");
        }
        
    }

    public void diminuirVolume(){
        if (ligada) {
            volume--;
            System.out.println("Volume diminuido para: " + volume);
        }else{
            System.out.println("A tv está desligada");
        }
        
    }

    public void mudarCanal(Integer canal){
        if (ligada) {
            this.canal = canal;
            System.out.println("Canal mudado para: " + this.canal);  
        }else{
            System.out.println("A tv está desligada");
        }
        
    }
}
