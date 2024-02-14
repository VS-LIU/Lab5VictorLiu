package com.example.lab5victorliu

/*
    COMP3717 - Lab5
    Victor Liu - A00971668 - set C
 */

fun main() {

    val gotrekTheDwarf = Dwarf()
    val newGameDwarf = Gather(gotrekTheDwarf)

    newGameDwarf.start(object: MissionListener{
        override fun missionStart(minion: Minion) {
            println("""
                "${gotrekTheDwarf.catchphrase}"
                
                A ${gotrekTheDwarf.race} was sent off to gather some resources!
            """.trimIndent())
        }

        override fun missionProgress() {
            println("""
                ...
                ...
                ...
            """.trimIndent())
        }

        override fun missionComplete(minion: Minion, reward: String) {
            println("""
                A ${minion.race} has returned from gathering, and found $reward 
                --==+==----==+==----==+==----==+==----==+==----==+==----==+==--
            """.trimIndent())
        }
    })

    val elessaTheElf = Elf()
    val newGameElf = Hunt(elessaTheElf)

    newGameElf.start(object: MissionListener{
        override fun missionStart(minion: Minion) {
            println("""
                "${elessaTheElf.catchphrase}"
                
                An ${elessaTheElf.race} started a new hunt!
            """.trimIndent())
        }

        override fun missionProgress() {
            println("""
                ...
                ...
                ...
            """.trimIndent())
        }

        override fun missionComplete(minion: Minion, reward: String) {
            println("""
                An ${minion.race} has returned from a hunt, and found $reward 
                --==~==---==~==---==~==---==~==---==~==---==~==---==~==---==~==--
            """.trimIndent())
        }
    })

    val felixTheHuman = Human()
    val newGameHuman = Hunt(felixTheHuman)

    newGameHuman.repeat(10, object: MissionListener{
        override fun missionStart(minion: Minion) {
            println("""
                "${felixTheHuman.catchphrase}"
                
                A ${felixTheHuman.race} started a new hunt!
            """.trimIndent())
        }

        override fun missionProgress() {
            println("""
                ...
                ...
                ...
            """.trimIndent())
        }

        override fun missionComplete(minion: Minion, reward: String) {
            println("""
                A ${minion.race} has returned from a hunt, and found $reward 
                --.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.---
            """.trimIndent())
        }
    })
}