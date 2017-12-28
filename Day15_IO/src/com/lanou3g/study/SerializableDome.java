package com.lanou3g.study;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDome {

    @Test
    public void write() throws IOException {
        Pet pet = new Pet("雪耐瑞","male");

        FileOutputStream fos = new FileOutputStream("src/pet.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pet);

        oos.flush();
        oos.close();
    }
}
