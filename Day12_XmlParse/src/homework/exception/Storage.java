package homework.exception;

import org.dom4j.*;
import org.dom4j.io.*;
import org.dom4j.io.*;

import java.io.*;
import java.io.*;
import java.util.*;

public class Storage {
    static SAXReader reader = new SAXReader();
    static Document document = null;
    public Storage(String name, String username, String password,String job) throws IOException, DocumentException {


    //Document document =DocumentHelper.createDocument();
//        SAXReader saxReader = new SAXReader();
//        Document document = saxReader.read(new File("src/zuoye.xml"));

//        Element element = Storage.document.addElement("users");

        Storage.document = reader.read(new File("src/zuoye.xml"));
        Element element1 = Storage.document.getRootElement();
//        Element person1 = users.addElement("users");
        Element element = element1.addElement("users");
        element.addAttribute("name",name);

        Element person2 = element.addElement("person");
        person2.addAttribute("username",username);

        Element p1 = element.addElement("password");
        p1.addAttribute("password",password);

        Element j1 = element.addElement("job");
        j1.addAttribute("job",job);

        OutputFormat outputFormat1 = OutputFormat.createPrettyPrint()    ;
        outputFormat1.setEncoding("utf-8");
        XMLWriter xmlWriter1 = new XMLWriter(new FileWriter("src/zuoye.xml"),outputFormat1);


        xmlWriter1.write(Storage.document);

    //将这个工具关闭,并且把工具中的内容写进目标文件中
        xmlWriter1.close();





    }
    }

