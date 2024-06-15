<p align="center"><img src="https://img-c.udemycdn.com/course/480x270/3786202_37d5_2.jpg" width="400"></p>
<h2 align="center">Padrões de Projeto em JAVA</h2>
<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/top/tiquinhonew/design-patterns-demo">
  <a href="https://www.codacy.com/gh/tiquinhonew/design-patterns-demo/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=tiquinhonew/design-patterns-demo&amp;utm_campaign=Badge_Grade"><img src="https://app.codacy.com/project/badge/Grade/04ee2f9a924940bba341ae08b03d9163"/></a>
  <img alt="GitHub repo size" src="https://img.shields.io/github/repo-size/tiquinhonew/design-patterns-demo?color=blueviolet">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/tiquinhonew/design-patterns-demo?color=orange">
  <img alt="GitHub issues" src="https://img.shields.io/github/issues/tiquinhonew/design-patterns-demo">
  <img alt="GitHub license" src="https://img.shields.io/github/license/tiquinhonew/design-patterns-demo">
</p>
<p align="center">
  <a href="#link-links">GoF</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#open_file_folder-recursos">Patterns</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-tecnologias">Tecnologia</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#%EF%B8%8F-deploy">Build</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-licença">Licença</a>
</p>

---

Aplicação demo, desenvolvida no curso sobre padrões de projetos da [Cod3r Cursos Online](https://www.udemy.com/user/cod3r-3/).

### :link: GoF

GoF, ou "Gang of Four" se refere à um grupo de quatro grandes nomes no desenvolvimento (Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides) que catalogaram 23 padrões de projeto no seu livro Design Patterns: Elements of Reusable Object-Oriented Software, em 1995. A grande maioria destes padrões continuam famosos até hoje e são peças fundamentais em diversas aplicações e frameworks modernos. Como iremos ver ao longo do curso.

No curso, assim como o livro, divide os padrões em três grandes categorias:

- Padrões Criacionais: Trazendo formas para criação de objetos e forma independente, simples e desacoplada. Visando facilitar e até mesmo reduzir futuras manutenções. Onde veremos os seguintes padrões de projeto: Factory, Abstract Factory, Singleton, Builder e Prototype.

- Padrões Estruturais: Esta categoria apresentará como seria possível estruturar diversos objetos e classes de forma extensível e flexível. Neste módulo, os seguintes padrões serão abordados: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Mediator e Proxy.

- Padrões Comportamentais: Aqui nós vamos focar em como as responsabilidades são propagadas entre as classes e objetos. Vamos conhecer neste módulo os seguintes padrões: Chain of Responsability, Command, Iterator, Memento, Observer, State, Strategy e Template Method.

### :open_file_folder: Patterns

## Criacionais

1. [Factory Method](https://refactoring.guru/design-patterns/factory-method)
2. [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)
3. [Singleton](https://refactoring.guru/design-patterns/singleton)
4. Monostate
5. [Builder](https://refactoring.guru/design-patterns/builder)
6. [Prototype](https://refactoring.guru/design-patterns/prototype)

## Estruturais

1. [Adapter](https://refactoring.guru/pt-br/design-patterns/adapter)
2. [Bridge](https://refactoring.guru/pt-br/design-patterns/bridge)
3. [Composite](https://refactoring.guru/pt-br/design-patterns/composite)
4. [Decorator](https://refactoring.guru/pt-br/design-patterns/decorator)
5. [Facade](https://refactoring.guru/pt-br/design-patterns/facade)
6. [Flyweight](https://refactoring.guru/pt-br/design-patterns/flyweight)
7. [Proxy](https://refactoring.guru/pt-br/design-patterns/proxy)

## Comportamentais

1. [Chain of Responsability](https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility)
2. [Memento](https://refactoring.guru/pt-br/design-patterns/memento)
3. [Commander](https://refactoring.guru/pt-br/design-patterns/commander)
4. [Iterator](https://refactoring.guru/pt-br/design-patterns/iterator)
5. [Mediator](https://refactoring.guru/pt-br/design-patterns/mediator)
6. [Observer](https://refactoring.guru/pt-br/design-patterns/observer)
7. [State](https://refactoring.guru/pt-br/design-patterns/state)
8. [Strategy](https://refactoring.guru/pt-br/design-patterns/strategy)
9. [Template Method](https://refactoring.guru/pt-br/design-patterns/template-method)

---

### :rocket: Tecnologias

[<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="60"/>](https://www.java.com)
[<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/maven/maven-original.svg" width="60"/>](https://maven.apache.org/)

## 🏗️ Build

Antes de iniciar o processo de build, certifique-se de ter o seguinte instalado:

- [JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Apache Maven 3.6.3 ou superior](https://maven.apache.org/download.cgi)

### Build especifico do padrão 'Abstract Factory'

  ```sh
  git clone https://github.com/tiquinhonew/design-patterns-demo.git
  cd repositorio
  mvn clean install -PabstractFactory
  java -jar target/design-patterns-1.0.0.jar
  ```

### :memo: Licença

Este projeto está sob a licença MIT. Veja a [licença](https://github.com/tiquinhonew/design-patterns-demo/blob/master/LICENSE) para mais informações.

---

Douglas Moraes

[<img alt="GitHub" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=whit">](https://www.linkedin.com/in/douglasam)
