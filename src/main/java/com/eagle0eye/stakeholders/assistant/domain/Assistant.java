package com.eagle0eye.stakeholders.assistant.domain;

import com.eagle0eye.shared.enums.ASSISTANT_POSITION;
import com.eagle0eye.stakeholders.UserInfo;
import jakarta.persistence.*;

@Entity
@Table(name = "Assistants")
public class Assistant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Embedded
    private UserInfo userInfo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ASSISTANT_POSITION position;

}
