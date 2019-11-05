package main.java.com.lab111.lab9;

interface APIFactory {
    public Db createDb(String param, int ...nums);
    public File createFile(String ... params);
    public WebService createWebService(int id, String ... params);
}
