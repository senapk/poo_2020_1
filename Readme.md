# Poo Java 2020.1

<!--TOC_BEGIN-->
- [Vídeos](#vídeos)
- [Links](#links)
- [Recursos ](#recursos)
    - [Java](#java)
    - [Git](#git)
- [S01E01](#s01e01)
- [S01E02](#s01e02)
- [S02E01](#s02e01)
- [S03E01 - Motoca](#s03e01---motoca)
- [S03E02 - Prática](#s03e02---prática)
- [S05E01 - Carro](#s05e01---carro)

<!--TOC_END-->

## Vídeos
- [30/07/2020 - Cinema](https://drive.google.com/file/d/1gdc82fE0rtd7zCnriID2SOeuMSPEasCT/view?usp=sharing)
- [13/08/2020 - Agenda 1](https://drive.google.com/file/d/1qb8uqcPFakeD7ugGKcZ0-jmnpdD1W0rG/view?usp=sharing)
- [20/08/2010 - Agiota](https://drive.google.com/file/d/1K9_6hUFYdIoor_sQ-4zueV1A7NhOALhT/view?usp=sharing)

## Links
- [Nosso canal do Youtube](https://www.youtube.com/playlist?list=PLqwyjBSVOHRw_g8n63C_aE0m7mWqEioYT)
- [Discord](https://discord.gg/yt93Cv3)
- [Planilha de Notas](https://docs.google.com/spreadsheets/d/1TjovZfBM-IN0YKg7DHKwW506Dw9HGgyZUhwTXGijceo/edit?usp=sharing)
- [Pranilha de Flequência](https://docs.google.com/spreadsheets/d/1EIAFzdPrwLA0N6YIlWZKdF_N4qaovy8w0uzM6jx8OV0/edit?usp=sharing)


## Recursos 
### Java
- [Modelo para o seu repositório do Git](https://github.com/senapk/exemplo_repositorio_disciplina)
- [Apostila Caelum](https://www.caelum.com.br/apostila-java-orientacao-objetos/)
- [Java Gafanhoto](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)
- [Java Gafanhoto Link2](https://www.cursoemvideo.com/course/curso-de-poo-java/)

### Git
- [Guia Rápido](https://rogerdudler.github.io/git-guide/index.pt_BR.html)
- [Git book](https://pt.wikiversity.org/wiki/Git_B%C3%A1sico)
- [Vídeo Aulas](https://www.youtube.com/playlist?list=PLInBAd9OZCzzHBJjLFZzRl6DgUmOeG3H0) Assista dos vídeos de 1 até o 4.

## S01E01
- Lecture [01 Ponto Extra]
    - [ ] Leia a apostila. Capítulo 1, 2 e 3.
    - [ ] Assista o primeiro vídeo da Playlist Gafanhoto
    - [ ] Rode o seu primeiro Hello World
- Homework [01 Ponto]
    - [ ] Instale o Java e a IDE (Eclipse, Intelij, Netbeans)
    - [ ] Instale o git na sua máquina pessoal
    - [ ] Coloque/Atualize sua foto no Si3
    - [ ] Coloque seu email e repositório na planilha de Notas

## S01E02
- 01 Ponto
    - [ ] Criar seu repositório no github
    - [ ] No seu repositório crie a pasta **Projeto 01**
        - Insira os primeiros códigos que for criando nessa pasta

## S02E01
- 03 Pontos
    - [ ] Finalizar o projeto do Carro iniciado em casa
        - Coloque na pasta **Projeto 02 Carro**
- 10 Pontos
    - [ ] Fazer um projeto semelhante ao Carro à sua escolha que contenha pelo menos
        - 3 atributos
        - 4 métodos
        - interação com o usuário através de comandos
        - Coloque na pasta **Projeto 03 nome_do_projeto**
- 02 Ponto Extra
    - Ler apostila capítulo 4

## S03E01 - Motoca
- 03 Pontos
    1. Estudar alguns métodos e tentar refazer
        - Construtor, Embarcar, Desembarcar, Dirigir
    2. Criar um atributo potencia na moto
        - Motifique o construtor da moto para receber a potência
        - Modifique o barulho do motor ao dirigir, mudar com a potência
        - o número de run equivale à potência da moto
        - potencia 1: run, potencia == 2, run run, potencia == 3 run run run
    4. Criar o atributo int tempo na moto e o atributo tempo no dirigir
        - ao embarcar, o tempo da moto muda pra 0, o que equivale a 0 minutos de tempo da criança
        - crie o método pagar(int), que aumenta o tempo da criança
        - ao dirigir(tempo), gaste o tempo que a criança tem
        - se não tiver tempo suficiente, dê uma mensagem mandando pagar mais dinheiro

## S03E02 - Prática
- 10 Pontos
    - [ ] Fazer projeto equivalente à moto
        - duas classes
        - construtores
        - main interativa
        - relação de agregação entre as classes
        
- [ ] Sugestão: Lapiseira e grafite
```bash
# inicia uma lapiseira 0.5
$init 0.5 
#escreve tantas linhas
$escrever 10
voce nao tem grafite
#insere um grafite passando espessura e tamanho do grafite, cade cm de grafite escreve 10 linhas
$inserirGrafite 0.7 5
$escrever 10
o grafite inserido nao serve
$retirarGrafite
$inserirGrafite 0.5 3
$escrever 20
escrevendo
$escrever 20
voce escreveu 10 linhas
acabou o grafite
$inserirGrafite 0.5 6
```

- 02 Pontos Extra
    - [ ] Ler capítulo 5

## S05E01 - Carro
- Estude o código do carro na pasta S05E01 e adicione ou remova alguma funcionalidade.
- Envie seu código para seu repositório
