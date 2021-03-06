package es.uji.security.ui.applet.io;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

import es.uji.security.crypto.config.OS;

public class ConsoleOutputParams implements OutputParams
{
    private Logger log = Logger.getLogger(ConsoleOutputParams.class);
    
    public void setSignData(InputStream is, int currentIndex) throws IOException
    {
    	byte[] data= OS.inputStreamToByteArray(is);
        System.out.println("Index " + currentIndex);
        System.out.println(new String(data));
    }

    public void setSignFormat(byte[] signFormat) throws IOException
    {
        log.debug("Called setSignFormat: " + new String(signFormat));
    }

    public void signOk()
    {
        log.debug("Called signOk function");
    }

    public void flush()
    {
    }
}