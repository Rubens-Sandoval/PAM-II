fun main(args: Array<String>){
    println("Insira sua altura: ")
    var altura:Double = readLine()!!.toDouble()
    println("Insira seu peso: ")
    var peso:Double = readLine()!!.toDouble()

    var imc = peso / (altura*altura)
    var condic:String = ""

    if (imc < 18.5){
        condic = "abaixo do peso"
    }else if (imc < 24.9){
        condic = "peso normal"
    }else if (imc < 29.9){
        condic = "sobrepeso"
    }else if (imc < 34.9){
        condic = "obesidade 1"
     }else if (imc < 39.9){
        condic = "obesidade 2"
    }else {
        condic = "obesidade 3"
    }

    println("Seu peso é: $peso e, sua condição é: $condic")
}