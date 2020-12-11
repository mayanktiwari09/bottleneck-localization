package fact.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.concurrent.TimeUnit;


@Service
public class FactService {

    public Long calculateFactorial(final int number) throws InterruptedException {
        final long result = getFact(number);
        return result;
    }

    private String getHostName(){
        try{
            return InetAddress.getLocalHost().getHostName();
        }catch(Exception e){
            return "UNKNOWN";
        }
    }

    private long getFact(int number) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        long fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
