package com.bycoders.domain.factory.implementations;

import com.bycoders.domain.entities.ITransaction;
import com.bycoders.domain.entities.implementations.CommonTransaction;
import com.bycoders.domain.factory.ITransactionFactory;

public class CommonTransactionFactory implements ITransactionFactory {

    @Override
    public ITransaction save(ITransaction transaction) {
        return new CommonTransaction(transaction);
    }

}
