public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if (volume < 100)
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        if (volume > 0)
            volume--;        
            System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal (int canalDesejado){
        canal = canalDesejado;
        System.out.println("Canal atual: " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

}