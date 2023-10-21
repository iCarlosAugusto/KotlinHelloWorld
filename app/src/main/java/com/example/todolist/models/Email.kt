package com.example.todolist.models

data class Email(
    var user: String,
    var subject: String,
    var preview: String,
    var date: String,
    var stared: Boolean,
    var unread: Boolean,
    var selected: Boolean
    ) {


}