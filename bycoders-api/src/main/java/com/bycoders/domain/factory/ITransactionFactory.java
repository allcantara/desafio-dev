package com.bycoders.domain.factory;

import com.bycoders.domain.entities.ITransaction;

public interface ITransactionFactory {
    ITransaction save(ITransaction transaction);
}
