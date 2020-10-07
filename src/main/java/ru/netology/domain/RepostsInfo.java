package ru.netology.domain;

public class RepostsInfo {
    private int count; // число пользователей, скопировавших запись
    private int[] userReposted  = { 0 , 1 }; // наличие репоста от текущего пользователя (1 — есть, 0 — нет)
}
