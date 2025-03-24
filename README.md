# iphone

##Diagrama UML (Mermaid)

'''

classDiagram

  class ReprodutorMusical {
    +tocar()
    +pausar()
    +selecionarMusica(musica: String)
  }

  class AparelhoTelefonico {
    +ligar(numero: String)
    +atender()
    +iniciarCorreioVoz()
  }

  class NavegadorInternet {
    +exibirPagina(url: String)
    +adicionarNovaAba()
    +atualizarPagina()
  }

  class Iphone {
    +tocar()
    +pausar()
    +selecionarMusica(musica: String)
    +ligar(numero: String)
    +atender()
    +iniciarCorreioVoz()
    +exibirPagina(url: String)
    +adicionarNovaAba()
    +atualizarPagina()
  }

  ReprodutorMusical <|-- Iphone
  AparelhoTelefonico <|-- Iphone
  NavegadorInternet <|-- Iphone

'''
