package com.example.myapplication

import User
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UsersUnitTest {

    var user = User();

    @Test
    fun add() {
        this.user.addUser(1,"Matthieu",21)
        assertEquals(1, this.user.id)
        assertEquals("Matthieu", this.user.name)
        assertEquals(21, this.user.age)
    }

    @Test
    fun update() {
        this.user.updateUser("Jeremy",21)
        assertEquals(21, this.user.age)
        assertEquals("Jeremy", this.user.name)
    }

    @Test
    fun delete() {
        this.user.deleteUser()
        assertEquals(null, this.user.id)
        assertEquals(null, this.user.name)
        assertEquals(null, this.user.age)
    }
}