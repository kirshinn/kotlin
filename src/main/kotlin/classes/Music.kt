package classes
// внешний класс
class Music {

    private var countBand = 100;

    fun printBand() {
        println("$countBand")
    }

    // внутренний класс
     inner class Band {
         fun classicMusic(count: Int) {
             countBand -= count
             printBand()
         }
     }
}