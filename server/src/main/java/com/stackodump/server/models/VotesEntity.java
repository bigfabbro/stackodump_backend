package com.stackodump.server.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "votes", schema = "public", catalog = "SODTest")
public class VotesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "post_id")
    private Integer postId;
    @Basic
    @Column(name = "vote_type_id")
    private Short voteTypeId;
    @Basic
    @Column(name = "bounty_amount")
    private Short bountyAmount;
    @Basic
    @Column(name = "creation_date")
    private Timestamp creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Short getVoteTypeId() {
        return voteTypeId;
    }

    public void setVoteTypeId(Short voteTypeId) {
        this.voteTypeId = voteTypeId;
    }

    public Short getBountyAmount() {
        return bountyAmount;
    }

    public void setBountyAmount(Short bountyAmount) {
        this.bountyAmount = bountyAmount;
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

        VotesEntity that = (VotesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (voteTypeId != null ? !voteTypeId.equals(that.voteTypeId) : that.voteTypeId != null) return false;
        if (bountyAmount != null ? !bountyAmount.equals(that.bountyAmount) : that.bountyAmount != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        result = 31 * result + (voteTypeId != null ? voteTypeId.hashCode() : 0);
        result = 31 * result + (bountyAmount != null ? bountyAmount.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
