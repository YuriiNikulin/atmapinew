package app.service;

import app.dto.AuthenticationBankCardDTO;
import app.dto.CreateBankCardDTO;
import app.dto.TransferDTO;
import app.model.BankCard;

import java.util.List;

public interface BankCardService {

    boolean createBankCard (CreateBankCardDTO dto);

    boolean authenticationBankCard(AuthenticationBankCardDTO dto);

    boolean transferFromCardToCard(TransferDTO dto);

    List<String> allCards();

    BankCard getCardByNumber(String number);
}