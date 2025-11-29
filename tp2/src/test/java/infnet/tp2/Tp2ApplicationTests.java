package infnet.tp2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

class MathFunctionsPropriedadesTest {

    @Property
    boolean deveDobrarCorretamente(@ForAll int numero) {
        int resultado = MathFunctions.multiplyByTwo(numero);
        int esperado = numero + numero;
        return resultado == esperado;
    }
}