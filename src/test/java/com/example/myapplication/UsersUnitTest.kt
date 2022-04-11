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

    var user = User(1,"Matthieu",21);

    @Test
    fun update() {
        this.user.updateUser("Jeremy",21)
        assertEquals(21, this.user.age)
    }
}