package com.banking.accounts.service.client;

import com.banking.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallBack implements LoansFeignClient{
    @Override
    public ResponseEntity<LoansDto> fetchLoansDetails(String mobileNumber, String number) {
        return null;
    }
}
