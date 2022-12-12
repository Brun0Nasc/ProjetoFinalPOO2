package factorymethod;

import infra.Componente;
import interfaces_materiais.IBorracha;
import interfaces_materiais.ICouro;
import interfaces_materiais.IPalmilha;
import interfaces_materiais.ITecido;

public interface IMateriaisFabrica {
    ICouro setCouro(Componente c);
    IBorracha setBorracha(Componente c);
    ITecido setTecido(Componente c);
    IPalmilha setPalmilha(Componente c);
}
