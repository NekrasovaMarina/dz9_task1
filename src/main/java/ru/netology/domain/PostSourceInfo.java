package ru.netology.domain;

public class PostSourceInfo {
    private String type; // тип источника: vk, widget, api, rss, sms
    private String platform; // название платформы, если оно доступно: android, iphone, wphone
    private String data; // тип действия (только для type = vk или widget), возможные значения: profile_activity, profile_photo, comments, like, poll
    private String url; // URL ресурса, с которого была опубликована запись
}
