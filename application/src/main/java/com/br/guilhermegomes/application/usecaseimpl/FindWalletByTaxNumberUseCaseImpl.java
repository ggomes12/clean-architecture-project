package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.FindWalletByTaxNumberGateway;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.core.exception.NotFoundException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.FindWalletByTaxNumberUseCase;

public class FindWalletByTaxNumberUseCaseImpl implements FindWalletByTaxNumberUseCase {
    private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;


    @Override
    public Wallet findByTaxNumber(String taxNumber) throws NotFoundException {
        var wallet = findWalletByTaxNumberGateway.findByTaxNumber(taxNumber);
        if (wallet == null) {
            throw new NotFoundException(ErrorCodeEnum.WA0001.getMessage(), ErrorCodeEnum.WA0001.getCode());
        }
        return wallet;
    }
}
