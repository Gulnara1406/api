package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "7777 № 777777";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = false;
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 2000;

    }
}