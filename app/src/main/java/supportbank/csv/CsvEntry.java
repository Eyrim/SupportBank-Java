package supportbank.csv;

import java.math.BigDecimal;

public class CsvEntry {
    private final String date;
    private final String narrative;
    private final String from;
    private final String to;
    private final BigDecimal amount;

    public CsvEntry(String date, String to, String from, String narrative, BigDecimal amount) {
        this.date = date;
        this.narrative = narrative;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public String getDate() { return this.date; }
    public String getNarrative() { return this.narrative; }
    public String getFrom() { return this.from; }
    public String getTo() { return this.to; }
    public BigDecimal getAmount() { return this.amount; }
}
