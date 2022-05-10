package com.bycoders.domain.entities;

import com.bycoders.domain.entities.implementations.enummeration.TransactionTypeEnum;

import java.util.Date;
import java.util.UUID;

public interface ITransaction {
    UUID getId();

    Date getDateTime();

    Double getValue();

    String getCpf();

    String getUserCard();

    TransactionTypeEnum getType();

    IStore getStore();

}
