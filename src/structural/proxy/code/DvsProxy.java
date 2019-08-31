package structural.proxy.code;

public class DvsProxy extends DataIngestionImplementor {

    @Override
    public void ingestData() {
        System.out.println("Getting data from DVS and dumping into Mongo");
        super.ingestData();
    }

}
