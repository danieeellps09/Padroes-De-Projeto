package facade;

public class Facade {
    public  void migrarCliente(String nome, String cep) {
        String cidade = cepAPI.getInstancia().recuperarCidade(cep);
        String estado = cepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);


    }
    }
