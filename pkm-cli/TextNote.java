package com.zhangjiayi.pkm.entity;

import java.util.Date;

public class TextNote extends Note {
    private String summary;

    public TextNote(String title, String content) {
        super(title, content);
    }

    public TextNote(String title, String content, String summary) {
        super(title, content);
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
        this.setUpdatedAt(new Date());
    }

    @Override
    public String toString() {
        return "TextNote{" +
                "summary='" + summary + '\'' +
                "} " + super.toString();
    }
}