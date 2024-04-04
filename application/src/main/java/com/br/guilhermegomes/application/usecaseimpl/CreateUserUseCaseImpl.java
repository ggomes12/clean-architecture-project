package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.CreateUserGateway;
import com.br.guilhermegomes.core.domain.TransactionPin;
import com.br.guilhermegomes.core.domain.User;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.core.exception.EmailException;
import com.br.guilhermegomes.core.exception.InternalServerErrorException;
import com.br.guilhermegomes.core.exception.TaxNumberException;
import com.br.guilhermegomes.core.exception.TransactionPinException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException {
        if (!taxNumberAvailableUseCase.taxNumberAvaliable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }
        if(!emailAvailableUseCase.emailAvailableEmail(user.getEmain())) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }
        if(!createUserGateway.create(user, new Wallet(BigDecimal.ZERO, user), new TransactionPin(user, pin))) {
            throw new InternalServerErrorException(ErrorCodeEnum.ON0004.getMessage(), ErrorCodeEnum.ON0004.getCode());
        }


    }
}
