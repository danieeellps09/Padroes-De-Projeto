import dio.digital.gof.singleton.SingletonEager;
import dio.digital.gof.singleton.SingletonLazy;
import dio.digital.gof.singleton.SingletonLazyHolder;
import facade.Facade;
import strategy.*;

//Classe usada para testar
public class Teste {
    public static void main(String[] args) {

      //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }

    //Strategy
   /*Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();
    Comportamento normal = new ComportamentoNormal();
    Robo robo = new Robo();
  robo.setComportamento(normal);
  robo.mover();
  robo.mover(); */

  /*  Facade facade = new Facade();
    facade.migrarCliente();
*/


}
