package com.bycoders.domain.entities;

import com.bycoders.domain.entities.implementations.enummeration.UserEnum;

import java.util.UUID;

public interface IUser {
    UUID getId();

    String getName();

    UserEnum getType();
}
