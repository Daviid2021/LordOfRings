package AbstractFactory;

import ElementosPersonajes.Arma;
import ElementosPersonajes.ArmaEnanos;
import ElementosPersonajes.Armadura;
import ElementosPersonajes.ArmaduraEnano;
import ElementosPersonajes.Vida;
import ElementosPersonajes.VidaEnano;


public class FabricaEnanos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaEnanos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraEnano();
    }

    @Override
    public Vida crearVida() {
        return new VidaEnano();
    }
    
}
