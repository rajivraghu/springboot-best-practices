package com.javatechie.entity;


import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * A Appuser.
 */
@Entity
@Table(name = "appuser")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Appuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "creation_date", nullable = false)
    private Instant creationDate;

    @Size(max = 7500)
    @Column(name = "bio", length = 7500)
    private String bio;

    @Size(max = 50)
    @Column(name = "facebook", length = 50)
    private String facebook;

    @Size(max = 50)
    @Column(name = "twitter", length = 50)
    private String twitter;

    @Size(max = 50)
    @Column(name = "linkedin", length = 50)
    private String linkedin;

    @Size(max = 50)
    @Column(name = "instagram", length = 50)
    private String instagram;

    @Size(max = 50)
    @Column(name = "tiktok", length = 50)
    private String tiktok;

    @Column(name = "birthdate")
    private Instant birthdate;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Appuser id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreationDate() {
        return this.creationDate;
    }

    public Appuser creationDate(Instant creationDate) {
        this.setCreationDate(creationDate);
        return this;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public String getBio() {
        return this.bio;
    }

    public Appuser bio(String bio) {
        this.setBio(bio);
        return this;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFacebook() {
        return this.facebook;
    }

    public Appuser facebook(String facebook) {
        this.setFacebook(facebook);
        return this;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return this.twitter;
    }

    public Appuser twitter(String twitter) {
        this.setTwitter(twitter);
        return this;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return this.linkedin;
    }

    public Appuser linkedin(String linkedin) {
        this.setLinkedin(linkedin);
        return this;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getInstagram() {
        return this.instagram;
    }

    public Appuser instagram(String instagram) {
        this.setInstagram(instagram);
        return this;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTiktok() {
        return this.tiktok;
    }

    public Appuser tiktok(String tiktok) {
        this.setTiktok(tiktok);
        return this;
    }

    public void setTiktok(String tiktok) {
        this.tiktok = tiktok;
    }

    public Instant getBirthdate() {
        return this.birthdate;
    }

    public Appuser birthdate(Instant birthdate) {
        this.setBirthdate(birthdate);
        return this;
    }

    public void setBirthdate(Instant birthdate) {
        this.birthdate = birthdate;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Appuser)) {
            return false;
        }
        return id != null && id.equals(((Appuser) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Appuser{" +
            "id=" + getId() +
            ", creationDate='" + getCreationDate() + "'" +
            ", bio='" + getBio() + "'" +
            ", facebook='" + getFacebook() + "'" +
            ", twitter='" + getTwitter() + "'" +
            ", linkedin='" + getLinkedin() + "'" +
            ", instagram='" + getInstagram() + "'" +
            ", tiktok='" + getTiktok() + "'" +
            ", birthdate='" + getBirthdate() + "'" +
            "}";
    }
}
