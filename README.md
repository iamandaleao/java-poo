# 📚 Java POO - Criando Métodos

Repositório com estudos sobre Programação Orientada a Objetos em Java, focando na criação e utilização de métodos.

## 🎯 Sobre o Projeto

Este repositório faz parte da minha jornada no programa **ONE - Oracle Next Education** em parceria com a **Alura**. Como participante da trilha de **Desenvolvimento Backend com Java**, este projeto documenta os conceitos e práticas aprendidos no curso "Java: aplicando a Orientação a Objetos".

O foco deste módulo é a criação e utilização de métodos em Java, um dos pilares fundamentais da Programação Orientada a Objetos e essencial para a construção de aplicações backend robustas.

### 🔷 Programa ONE
O Oracle Next Education é um programa de formação gratuito que oferece capacitação em tecnologia, preparando profissionais para o mercado de trabalho através de uma trilha completa de aprendizado em parceria com a Alura.

## 📖 Conteúdo Abordado

### 1. Criação de Métodos
- Definição de comportamentos através de métodos em classes Java
- Uso da palavra-chave `void` para métodos sem retorno
- Padrões de nomenclatura: verbos no indicativo (ex: `exibeFichaTecnica()`)

### 2. Utilização de Atributos
- Acesso e manipulação de atributos da classe dentro dos métodos
- Diferença entre variáveis locais e atributos da classe
- Exemplo: uso de `nome` e `anoDeLancamento` dentro dos métodos

### 3. Passagem de Argumentos
- Criação de métodos que recebem parâmetros
- Exemplo: `avalia(double nota)`
- Utilização dos argumentos recebidos dentro da lógica do método

### 4. Retorno de Valores
- Implementação de métodos que retornam valores
- Especificação do tipo de retorno (ex: `double`, `String`, `int`)
- Uso da instrução `return` para devolver valores
- Exemplo: `pegaMedia()`

### 5. Chamada de Métodos
- Invocação de métodos a partir de objetos da classe
- Sintaxe: `objeto.nomeDoMetodo()`
- Uso obrigatório de parênteses `()`, mesmo sem argumentos

### 6. Refatoração de Código
- Técnicas para melhorar legibilidade e manutenção do código
- Atalhos úteis da IDE:
    - `Shift + F6`: Renomear (Refactor → Rename)
    - `Ctrl + Alt + I`: Auto-indentação
- Renomeação consistente de atributos e métodos

### 7. Boas Práticas
- Importância da indentação adequada
- Uso de nomes descritivos e expressivos para variáveis e métodos
- Organização e estruturação do código

### 8. Conceitos de POO
- **Atributos**: representam os dados/estado de um objeto
- **Métodos**: definem os comportamentos/ações de um objeto
- **Encapsulamento**: agrupamento de dados e comportamentos dentro de uma classe

## 🔧 Exemplo Prático
```java
public class Filme {
    String nome;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    
    // Método sem retorno
    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    
    // Método com argumento
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    
    // Método com retorno
    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
```

## 🚀 Como Usar
```java
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.5);
        meuFilme.avalia(8.0);
        
        System.out.println("Média: " + meuFilme.pegaMedia());
    }
}
```

## 📚 Recursos de Aprendizado

- **Curso**: Java: aplicando a Orientação a Objetos - Alura
- **Aula**: Criando métodos

## 🎓 Conceitos-Chave

- ✅ Métodos definem o comportamento dos objetos
- ✅ `void` indica método sem retorno
- ✅ Métodos podem receber argumentos e retornar valores
- ✅ Nomenclatura clara e descritiva é essencial
- ✅ Refatoração melhora a qualidade do código

---

⭐ **Dica**: Pratique criando suas próprias classes e métodos para fixar os conceitos!