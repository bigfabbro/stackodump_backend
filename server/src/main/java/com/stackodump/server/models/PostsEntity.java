package com.stackodump.server.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "posts", schema = "public", catalog = "SODTest")
public class PostsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "owner_user_id")
    private Integer ownerUserId;
    @Basic
    @Column(name = "last_editor_user_id")
    private Integer lastEditorUserId;
    @Basic
    @Column(name = "post_type_id")
    private Short postTypeId;
    @Basic
    @Column(name = "accepted_answer_id")
    private Integer acceptedAnswerId;
    @Basic
    @Column(name = "score")
    private Integer score;
    @Basic
    @Column(name = "parent_id")
    private Integer parentId;
    @Basic
    @Column(name = "view_count")
    private Integer viewCount;
    @Basic
    @Column(name = "answer_count")
    private Integer answerCount;
    @Basic
    @Column(name = "comment_count")
    private Integer commentCount;
    @Basic
    @Column(name = "owner_display_name")
    private String ownerDisplayName;
    @Basic
    @Column(name = "last_editor_display_name")
    private String lastEditorDisplayName;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "tags")
    private String tags;
    @Basic
    @Column(name = "content_license")
    private String contentLicense;
    @Basic
    @Column(name = "body")
    private String body;
    @Basic
    @Column(name = "favorite_count")
    private Integer favoriteCount;
    @Basic
    @Column(name = "creation_date")
    private Timestamp creationDate;
    @Basic
    @Column(name = "community_owned_date")
    private Timestamp communityOwnedDate;
    @Basic
    @Column(name = "closed_date")
    private Timestamp closedDate;
    @Basic
    @Column(name = "last_edit_date")
    private Timestamp lastEditDate;
    @Basic
    @Column(name = "last_activity_date")
    private Timestamp lastActivityDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(Integer ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public Integer getLastEditorUserId() {
        return lastEditorUserId;
    }

    public void setLastEditorUserId(Integer lastEditorUserId) {
        this.lastEditorUserId = lastEditorUserId;
    }

    public Short getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(Short postTypeId) {
        this.postTypeId = postTypeId;
    }

    public Integer getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getOwnerDisplayName() {
        return ownerDisplayName;
    }

    public void setOwnerDisplayName(String ownerDisplayName) {
        this.ownerDisplayName = ownerDisplayName;
    }

    public String getLastEditorDisplayName() {
        return lastEditorDisplayName;
    }

    public void setLastEditorDisplayName(String lastEditorDisplayName) {
        this.lastEditorDisplayName = lastEditorDisplayName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContentLicense() {
        return contentLicense;
    }

    public void setContentLicense(String contentLicense) {
        this.contentLicense = contentLicense;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getCommunityOwnedDate() {
        return communityOwnedDate;
    }

    public void setCommunityOwnedDate(Timestamp communityOwnedDate) {
        this.communityOwnedDate = communityOwnedDate;
    }

    public Timestamp getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Timestamp closedDate) {
        this.closedDate = closedDate;
    }

    public Timestamp getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Timestamp lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Timestamp getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Timestamp lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostsEntity that = (PostsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ownerUserId != null ? !ownerUserId.equals(that.ownerUserId) : that.ownerUserId != null) return false;
        if (lastEditorUserId != null ? !lastEditorUserId.equals(that.lastEditorUserId) : that.lastEditorUserId != null)
            return false;
        if (postTypeId != null ? !postTypeId.equals(that.postTypeId) : that.postTypeId != null) return false;
        if (acceptedAnswerId != null ? !acceptedAnswerId.equals(that.acceptedAnswerId) : that.acceptedAnswerId != null)
            return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (viewCount != null ? !viewCount.equals(that.viewCount) : that.viewCount != null) return false;
        if (answerCount != null ? !answerCount.equals(that.answerCount) : that.answerCount != null) return false;
        if (commentCount != null ? !commentCount.equals(that.commentCount) : that.commentCount != null) return false;
        if (ownerDisplayName != null ? !ownerDisplayName.equals(that.ownerDisplayName) : that.ownerDisplayName != null)
            return false;
        if (lastEditorDisplayName != null ? !lastEditorDisplayName.equals(that.lastEditorDisplayName) : that.lastEditorDisplayName != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (contentLicense != null ? !contentLicense.equals(that.contentLicense) : that.contentLicense != null)
            return false;
        if (body != null ? !body.equals(that.body) : that.body != null) return false;
        if (favoriteCount != null ? !favoriteCount.equals(that.favoriteCount) : that.favoriteCount != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (communityOwnedDate != null ? !communityOwnedDate.equals(that.communityOwnedDate) : that.communityOwnedDate != null)
            return false;
        if (closedDate != null ? !closedDate.equals(that.closedDate) : that.closedDate != null) return false;
        if (lastEditDate != null ? !lastEditDate.equals(that.lastEditDate) : that.lastEditDate != null) return false;
        if (lastActivityDate != null ? !lastActivityDate.equals(that.lastActivityDate) : that.lastActivityDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ownerUserId != null ? ownerUserId.hashCode() : 0);
        result = 31 * result + (lastEditorUserId != null ? lastEditorUserId.hashCode() : 0);
        result = 31 * result + (postTypeId != null ? postTypeId.hashCode() : 0);
        result = 31 * result + (acceptedAnswerId != null ? acceptedAnswerId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (viewCount != null ? viewCount.hashCode() : 0);
        result = 31 * result + (answerCount != null ? answerCount.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (ownerDisplayName != null ? ownerDisplayName.hashCode() : 0);
        result = 31 * result + (lastEditorDisplayName != null ? lastEditorDisplayName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (contentLicense != null ? contentLicense.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (favoriteCount != null ? favoriteCount.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (communityOwnedDate != null ? communityOwnedDate.hashCode() : 0);
        result = 31 * result + (closedDate != null ? closedDate.hashCode() : 0);
        result = 31 * result + (lastEditDate != null ? lastEditDate.hashCode() : 0);
        result = 31 * result + (lastActivityDate != null ? lastActivityDate.hashCode() : 0);
        return result;
    }
}
