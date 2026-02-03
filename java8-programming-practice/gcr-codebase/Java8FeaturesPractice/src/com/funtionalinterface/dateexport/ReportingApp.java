package com.funtionalinterface.dateexport;
public class ReportingApp {

    public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();

        String reportData = "Sales Report Q1";

        csv.exportToCSV(reportData);
        csv.exportToPDF(reportData);
        csv.exportToJSON(reportData); // default JSON export

        pdf.exportToCSV(reportData);
        pdf.exportToPDF(reportData);
        pdf.exportToJSON(reportData); // default JSON export
    }
}
