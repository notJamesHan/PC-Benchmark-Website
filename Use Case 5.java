package usecase5;

import java.util.*;
public class UC5 {
    String cpu;
    String gpu;
    String mobo;
    String ram;

    public UC5(){
        cpu = "";
        gpu = "";
        mobo = "";
        ram = "";
    }

    public UC5(String c, String g, String m, String r){
        cpu = c;
        gpu = g;
        mobo = m;
        ram = r;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setMobo(String mobo) {
        this.mobo = mobo;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMobo() {
        return mobo;
    }

    public String getRam() {
        return ram;
    }

    public String toString(){
        return cpu+" "+gpu+" "+mobo+" "+ram;
    }
}

