package com.eagle0eye.stakeholders.patient.domain;

import com.eagle0eye.shared.enums.ASSISTANT_POSITION;
import com.eagle0eye.stakeholders.UserInfo;
import jakarta.persistence.*;

@Entity
@Table(name = "Patients")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private UserInfo userInfo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ASSISTANT_POSITION position;


}
