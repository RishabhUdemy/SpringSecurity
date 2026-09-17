package com.tradition.springsecurity.service;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public String getLoanStatement(String loanNo) {
        return "Loan statement for loanNo=" + loanNo +
                " | status=APPROVED | outstanding=450000";
    }

    public String applyLoan() {
        return "Loan application submitted successfully.";
    }
}
