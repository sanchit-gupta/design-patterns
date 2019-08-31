package structural.bridge.code;

public interface FileDownloaderAbstraction
{
    public Object download(String path);
     
    public boolean store(Object object);
}