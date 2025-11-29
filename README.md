#TP2

## Testes Baseados em Propriedades — Resumo Objetivo

Testes baseados em propriedades (property-based testing) verificam **regras gerais** que o software deve cumprir para **qualquer entrada válida**, em vez de depender de poucos casos de teste específicos.  
Enquanto testes tradicionais verificam “entrada → saída”, testes baseados em propriedades definem **invariantes** (ex.: tamanho não muda, valores permanecem, resultado é ordenado).  
O framework então gera automaticamente centenas de entradas aleatórias para tentar quebrar essas propriedades.

### Principais vantagens

- Maior cobertura de entradas sem esforço manual.
- Descoberta automática de casos de canto (listas vazias, repetidos, negativos).
- Menos viés do testador, pois os dados são gerados automaticamente.
- Melhora a qualidade da especificação, focando em regras do domínio e não em exemplos pontuais.
- Quando há falha, a ferramenta reduz o caso para o exemplo mínimo, facilitando o debug.

---

## Exemplo Prático Simplificado (Java + Jqwik)

### Arquivo de produção

`src/main/java/com/exemplo/ordenacao/ServicoOrdenacao.java`

```java
package com.exemplo.ordenacao;

import java.util.List;
import java.util.stream.Collectors;

public class ServicoOrdenacao {

    public List<Integer> ordenarCrescente(List<Integer> numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("A lista de números não pode ser nula.");
        }

        return numeros.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
```
