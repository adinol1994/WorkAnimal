import kotlin.random.Random

class AppDataBaseMock {
    val list = mutableListOf<Animal>()

    init {
        list.add(Carnivores(7, "cat" , 20, "S124"))
        list.add(Carnivores(3, "dog" , 80, "P123"))
        list.add(Herbivores(5,"Horse" , 100, "d344"))
        list.add(Herbivores(4, "pig" , 20, "a128"))
    }
}
