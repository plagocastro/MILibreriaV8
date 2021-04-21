package com.EXAMENCOS;

public class Consola {

    private String msg;

    public Consola(String msg) {
        this.msg = msg;
    }
    public void visualiza() {
        System.out.println("Sale por la consola " + msg);
    }

}
