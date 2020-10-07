package ru.netology.domain;

public class Action {
    private String deleteEntry; // удалить запись
    private String archiveRecord; // архивировать запись
    private String saveToBookmarks; // сохранить в закладках
    private String edit; // редактировать
    private String anchor; // закрепить
    private String turnOffComments; // выключить комментарии

    public String getDeleteEntry() {
        return deleteEntry;
    }

    public void setDeleteEntry(String deleteEntry) {
        this.deleteEntry = deleteEntry;
    }

    public String getArchiveRecord() {
        return archiveRecord;
    }

    public void setArchiveRecord(String archiveRecord) {
        this.archiveRecord = archiveRecord;
    }

    public String getSaveToBookmarks() {
        return saveToBookmarks;
    }

    public void setSaveToBookmarks(String saveToBookmarks) {
        this.saveToBookmarks = saveToBookmarks;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public String getTurnOffComments() {
        return turnOffComments;
    }

    public void setTurnOffComments(String turnOffComments) {
        this.turnOffComments = turnOffComments;
    }
}
