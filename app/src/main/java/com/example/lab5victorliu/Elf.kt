package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Elf: Minion() {
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

}