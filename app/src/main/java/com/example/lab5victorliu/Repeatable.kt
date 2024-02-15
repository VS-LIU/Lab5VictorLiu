package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

interface Repeatable {
    abstract val repeatNum: Int
    fun repeat(num: Int, listener: MissionListener): Unit
}