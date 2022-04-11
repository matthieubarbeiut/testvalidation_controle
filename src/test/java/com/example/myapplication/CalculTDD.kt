package com.example.myapplication

import org.junit.Assert
import org.junit.Test

class CalculTDD {

    var calc = Calcul()

    @Test
    fun add(){
        Assert.assertEquals(5, calc.calculAdd(2, 3))
    }

    @Test
    fun sub(){
        Assert.assertEquals(5, calc.calculSub(10, 5))
    }

    @Test
    fun div(){
        Assert.assertEquals(5, calc.calculDiv(25, 5))
    }

    @Test
    fun mul() {
        Assert.assertEquals(25, calc.calculMultiple(5, 5))
    }

}