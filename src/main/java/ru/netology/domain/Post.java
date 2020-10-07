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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public void setComments(CommentsInfo comments) {
        this.comments = comments;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public void setLikes(LikesInfo likes) {
        this.likes = likes;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public void setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
    }

    public ViewsInfo getViews() {
        return views;
    }

    public void setViews(ViewsInfo views) {
        this.views = views;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSourceInfo getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSourceInfo postSource) {
        this.postSource = postSource;
    }

    public GeoInfo getGeo() {
        return geo;
    }

    public void setGeo(GeoInfo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int[] getCanPin() {
        return canPin;
    }

    public void setCanPin(int[] canPin) {
        this.canPin = canPin;
    }

    public int[] getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int[] canDelete) {
        this.canDelete = canDelete;
    }

    public int[] getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int[] canEdit) {
        this.canEdit = canEdit;
    }

    public int[] getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int[] isPinned) {
        this.isPinned = isPinned;
    }

    public int[] getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int[] markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}


