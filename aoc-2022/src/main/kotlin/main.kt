


class Person(val name: String, val age: Int)

fun sum(a: Int, b: Int) =  a + b;

fun main() {
    val r = sum(5,8);
    val person = Person("Pedro", 32);
    println("${person.name} is ${person.age}");
}