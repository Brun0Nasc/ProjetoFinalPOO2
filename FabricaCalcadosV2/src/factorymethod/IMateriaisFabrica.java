package factorymethod;

import interfaces_materiais.IBorracha;
import interfaces_materiais.ICouro;
import interfaces_materiais.IPalmilha;
import interfaces_materiais.ITecido;

public interface IMateriaisFabrica {
    ICouro setCouro();
    IBorracha setBorracha();
    ITecido setTecido();
    IPalmilha setPalmilha();
}
