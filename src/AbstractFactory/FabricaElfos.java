package AbstractFactory;
import ElementosPersonajes.*;
public class FabricaElfos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaElfos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraElfos();
    }

    @Override
    public Vida crearVida() {
        return new VidaElfos();
    }
    
}