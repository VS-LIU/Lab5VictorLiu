package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Orc(minion: Minion): Minion by minion {
    // Orc should delegate its HP, speed, and backpack to an Elf

    private val minion = minion
    override val race: String
        get() = "Orc"

    override val catchphrase: String
        get() = "ARRGH!"
}