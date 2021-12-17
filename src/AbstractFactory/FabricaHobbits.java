
package AbstractFactory;
import ElementosPersonajes.*;

public class FabricaHobbits implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaHobbits();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraHobbits();
    }

    @Override
    public Vida crearVida() {
        return new VidaHobbits();
    }
    
}
