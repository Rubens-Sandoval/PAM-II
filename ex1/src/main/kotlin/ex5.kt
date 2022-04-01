class gerente(val nome:String, val cpf:String){

    fun aumento(sal: Double) = sal * 0.1

    fun aumento_dinamico(sal: Double, pct: Double) = sal * pct
}
fun main(args: Array<String>) {
    var gerente: gerente = gerente("Nagato", "123.456.789-10")
    var salario: Double = 0.0
    println("insira o salário: ")
    salario = readLine()!!.toDouble()
    var salario_novo = 0.0

    println("Digite um para aumento padrão ou digite 2 para escolher a porcentagem")
    var opc: Int = readLine()!!.toInt()

    if (opc == 1) {
        salario_novo = salario + gerente.aumento(salario)
        println("Salário novo: $salario_novo")
    } else if (opc == 2) {
        println("Digite a porcentagem(0.1 = 10%): ")
        var pct:Double = readLine()!!.toDouble()

        salario_novo = salario + gerente.aumento_dinamico(salario, pct)
        println("Salário novo: $salario_novo")
    }else {
        println("Escolha uma opção válida!")
    }
}