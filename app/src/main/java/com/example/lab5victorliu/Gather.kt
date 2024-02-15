package com.example.lab5victorliu

import kotlin.random.Random

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

class Gather(minion: Minion) : Mission(minion) {
    override fun determineMissionTime(): Int {
        return ((minion.backpackSize + minion.baseSpeed + (this.item?.timeModifier!!)) * Random.nextInt(5))
    }

    override fun reward(value: Int): String {
        return if (determineMissionTime() in 10..21) {
            "Bronze"
        } else if (determineMissionTime() in 22..33) {
            "Silver"
        } else if (determineMissionTime() in 34..50) {
            "Gold"
        } else {
            "Nothing"
        }
    }
}
