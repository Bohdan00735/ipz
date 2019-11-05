package main.java.com.lab111.lab9;

public class RedactorApiFactory implements APIFactory {
    @Override
    public Db createDb(String param, int... nums) {
        System.out.println("Creating db in redactor Factory");
        return new RedactorDb(2,3,param);
    }

    @Override
    public File createFile(String... params) {
        System.out.println("Creating file in redactor Factory");
        return new RedactorFile(params[0], params[1],3,'w');
    }

    @Override
    public WebService createWebService(int id, String... params) {
        System.out.println("Creating Web in redactor Factory");
        return new RedactprWeb(params[0], 'w', params[1]);
    }
}
