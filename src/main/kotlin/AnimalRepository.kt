class AnimalRepositoryRepository constructor(private val appDataBaseMock: AppDataBaseMock) {

    fun getAll(): MutableList<Animal> {
        return appDataBaseMock.list
    }

    fun findById(id: Int): Animal? {
        return appDataBaseMock.list.find { it.id == id}
    }

    fun insert(animal: Animal): Unit{
        appDataBaseMock.list.add(animal)
    }

    fun delete(animal: Animal){
        appDataBaseMock.list.remove(animal)
    }

    fun update(animal: Animal){
        val animaleF = findById(animal.id)
        if (animaleF != null){
            val index = appDataBaseMock.list.indexOf(animaleF)
            appDataBaseMock.list[index] = animal
        }

    }
}