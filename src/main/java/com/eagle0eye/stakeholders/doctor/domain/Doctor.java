package com.eagle0eye.stakeholders.doctor.domain;

import com.eagle0eye.shared.enums.DOCTOR_DEPARTMENT;
import com.eagle0eye.shared.enums.DOCTOR_POSITION;
import com.eagle0eye.stakeholders.UserInfo;
import jakarta.persistence.*;

@Entity
@Table(name = "Doctors")
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Embedded
    private UserInfo userInfo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DOCTOR_POSITION position;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DOCTOR_DEPARTMENT department;




}
