package facade;

public class cepAPI {
    private static  cepAPI instancia = new cepAPI();

    private cepAPI (){
        super();
    }
    public static cepAPI getInstancia(){
        return  getInstancia();
    }

    public String recuperarCidade(String cep){
        return "araraquara";

    }


    public String recuperarEstado(String cep){
        return "estado";

    }


}
