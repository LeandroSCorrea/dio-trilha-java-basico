public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartv = new SmartTV();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        System.out.println("Canal atual: " + smartv.canal);

        System.out.println("volume atual: " + smartv.volume);

        smartv.mudarCanal(13);
        System.out.println("Canal atual: " + smartv.canal);
        

        System.out.println("TV Ligada? " + smartv.ligada);
        System.out.println("Canal Atual? " + smartv.canal);
        System.out.println("Volume Atual? " + smartv.volume);
        
        smartv.aumentarVolume();

        smartv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartv.ligada);
        
        smartv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartv.ligada);
    }
}
