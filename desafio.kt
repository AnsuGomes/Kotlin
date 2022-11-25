enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel )

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    fun mostrarUsuarios(){
        println("Listagem: ")
        for (usuario in inscritos){
            println("${usuario.nome} - ${usuario.email}")
        }
    }
    
    fun materias(){
        println("Materias: ")
        for (materias in conteudos){
            println("${materias.nome} - ${materias.duracao} - ${materias.nivel}")
        }
    }
}

fun main() {
    val listaConteudos = mutableListOf<ConteudoEducacional>()
    
    listaConteudos.add(ConteudoEducacional("Kotlin - BASICO", 40, Nivel.BASICO))
    listaConteudos.add(ConteudoEducacional("Java - INTERMEDIARIO", 96, Nivel.INTERMEDIARIO))
    
    val DesafioDIO = Formacao("Curso de Kotlin", listaConteudos )
    DesafioDIO.matricular(Usuario("Ansu", "ansu@gmail"))
    DesafioDIO.matricular(Usuario("Alan", "alan@gmail"))
   
    DesafioDIO.mostrarUsuarios()    
 	println("\n")
    DesafioDIO.materias()  
}