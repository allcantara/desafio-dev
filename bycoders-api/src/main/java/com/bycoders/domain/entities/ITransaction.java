package com.bycoders.domain.entities;

import java.util.Date;
import java.util.UUID;

import com.bycoders.domain.entities.implementations.enummeration.TransactionTypeEnum;

public interface ITransaction {
    UUID getId();

    Date getDateTime();

    Double getValue();

    String getCpf();

    String getUserCard();

    TransactionTypeEnum getType();

    IStore getStore();

}
