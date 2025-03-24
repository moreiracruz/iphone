# iphone

##Diagrama UML (Mermaid)

'''
classDiagram
  class ReprodutorMusical {
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
  }

  class AparelhoTelefonico {
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
  }

  class NavegadorInternet {
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
  }

  class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
  }

  ReprodutorMusical <|-- Iphone
  AparelhoTelefonico <|-- Iphone
  NavegadorInternet <|-- Iphone
'''

