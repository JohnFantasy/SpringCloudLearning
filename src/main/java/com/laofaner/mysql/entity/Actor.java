package com.laofaner.mysql.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
@ToString
public class Actor {
    private Integer actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;
}
