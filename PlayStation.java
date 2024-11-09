public class PlayStation extends Dispositivo
{
    private Manete Joogador1;
    private boolean gaveta;

    
    public void abrirGaveta(){
        gaveta == true;
        System.out.println("Gaveta aberta");
        gaveta == false;
        System.out.println("Gaveta fechada");     
    }
    
    public void estadoManete(){
        if(Jogador1 != null){
                System.out.println("Manete funcionando");
        }else{
                System.out.println("Manete inativa");

    }
