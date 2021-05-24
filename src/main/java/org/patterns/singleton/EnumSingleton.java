package org.patterns.singleton;

public enum EnumSingleton {

    INSTANCE(900);

    private int num;

    EnumSingleton(int i) {
        this.num = i;
    }

    public int getNumber() {

        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
