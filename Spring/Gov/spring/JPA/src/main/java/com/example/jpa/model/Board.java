package com.example.jpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@Table(name="boardjpa")
@SequenceGenerator(name="BOARD_SEQ_GENERATOR", sequenceName = "SEQ_BOARD", initialValue = 1, allocationSize = 1)
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "BOARD_SEQ_GENERATOR")
    @Column(length = 10)
    protected Integer id;
    @Column(length = 30, nullable = false)
    protected String name;
    @Column(length = 20, nullable = false)
    protected String password;
    @Column(length = 500, nullable = false)
    protected String title;
    @Column(length = 4000, nullable = false)
    protected String content;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date regdate;
    @Column(length = 10, nullable = false)
    protected Integer readcount;
    @Column(length = 10, nullable = false)
    protected Integer reply =0;
    @Column(length = 10, nullable = false)
    protected Integer replyStep;
    @Column(length = 10, nullable = false)
    protected Integer replylevel;
}
