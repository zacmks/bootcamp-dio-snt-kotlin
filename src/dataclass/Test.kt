package dataclass

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Produto(var cod: Int, var nome: String, var preco: Double)
{

    fun precoEmRS(): String {
        return "R$ %.2f".format(preco)
    }

}

class Pessoa(var nome: String, var dataNascimento: LocalDate)

class Carrinhho(val comprador: Pessoa, val produtos: MutableList<Produto>, val dataCompra: LocalDate)

fun LocalDate.formatoBr(): String {
    return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this)
}

fun main() {
    val produto1 = Produto(1, "Mouse", 10.0)
    val produto2 = Produto(1, "Mouse", 10.0)





    val data = LocalDate.of(2012, 11, 12)

    val pessoaIsaac = Pessoa("Isaac", LocalDate.of(1988, 9, 8))
    println(Utils.formatoDataBr(pessoaIsaac.dataNascimento))
    println(pessoaIsaac.dataNascimento.formatoBr())


    val carrinhoIsaac = Carrinhho(pessoaIsaac, mutableListOf(), LocalDate.now())
    carrinhoIsaac.produtos.add(produto1)

    println(produto1.precoEmRS())
    val set = mutableSetOf<Produto>()

    set.add(produto1)
    set.add(produto2)

    println(set)
}