package com.cc.services;

import java.util.Optional;

import com.cc.model.CreditCard;

public interface CreditCardService {
	public Optional<CreditCard> getCreditCardDetails(Long cardNumber);
	public CreditCard addCreditCardDetails(CreditCard creditCard);

}
