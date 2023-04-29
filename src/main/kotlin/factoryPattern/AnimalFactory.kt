package factoryPattern

import factoryPattern.TipoAnimalEnum.CACHORRO
import factoryPattern.TipoAnimalEnum.GATO

object AnimalFactory {

     fun criarAnimal(tipo: TipoAnimalEnum): Animal? {
        return when(tipo){
            CACHORRO -> Cachorro()
            GATO -> Gato()
            else -> null
        }
    }
}