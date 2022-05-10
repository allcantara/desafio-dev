package com.bycoders.domain.factory;

import java.util.List;

import com.bycoders.domain.entities.IOperation;

public interface IOperationFactory {
    List<IOperation> findAmountOperationsByStore();
}
