package org.demo.intestption;

import lombok.Data;

@Data
class LombokExample {

    private int data;

    int useBlackMagic(int value) {
        setData(value);
        return getData();
    }

}
