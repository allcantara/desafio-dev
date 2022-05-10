package com.bycoders.domain.factory;

import com.bycoders.domain.entities.IOperation;

import java.util.List;

public interface IOperationFactory {
    List<IOperation> findAmountOperationsByStore();
}
