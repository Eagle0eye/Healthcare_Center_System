package com.eagle0eye.stakeholders;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import jakarta.persistence.PrePersist;
import lombok.Data;

import static com.eagle0eye.shared.util.DateTimeUtil.now;

@Data
@Embeddable
public class UserInfo {
    @Column(nullable = false)
    private String firstName;

    private String lastName;
    private String address;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String createdAt;
    @Column(nullable = false)
    private String updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = now();
        updatedAt = createdAt;
    }
    private String fingerprint;
}
