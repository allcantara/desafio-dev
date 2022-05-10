package com.bycoders.domain.entities;

import java.util.UUID;

public interface IStore {
    UUID getId();

    String getName();

    IUser getUser();
}
