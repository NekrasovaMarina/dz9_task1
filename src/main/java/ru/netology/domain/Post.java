package ru.netology.domain;

public class Post {

    private int id; // идентификатор записи
    private int ownerId; // идентификатор владельца стены, на которой размещена запись
    private int fromId; // идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy; // идентификатор администратора, который опубликовал запись. Возвращается в записях, опубликованных менее 24 часов назад
    private int date; // время публикации записи в формате unixtime
    private String text; // текст записи
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; // 1, если запись была создана с опцией «Только для друзей»
    private CommentsInfo comments; // информация о комментариях к записи, объект с полями: count, canPost, groupsCanPost, canClose, canOpen
    private String copyright; // источник материала
    private LikesInfo likes; // информация о лайках к записи, объект с полями
    private RepostsInfo reposts; // информация о репостах записи («Рассказать друзьям»), объект с полями: count, userReposted
    private ViewsInfo views; // информация о просмотрах записи. Объект с единственным полем: count
    private String postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private PostSourceInfo postSource; // информация о способе размещения записи
    // private ? attachments; примечание: в задании сказано, что array следует пропустить
    private GeoInfo geo; // информация о местоположении , содержит поля: type, coordinates, place

    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    // private ? copyHistory; // примечание: в задании сказано, что array следует пропустить
    private int[] canPin= { 0 , 1 }; //
    private int[] canDelete= { 0 , 1 }; //
    private int[] canEdit= { 0 , 1 }; //
    private int[] isPinned= { 1 }; //
    private int[] markedAsAds= { 0 , 1 }; //
    private boolean isFavorite; //
    private int postponedId; //

}
