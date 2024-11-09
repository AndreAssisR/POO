public class PlayStation extends Dispositivo
{
    private Manete Joogador1;
    
    public void botaoCinco(){
        System.out.println("Canal Down");
        estado--;
    }
    
    public void botaoSeis(){
        System.out.println("Canal UP"); estado++;
    }

}
