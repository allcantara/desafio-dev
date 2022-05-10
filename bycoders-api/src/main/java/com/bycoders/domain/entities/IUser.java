package com.bycoders.domain.entities;

import java.util.UUID;

import com.bycoders.domain.entities.implementations.enummeration.UserEnum;

public interface IUser {
    UUID getId();

    String getName();

    UserEnum getType();
}
