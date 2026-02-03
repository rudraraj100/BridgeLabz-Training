package com.funtionalinterface.dateexport;
class CSVExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("CSVExporter cannot export PDF, skipping...");
    }

    // Uses default exportToJSON()
}

class PDFExporter implements ReportExporter {

    @Override
    public void exportToCSV(String data) {
        System.out.println("PDFExporter cannot export CSV, skipping...");
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting to PDF: " + data);
    }

    // Uses default exportToJSON()
}
