package com.tradition.springsecurity.web;

import com.tradition.springsecurity.service.LoanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoanController {

    private final LoanService service;

    public LoanController(LoanService service) {
        this.service = service;
    }

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "<h1>Loan Portal Home</h1>" +
                "<p>You are authenticated.</p>" +
                "<a href='loanStmt?loanNo=11'>View Loan Statement</a><br/>" +
                "<a href='apply-loan'>Apply Loan</a><br/>" +
                "<a href='admin'>Admin Area</a><br/>" +
                "<a href='logout'>Logout</a>";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "<h1>ADMIN AREA</h1><p>Only ADMIN role can reach this endpoint.</p>";
    }

    @GetMapping("/apply-loan")
    @ResponseBody
    public String applyLoan() {
        return service.applyLoan();
    }

    @GetMapping("/loanStmt")
    @ResponseBody
    public String loanStatement(@RequestParam String loanNo) {
        return service.getLoanStatement(loanNo);
    }
}
