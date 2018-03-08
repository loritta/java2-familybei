/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.constraint.*;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.*;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter {

    public CsvPreference customCsvPreference(){
        return new CsvPreference.Builder('|', ',', "\n").build();
    }

    public static void writeCsvTransactions(String csvFileName, List<Transaction> transactions, String title) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFileName), CsvPreference.STANDARD_PREFERENCE)) {
            //the title of the chunk
            final String fileTitle=title;
            beanWriter.writeHeader(title);
            
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[] {"id", "userid", "amount", "transDate", "category"};
            final CellProcessor[] processors = getProcessors();

            // write the header
            beanWriter.writeHeader(header);

            // write the beans
            for(final Transaction trans : transactions ) {
                System.out.println(transactions+"\n");
                beanWriter.write(transactions,header,processors);
            }
        }
    }
    public static void writeCsvBudget(String csvFileName, List<BudgetsMonthly> transactions, String title) throws IOException {
        try (ICsvBeanWriter beanWriter = new CsvBeanWriter(new FileWriter(csvFileName), CsvPreference.STANDARD_PREFERENCE)) {
            //the title of the chunk
            final String fileTitle=title;
            beanWriter.writeHeader(title);
            
            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[] { "id", "userid", "amount", "transDate", "category"};
            final CellProcessor[] processors = getProcessors();

            // write the header
            beanWriter.writeHeader(header);

            // write the beans
            for(final BudgetsMonthly budg : transactions ) {
                beanWriter.write(transactions,header,processors);
            }
        }
    }

    private static CellProcessor[] getProcessors(){
        return new CellProcessor[] {
                new Unique(new ParseInt()),
                new NotNull(),
                new Optional(),
                new ParseDouble(),
                new ParseBigDecimal(),
                new FmtDate("dd/MM/yyyy")};
    }
}