package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Human: Minion {
    override val race: String
        get() = "Human"
    override val baseHealth: Int
        get() = 5
    override val baseSpeed: Int
        get() = 5
    override val backpackSize: Int
        get() = 5
    override val catchphrase: String
        get() = "Bob's your uncle!"

}