package com.stackodump.server.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comments", schema = "public", catalog = "SODTest")
public class CommentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "post_id")
    private Integer postId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "score")
    private Short score;
    @Basic
    @Column(name = "content_license")
    private String contentLicense;
    @Basic
    @Column(name = "user_display_name")
    private String userDisplayName;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "creation_date")
    private Timestamp creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public String getContentLicense() {
        return contentLicense;
    }

    public void setContentLicense(String contentLicense) {
        this.contentLicense = contentLicense;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsEntity that = (CommentsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (contentLicense != null ? !contentLicense.equals(that.contentLicense) : that.contentLicense != null)
            return false;
        if (userDisplayName != null ? !userDisplayName.equals(that.userDisplayName) : that.userDisplayName != null)
            return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (contentLicense != null ? contentLicense.hashCode() : 0);
        result = 31 * result + (userDisplayName != null ? userDisplayName.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
