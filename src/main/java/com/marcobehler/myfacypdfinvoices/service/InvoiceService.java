package com.marcobehler.myfacypdfinvoices.service;

import com.marcobehler.myfacypdfinvoices.model.Invoice;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvoiceService {
    /*
    public Invoice create(String userId, Integer amount) {
        // TODO real pdf creation and storing it on network server
        return new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
    }
     */
    List<Invoice> invoices = new CopyOnWriteArrayList<>();

    // get all invoices
    public List<Invoice> findAll() {
        return invoices;
    }

    public Invoice create(String userId, Integer amount) {
        // TODO real pdf creation and storing it on network server
        Invoice invoice = new Invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf");
        invoices.add(invoice);
        return invoice;
    }
}
