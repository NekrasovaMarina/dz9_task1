package ru.netology.domain;

public class LikesInfo {
    private int count; // число пользователей, которым понравилась запись
    private int[] userLikes  = { 0 , 1 }; // наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет)
    private int[] canLike  = { 0 , 1 }; // информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может)
    private int[] canPublish  = { 0 , 1 }; // информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может)
}