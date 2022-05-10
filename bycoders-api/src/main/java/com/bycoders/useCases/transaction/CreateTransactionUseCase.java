package com.bycoders.useCases.transaction;

import com.bycoders.domain.entities.ITransaction;
import com.bycoders.domain.factory.ITransactionFactory;

import java.util.List;

public class CreateTransactionUseCase {
    private final ITransactionFactory factory;

    public CreateTransactionUseCase(ITransactionFactory factory) {
        this.factory = factory;
    }

    public void handler(List<ITransaction> entities) throws Exception {
        entities.forEach(entity -> {
            try {
                create(entity);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public ITransaction create(ITransaction entity) throws Exception {
        TransactionRules.run(entity);
        return factory.save(entity);
    }

}
