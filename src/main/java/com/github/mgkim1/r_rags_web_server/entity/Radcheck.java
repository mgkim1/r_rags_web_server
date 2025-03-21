package com.github.mgkim1.r_rags_web_server.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "radcheck")
public class Radcheck {

    public Radcheck(Integer id, String username, String attribute, String op, String value) {
        this.id = id;
        this.username = username;
        this.attribute = attribute;
        this.op = op;
        this.value = value;
    }

    public Radcheck() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 번호. Integer과는 달리 int에는 null이 들어갈 수 없음

    @Column(length = 64, nullable = false)
    private String username; // 사용자명(Wi-Fi 접속 아이디)

    @Column(length = 64, nullable = false)
    private String attribute;

    @Column(length = 2, nullable = false, columnDefinition = "CHAR(2) DEFAULT '=='")
    private String op;

    @Column(length = 253, nullable = false)
    private String value; // 비밀번호

    public String getUsername() {
        return this.username;
    }
    public String getValue() {
        return this.value;
    }
}
