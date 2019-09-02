package com.example.fragmentapp

class StudentModel {
    private var Message: String? = null

    private var Status: String? = null

    private var Error: String? = null

    private var Success: String? = null
        get() = field
        set(value) {
            field = value
        }

}