package com.bycoders.useCases.operation;

import com.bycoders.domain.entities.IOperation;
import com.bycoders.domain.factory.IOperationFactory;

import java.util.List;

public class ListOperationUseCase {
    private final IOperationFactory factory;

    public ListOperationUseCase(IOperationFactory factory) {
        this.factory = factory;
    }

    public List<IOperation> handler() {
        return factory.findAmountOperationsByStore();
    }
}
