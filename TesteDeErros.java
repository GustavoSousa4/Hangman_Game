public class TesteDeErros {
    public static void main(String [] args){
        try{
            ControladorDeErros ctr = new ControladorDeErros(0);
            ControladorDeErros c1 = ctr;
            System.out.println(c1.clone());
            System.out.println(ctr.equals(c1));
            System.out.println(ctr.hashCode());
            System.out.println(ctr.isAtingidoMaximoDeErros());
            System.out.println(ctr.toString());
            ctr.registreUmErro();
        }
        catch(Exception erro){
            System.err.println(erro.getMessage());
        }
    }
    
}
