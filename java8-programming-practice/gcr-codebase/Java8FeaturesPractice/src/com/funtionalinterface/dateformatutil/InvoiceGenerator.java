package com.funtionalinterface.dateformatutil;
import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateFormatUtil.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateFormatUtil.formatDate(invoiceDate, "MMM dd, yyyy");

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
    }
}
