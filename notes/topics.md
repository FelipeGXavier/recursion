## Gerenciamento de memória 

Existem dois tipos principais de memória, memória em pilha e em heap. A memória em pilha é localizada num
espaço especial da memória RAM, onde são armazenados um tipo especial de estrutura, pilha, que armazena funções ativas assim 
como variáveis. Na memória heap são armazenados objetos transitórios e dados que são utilizados ao longo da execução de um programa,
essa categoria de memória está muito mais presente em quantidade do que a do tipo stack.

Na execução de um programa cada chamada de uma função é armazenada na memória de pilha assim como suas variáveis de escopo. 
Caso dentro dessa função seja instanciado um objeto esse estará presente no stackframe como referência ao endereço na memória heap que
armazenará os dados do objeto. 

## Recursão

Existem dois tipos de recursão, tail recursion e head recursion. Tail recursion será quando a chamada recursiva está
presente no fim da função, então cada instrução será executada antes de ir para próxima chamada recursiva. Enquanto head 
recursion será a função que a chamada recursiva fica no início da função assim ela mantém o estado prévio executando
primeiro todas as chamadas recursivas e continuando a execução com o resultado dessa operação antes de prosseguir.