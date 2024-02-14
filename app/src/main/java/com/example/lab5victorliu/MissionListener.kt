package com.example.lab4victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

interface MissionListener {
    fun missionStart(minion: Minion): Unit
    fun missionProgress(): Unit
    fun missionComplete(minion: Minion, reward: String): Unit

}