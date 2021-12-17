package AbstractFactory;

import ElementosPersonajes.Arma;
import ElementosPersonajes.ArmaGollum;
import ElementosPersonajes.Armadura;
import ElementosPersonajes.ArmaduraGollum;
import ElementosPersonajes.Vida;
import ElementosPersonajes.VidaGollum;


public class FabricaGollum implements FabricaAbstracta{

    @Override
    public Arma crearArma() {
        return new ArmaGollum();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraGollum();
    }

    @Override
    public Vida crearVida() {
        return new VidaGollum();
    }
    
}
