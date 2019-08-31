package structural.bridge;

import structural.bridge.code.FileDownloaderAbstraction;
import structural.bridge.code.FileDownloaderAbstractionImpl;
import structural.bridge.code.LinuxFileDownloadImplementor;
import structural.bridge.code.WindowsFileDownloadImplementor;

public class Main
{
    public static void main(String[] args)
    {
        String os = "windows";
        FileDownloaderAbstraction downloader = null;
 
        switch (os)
        {
            case "windows":
                downloader = new FileDownloaderAbstractionImpl( new WindowsFileDownloadImplementor() );
                break;
                 
            case "linux":
                downloader = new FileDownloaderAbstractionImpl( new LinuxFileDownloadImplementor() );
                break;
                 
            default:
                System.out.println("OS not supported !!");
        }
         
        Object fileContent = downloader.download("some path");
        downloader.store(fileContent);
    }
}