package com.banking.accounts.service.client;

import com.banking.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CardsFallBack implements CardsFeignClient{
    @Override
    public ResponseEntity<CardsDto> fetchCardsDetails(String mobileNumber, String number) {
        return null;
    }
}
