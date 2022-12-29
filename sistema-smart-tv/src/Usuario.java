public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartv = new SmartTV();

        System.out.println("TV Ligada? " + smartv.ligada);
        System.out.println("Canal Atual? " + smartv.canal);
        System.out.println("Volume Atual? " + smartv.volume);
        
        smartv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartv.ligada);
        
        smartv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartv.ligada);
    }
}
