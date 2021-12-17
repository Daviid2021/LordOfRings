package AbstractFactory;
import ElementosPersonajes.Arma;
import ElementosPersonajes.Armadura;
import ElementosPersonajes.Vida;
public interface FabricaAbstracta {
    
    public Arma crearArma();
    
    public Armadura crearArmadura();
    
    public Vida crearVida();
    
}
