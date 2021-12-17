package AbstractFactory;
import ElementosPersonajes.*;

public class FabricaHumanos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaHumanos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraHumanos();
    }

    @Override
    public Vida crearVida() {
        return new VidaHumanos();
    }
    
}
