public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual:  " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println(" ");

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println(" ");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        while(smartTv.volume < 25)
            smartTv.aumentarVolume();
        System.out.println(" ");
        
        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        


    }
}
