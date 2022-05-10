package com.bycoders.useCases.transaction;

import com.bycoders.app.utils.exception.ByCodersAppException;
import com.bycoders.domain.entities.ITransaction;

public class TransactionRules {

    public static void run(ITransaction entity) throws Exception {
        verifyCpfInvalid(entity.getCpf());
    }

    private static void verifyCpfInvalid(String cpf) throws Exception {
        int total = 0;

        total += Integer.valueOf(cpf.substring(0, 1)) * 10;
        total += Integer.valueOf(cpf.substring(1, 2)) * 9;
        total += Integer.valueOf(cpf.substring(2, 3)) * 8;
        total += Integer.valueOf(cpf.substring(3, 4)) * 7;
        total += Integer.valueOf(cpf.substring(4, 5)) * 6;
        total += Integer.valueOf(cpf.substring(5, 6)) * 5;
        total += Integer.valueOf(cpf.substring(6, 7)) * 4;
        total += Integer.valueOf(cpf.substring(7, 8)) * 3;
        total += Integer.valueOf(cpf.substring(8, 9)) * 2;

        int digito1 = total % 10;

        total = 0;

        total += Integer.valueOf(cpf.substring(0, 1)) * 11;
        total += Integer.valueOf(cpf.substring(1, 2)) * 10;
        total += Integer.valueOf(cpf.substring(2, 3)) * 9;
        total += Integer.valueOf(cpf.substring(3, 4)) * 8;
        total += Integer.valueOf(cpf.substring(4, 5)) * 7;
        total += Integer.valueOf(cpf.substring(5, 6)) * 6;
        total += Integer.valueOf(cpf.substring(6, 7)) * 5;
        total += Integer.valueOf(cpf.substring(7, 8)) * 4;
        total += Integer.valueOf(cpf.substring(8, 9)) * 3;
        total += Integer.valueOf(cpf.substring(9, 10)) * 2;

        int digito2 = total % 11;

        if (!String.valueOf(digito1).equals(cpf.substring(9)) && String.valueOf(digito1).equals(cpf.substring(10))) {
            throw new ByCodersAppException("Cpf is invalid, please verify this information!");
        }

    }

}
