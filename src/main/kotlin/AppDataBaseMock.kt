import kotlin.random.Random

class AppDataBaseMock {
    val list = mutableListOf<Animal>()

    init {
        for (i in 0..100){
            val animal = Animal(id = i, name = "name$i", speeds = i + Random.nextInt(30))
            list.add(animal)
        }
    }
}