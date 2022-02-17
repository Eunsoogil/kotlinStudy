import java.util.*

data class KotlinPerson(
        private val id : Long,
        private val title : String,
        private val firstName : String,
        private val surname : String,
        private val dateOfBirth : Calendar?
    ) {

    override fun toString() = "$title $firstName $surname"

    val age : Int
    get() = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?) : Int {
            if (dateOfBirth == null) return -1

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)

            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }

}

fun main(args: Array<String>) {
    val john = KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3))
    val jane = KotlinPerson(2L, "Mrs", "Jane", "Green", null)
    println(john == KotlinPerson(1L, "Mr", "John", "Blue", GregorianCalendar(1977, 9, 3)))
    println(john == jane)
    println(john == null)
    println(jane.hashCode())
    println(john.toString() + "'s age is " + john.age)
    println(jane.toString() + "'s age is " + jane.age)
    println(KotlinPerson.getAge(GregorianCalendar(1988, 5, 3)))
    val olderPerson = if (john.age > jane.age) john else jane
    println("$olderPerson")
}

