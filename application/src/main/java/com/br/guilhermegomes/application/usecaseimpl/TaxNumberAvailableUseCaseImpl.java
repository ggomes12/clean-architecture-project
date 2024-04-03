package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.TaxNumberAvailableGateway;
import com.br.guilhermegomes.usecase.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {
    private TaxNumberAvailableGateway taxNumberAvaliableGateway;

    public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvaliableGateway) {
        this.taxNumberAvaliableGateway = taxNumberAvaliableGateway;
    }

    @Override
    public Boolean taxNumberAvaliable(String taxNumber) {
        return taxNumberAvaliableGateway.taxNumberAvailable(taxNumber);
    }
}
