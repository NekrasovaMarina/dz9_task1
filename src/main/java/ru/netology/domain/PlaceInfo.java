package ru.netology.domain;

public class PlaceInfo {
    private int id; // идентификатор места
    private String title; // название места
    private int latitude; // географическая широта, заданная в градусах (от -90 до 90)
    private int longitude; // географическая широта, заданная в градусах (от -90 до 90)
    private int created; // дата создания места в Unixtime
    private String icon; // иконка места, URL изображения
    private int checkins; // число отметок в этом месте
    private int updated; // lата обновления места в Unixtime
    private int type; // тип места
    private int country; // идентификатор страны
    private int city; // идентификатор города
    private String address; // адрес места
}
