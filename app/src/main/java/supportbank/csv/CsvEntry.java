package supportbank.csv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CsvEntry {
    // The date of the transaction
    private final String date;
    // The stated reason for the transaction
    private final String narrative;
    // The person paying
    private final String from;
    // The person being paid
    private final String to;
    // The value of the transaction
    private final BigDecimal amount;

    public CsvEntry(String date, String to, String from, String narrative, BigDecimal amount) {
        this.date = date;
        this.narrative = narrative;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    /**
     * Creates a CsvEntry for every element in the data List
     * @param data List&lt;String&gt; where each element is a line from a Transactions.csv file
     * @return List&lt;CsvEntry&gt; where <code>data</code> is mapped to CsvEntry objects
     */
    public static List<CsvEntry> createEntries(List<String> data) {
        String[] currentLine;
        List<CsvEntry> entries = new ArrayList<>();
        // We need to discard the first line as it's just key data
        data = data.stream().skip(1).toList();

        for (String entry : data) {
            currentLine = entry.split(",");

            entries.add(new CsvEntry(
                    currentLine[0],
                    currentLine[1],
                    currentLine[2],
                    currentLine[3],
                    new BigDecimal(currentLine[4])
            ));
        }

        return entries;
    }

    public String getDate() { return this.date; }
    public String getNarrative() { return this.narrative; }
    public String getFrom() { return this.from; }
    public String getTo() { return this.to; }
    public BigDecimal getAmount() { return this.amount; }
}
