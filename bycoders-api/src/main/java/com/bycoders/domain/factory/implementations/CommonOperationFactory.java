package com.bycoders.domain.factory.implementations;

import java.util.ArrayList;
import java.util.List;

import com.bycoders.domain.entities.IOperation;
import com.bycoders.domain.entities.implementations.enummeration.CommonOperation;
import com.bycoders.domain.factory.IOperationFactory;

public class CommonOperationFactory implements IOperationFactory {


    @Override
    public List<IOperation> findAmountOperationsByStore() {
        List<IOperation> operations = new ArrayList<>();
        operations.add(new CommonOperation(4l, "Loja da esquina", "Bruno", 40.5));

        return operations;
    }
}
