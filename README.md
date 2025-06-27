[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ybM3WQNb)


► QUESTÃO 1

    • a) "Os construtores de superclasse não são herdados por subclasses."
        Verdadeiro

    • b) "Um relacionamento tem um é implementado via herança."
        Falso
        Relacionamento "tem um" indica composição ou agregação, não herança. Herança representa um relacionamento "é um" (ex: "um Gato é um Animal").

    • c) "Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse."
        Falso
        Isso se chama sobrescrita (ou overriding), não sobrecarga. Sobrecarga (overloading) ocorre quando há métodos com o mesmo nome, mas assinaturas diferentes.

► QUESTÃO 2

    • private

        • Acesso restrito apenas à própria classe.
        • Mais seguro, pois protege completamente os dados internos.
        • Subclasses não conseguem acessar diretamente atributos/métodos private.

    • protected

        • Permite acesso nas subclasses e dentro do mesmo pacote.
        • Facilita a reutilização e extensão de código em herança.
        • Menos seguro, porque expõe detalhes internos da superclasse para as subclasses.

► QUESTÃO 3

    • Como funciona a chamada de construtores em herança em Java:
        Quando uma subclasse é instanciada, o Java executa primeiro o construtor da superclasse, depois o da subclasse.
        
        Isso acontece porque a subclasse herda os atributos e comportamentos da superclasse, então a parte “super” precisa ser inicializada primeiro.

    • Como a chamada é feita:
        Chamada implícita:
            Se a subclasse não chamar nada, o compilador automaticamente insere super(); (chama o construtor padrão da superclasse).

        Chamada explícita:
            Se quiser chamar um construtor específico da superclasse (com parâmetros), você deve usar super(parâmetros); como a primeira linha do construtor da subclasse.

    • Por que é obrigatório chamar o construtor da superclasse?
        Para garantir que os atributos da superclasse sejam corretamente inicializados.

        Sem isso, a subclasse poderia tentar usar partes da superclasse que ainda não foram configuradas.