open class Animal (val id: Int, var name: String, var speeds: Int) {

    fun nameUpper(): String {
        return name.uppercase()
    }

    override fun toString(): String {
        return "Carnivores, Herbivores(id=$id, name='$name', speeds=$speeds)"

    }
}