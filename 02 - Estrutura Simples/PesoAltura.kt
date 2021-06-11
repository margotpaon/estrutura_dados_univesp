class PesoAltura{
    var peso: Int = 0
    var altura: Int = 0
}

fun main(){
    val ALTURA_MAXIMA = 225;
    val person = PesoAltura();
    person.peso=80;
    person.altura=185;
    println("Peso: "+ person.peso+", Altura "+person.altura+". ");

    if(person.altura > ALTURA_MAXIMA){println("Altura acima da maxima. ");} 
        println("Altura abaixo da máxima");
}