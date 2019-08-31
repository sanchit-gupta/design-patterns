package structural.proxy;

import structural.proxy.code.DataIngestion;
import structural.proxy.code.DataIngestionImplementor;
import structural.proxy.code.DvsProxy;

public class Main {

    private static DataIngestion ingestion;

    public static void main(String[] args) {
        ingestion = new DvsProxy();
        ingestion.ingestData();
    }
}
