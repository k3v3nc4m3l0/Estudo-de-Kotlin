class Pessoa1 ()

class Pessoa2 (var nome: String, val anoNascimento:Int)

class Pessoa3 (var nome: String){

    var ano: Int? = null
    constructor(nome:String, ano:Int) : this(nome) {
        this.ano = ano
    }

    fun saudacao(){
        println("Olá, meu nome é $nome e nasci em $ano")
    }
}



fun main() {

    //getter setter

    val p1: Pessoa3 = Pessoa3("Gabriel", 1900)
    val p2: Pessoa3 = Pessoa3("Tony")

    p1.saudacao()
    p2.saudacao()
}