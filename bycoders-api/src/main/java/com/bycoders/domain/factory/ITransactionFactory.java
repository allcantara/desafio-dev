package com.bycoders.domain.factory;

import com.bycoders.domain.entities.IOperation;
import com.bycoders.domain.entities.ITransaction;

import java.util.List;

public interface ITransactionFactory {
    ITransaction save(ITransaction transaction);
}
