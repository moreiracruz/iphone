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

![Diagrama UML](https://www.mermaidchart.com/raw/5f027862-0612-4250-a05f-2e3776f38624?theme=light&version=v0.1&format=svg)
