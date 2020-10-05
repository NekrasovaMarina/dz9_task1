package ru.netology.domain;

public class Post {

    private int postId; // идентификатор поста

    private String miniPhoto; // миниатюра пользователя
    private boolean onlineOffline; // онлайн или не в сети

    private String date; // дата опубликования поста
    private String time; // время опубликования поста

    private String text; // текст поста

    private String image; // изображение (фотография)
    private String link; // ссылка во внешнее приложение

    private int like; // нравится
    private String comment; // комментарий
    private int toShare; // поделиться
    private int numberOfViews; // количество просмотров


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getMiniPhoto() {
        return miniPhoto;
    }

    public void setMiniPhoto(String miniPhoto) {
        this.miniPhoto = miniPhoto;
    }

    public boolean isOnlineOffline() {
        return onlineOffline;
    }

    public void setOnlineOffline(boolean onlineOffline) {
        this.onlineOffline = onlineOffline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getToShare() {
        return toShare;
    }

    public void setToShare(int toShare) {
        this.toShare = toShare;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
