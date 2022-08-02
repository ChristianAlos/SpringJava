package com.marcobehler.myfacypdfinvoices.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcobehler.myfacypdfinvoices.service.InvoiceService;
import com.marcobehler.myfacypdfinvoices.service.UserService;

public class Application {
    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
