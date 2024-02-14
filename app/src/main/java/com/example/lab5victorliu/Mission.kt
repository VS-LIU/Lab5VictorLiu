package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

abstract class Mission(val minion:Minion) {

//    protected val minion = minionObject

    fun start(listener: MissionListener): Unit {
        listener?.missionStart(minion)
        listener?.missionProgress()
        listener?.missionComplete(minion, reward(determineMissionTime()))
    }
    protected abstract fun determineMissionTime(): Int
    protected abstract fun reward(value: Int): String
}
