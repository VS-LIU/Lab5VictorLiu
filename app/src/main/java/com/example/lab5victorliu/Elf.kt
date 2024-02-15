package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Elf: Minion, Companion {
    override val race: String
        get() = "Elf"
    override val baseHealth: Int
        get() = 2
    override val baseSpeed: Int
        get() = 8
    override val backpackSize: Int
        get() = 3
    override val catchphrase: String
        get() = "My arrows never miss!"

    override fun huntReward(value: Int): String {
        return when (value) {
            in 11..20 -> {
                "Fish"
            }
            in 21..30 -> {
                "Forest Bear"
            }
            in 31..40 -> {
                "Orc"
            }
            in 41..60 -> {
                "Troll"
            }
            else -> {
                "Nothing"
            }
        }
    }

}