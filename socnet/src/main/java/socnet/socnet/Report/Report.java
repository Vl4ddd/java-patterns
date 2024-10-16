package socnet.socnet.Report;

public abstract class Report {
    protected ReportFormatter formatter;

    protected Report(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public abstract void generateReport(String data);
}