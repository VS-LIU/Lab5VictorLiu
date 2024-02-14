package com.example.lab4victorliu

import kotlin.random.Random

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Hunt(minionObject: Minion) : Mission(minionObject), Repeatable {


    override fun determineMissionTime(): Int {
        return (minion.baseHealth + minion.baseSpeed) * Random.nextInt(5)
    }

    override fun reward(value: Int): String {
        return if (determineMissionTime() in 11..20) {
            "Mouse"
        } else if (determineMissionTime() in 21..30) {
            "Fox"
        } else if (determineMissionTime() in 31..50) {
            "Buffalo"
        } else {
            "Nothing"
        }
    }

    override fun repeat(num: Int, listener: MissionListener) {
        for (i in 1..num) {
            println("Game instance #$i")
            start(listener)
        }
    }
}