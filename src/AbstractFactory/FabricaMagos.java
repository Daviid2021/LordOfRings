package AbstractFactory;

import ElementosPersonajes.Arma;
import ElementosPersonajes.ArmaMagos;
import ElementosPersonajes.Armadura;
import ElementosPersonajes.ArmaduraMagos;
import ElementosPersonajes.Vida;
import ElementosPersonajes.VidaMagos;


public class FabricaMagos implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaMagos();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraMagos();
    }

    @Override
    public Vida crearVida() {
        return new VidaMagos();
    }
    
}
