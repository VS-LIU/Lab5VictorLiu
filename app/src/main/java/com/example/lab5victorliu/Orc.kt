package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Orc: Minion {
    override val race: String
        get() = "Dwarf"
    override val baseHealth: Int
        get() = 8
    override val baseSpeed: Int
        get() = 2
    override val backpackSize: Int
        get() = 8
    override val catchphrase: String
        get() = "ARRGH!"
}