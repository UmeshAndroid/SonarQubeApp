package com.example.sonarqubeapp

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun whenInputIsValid(){
        val amount = 100
        val desc = "Some random desc"
        val result = Validator.validateInput(amount, desc)
        assertEquals(result, true)
       // assertThat(result).isEqualTo(true)
    }

    @Test
    fun whenInputIsInvalid(){
        val amount = 0
        val desc = ""
        val result = Validator.validateInput(amount, desc)
        assertEquals(result, false)
       // assertThat(result).isEqualTo(false)
    }

}