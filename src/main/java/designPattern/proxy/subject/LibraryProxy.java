package designPattern.proxy.subject;

import java.util.ArrayList;

public class LibraryProxy implements ISubject{

    private RealSubject rs;

    private ArrayList restictedSiteList;
    private String hostUrl;

    public LibraryProxy(ArrayList restictedSiteList) {
        this.restictedSiteList = restictedSiteList;
    }

    @Override
    public void access() {

        if(!restictedSiteList.contains(hostUrl)){

            if(rs == null){
                System.out.println("First time load to internet");
                rs = new RealSubject();
            }
            rs.access();
        } else{
            System.out.println(hostUrl + " is a Restricted site.....");
        }
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }


}
