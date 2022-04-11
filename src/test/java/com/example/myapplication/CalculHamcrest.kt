package com.example.myapplication

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.*
import org.junit.Test


class CalculHamcrest {

    var calc = Calcul()

    @Test
    fun add(){
        assertThat(5, equalTo(calc.calculAdd(2, 3)))
    }

    @Test
    fun sub(){
        assertThat(5, equalTo(calc.calculSub(10, 5)))
    }

    @Test
    fun div(){
        assertThat(5, equalTo(calc.calculDiv(25, 5)))
    }

    @Test
    fun mul() {
        assertThat(25, equalTo(calc.calculMultiple(5, 5)))
    }

}