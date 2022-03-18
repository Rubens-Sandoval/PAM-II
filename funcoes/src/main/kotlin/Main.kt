/*fun main(args: Array<String>) {
    fun somar(n1: Int, n2: Int):Int {
        return n1 + n2
    }
    fun imprimir(texto: String){
        println(texto)
    }

    val n1 = 5
    val n2 = 7
    val resultado = somar(n1, n2)

    imprimir("$resultado")
}*/
/*Declarando classe carro*/
open class Carro{

    /*Definindo atributos da classe carro*/
    var cor:String = ""
    var modelo:String = ""
    var chassi:String = ""
    var status_carro:Int = 0

    /*Função para acelerar*/
    fun acelerar(){
        println("Acelerando")
    }
    /*Função para frear*/
    fun frear(){
        println("Freando")
    }
    /*Função para exibir os valores das variáveis*/
    fun exibir(){
        println("\nModelo: $modelo\nCor: $cor\nChassi: $chassi\n")
    }
    /*Função para mudar de marcha*/
    fun mudarMarcha(){
        println("Mudando de marcha")
    }
    /*Função para ligar o carro que verifica se ele ja esta ligado ou não*/
    fun ligar(){
        if (status_carro < 1){
            println("Ligando")
            status_carro = 1
            println("Carro ligado!")
        }else {
            println("O carro já está ligado.")
        }
    }
    /*Função para parar o carro, acessando a função para frear antes*/
    fun parar(){
        frear()
        println("O carro esta parado")
    }
}
/*Criando classe CarroEspecial, herdando as funções e atributo da classe carro*/
class CarroEspecial : Carro(){
    /*Função para fazer drift*/
    fun fazerDrift(){
        println("Classe Privada")
    }
}

/*Método main*/
fun main(args: Array<String>) {
    /*val c = Carro()

    c.cor = "Azul"
    c.modelo = "Renault Sandero"
    c.chassi = "9 BW SU19F0 8 B302158"
    c.ligar()
    c.acelerar()
    c.parar()
    c.exibir()*/

    /*Instanciando classe CarroEspecial*/
    val ce = CarroEspecial()

    /*Definindo atributos para o objeto CarroEspecial*/
    ce.cor = "Azul"
    ce.modelo = "Renault Sandero"
    ce.chassi = "9 BW SU19F0 8 B302158"

    /*Usando as funções da função CarroEspecial, iuncluindo as herdadas de Carro*/
    ce.ligar()
    ce.acelerar()
    ce.parar()
    ce.exibir()
    ce.fazerDrift()
}