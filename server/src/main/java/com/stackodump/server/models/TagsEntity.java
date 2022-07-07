package com.stackodump.server.models;

import javax.persistence.*;

@Entity
@Table(name = "tags", schema = "public", catalog = "SODTest")
public class TagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "excerpt_post_id")
    private Integer excerptPostId;
    @Basic
    @Column(name = "wiki_post_id")
    private Integer wikiPostId;
    @Basic
    @Column(name = "tag_name")
    private String tagName;
    @Basic
    @Column(name = "count")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExcerptPostId() {
        return excerptPostId;
    }

    public void setExcerptPostId(Integer excerptPostId) {
        this.excerptPostId = excerptPostId;
    }

    public Integer getWikiPostId() {
        return wikiPostId;
    }

    public void setWikiPostId(Integer wikiPostId) {
        this.wikiPostId = wikiPostId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagsEntity that = (TagsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (excerptPostId != null ? !excerptPostId.equals(that.excerptPostId) : that.excerptPostId != null)
            return false;
        if (wikiPostId != null ? !wikiPostId.equals(that.wikiPostId) : that.wikiPostId != null) return false;
        if (tagName != null ? !tagName.equals(that.tagName) : that.tagName != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (excerptPostId != null ? excerptPostId.hashCode() : 0);
        result = 31 * result + (wikiPostId != null ? wikiPostId.hashCode() : 0);
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }
}
