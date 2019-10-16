package main.java.com.lab111.labwork9;
/**
 * @author Dudka Maxym
 * @version 12.0.1
 * Only workclass.
 */
public class Main9 {
    public static void main(String[] args) {

        //создаю файл и клиента, для пождальших опреаций с ними
        ConfigFile myFile= new ConfigFile();
        Client client = new Client();

        //создаю строителя с 1 вариантом
        ElementBuilder red50CircleBuilder = new Green20CircleBuilder();

        //говорю клиенту, что именно строить
        client.setBuilder(red50CircleBuilder);
        client.constructElement();

        //узнаю инфу
        Element myEl1= client.getMyEl();
        myEl1.getMyElInfo();
        System.out.println();

        //загружаю конфигурацию с файла
        client.loadConfigfromFile(myFile);
        client.constructElement();

        //узнаю инфу
        Element myEl2= client.getMyEl();
        myEl2.getMyElInfo();
    }
}
