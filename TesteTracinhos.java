import java.rmi.server.ExportException;

public class TesteTracinhos {
    public static void main(String [] args){
        try{
            Tracinhos tr = new Tracinhos(10);
            Tracinhos tr1 = tr;
            Tracinhos tr2 = new Tracinhos(15);
            tr.revele(5, 'a');
            System.out.println(tr.clone());
            System.out.println(tr.equals(tr2));
            System.out.println(tr.hashCode());
            System.out.println(tr.isAindaComTracinhos());
            System.out.println(tr.toString());
            }
        catch(Exception erro){
            System.err.println(erro.getMessage());
        }
    }
    
}
