fun main(args: Array<String>) {

 val appDataBaseMock= AppDataBaseMock()
    val repository = AnimalRepositoryRepository(appDataBaseMock)
    val animals = repository.getAll()
    animals.forEach{
        animal->println(animal)
    }
