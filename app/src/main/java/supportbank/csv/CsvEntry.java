package supportbank.csv;

public class CsvEntry {
    private final String date;
    private final String from;
    private final String to;
    private final String narrative;
    private final Double amount;

    public CsvEntry(String date, String from,
                    String to, String narrative,
                    Double amount) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.narrative = narrative;
        this.amount = amount;
    }

    public String getDate() { return this.date; }
    public String getFrom() { return this.from; }
    public String getTo() { return this.to; }
    public String getNarrative() { return this.narrative; }
    public Double getAmount() { return this.amount; }
}
