package AbstractFactory;
import ElementosPersonajes.*;

public class FabricaOrcos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaOrcos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraOrcos();
    }

    @Override
    public Vida crearVida() {
        return new VidaOrcos();
    }
    
}
