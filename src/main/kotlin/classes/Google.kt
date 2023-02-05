package classes

import interfaces.Android
import interfaces.Firebase

class Google : Android, Firebase {
    override fun run() = println("Android is runned...")
    override fun stop() {
        super<Android>.stop()
        super<Firebase>.stop()
    }
}