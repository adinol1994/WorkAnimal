fun main(args: Array<String>) {

    val appDataBaseMock = AppDataBaseMock()

    val repository = AnimalRepositoryRepository(appDataBaseMock)

    println(repository.getAll())

    val animal = repository.findById(4)
    println(animal)
    if (animal != null) {
        repository.delete(animal)
    }
    println(repository.getAll())


    val carnivores1 = Carnivores(9, "cat", 42, "S124")
    val carnivores2 = Carnivores(6, "dog", 50, "P123")

    val Herbivores1 = Herbivores(9, "cat", 42, "S124")
    val Herbivores2 = Herbivores(6, "dog", 50, "P123")


    val list1 = mutableListOf<Animal>()
    list1.add(carnivores1)

    val list2 = mutableListOf<Animal>()
    list2.add(carnivores2)




}

private fun <E> MutableList<E>.add(element: Unit) {

}

fun Carnivores1(id: Int, name: String, speeds: Int, group: String) {}
fun Carnivores2(id: Int, name: String, speeds: Int, group: String){

}


