package main.java.com.lab111.lab9;

public class ViewerApiFactory implements APIFactory{
    @Override
    public Db createDb(String param, int... nums) {
        System.out.println("Creating db in viewer Factory");
        return new ViewerDb(1,1,param);
    }

    @Override
    public File createFile(String... params) {
        System.out.println("Creating file in viewer Factory");
        return new ViewerFile(params[0], params[1],1,'r');
    }

    @Override
    public WebService createWebService(int id, String... params) {
        System.out.println("Creating Web service in viewer Factory");
        return new ViewerWeb(params[0], 'r', params[1]);
    }
}
