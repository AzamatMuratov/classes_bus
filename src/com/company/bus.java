package com.company;

public class bus {
    private String FIO, marka;
    private int nomer_bus, num_marsh,god_eksplua, probeg;

    public bus(String FIO, String marka, int nomer_bus, int num_marsh, int god_eksplua, int probeg) {
        this.FIO = FIO;
        this.marka = marka;
        this.nomer_bus = nomer_bus;
        this.num_marsh = num_marsh;
        this.god_eksplua = god_eksplua;
        this.probeg = probeg;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getNomer_bus() {
        return nomer_bus;
    }

    public void setNomer_bus(int nomer_bus) {
        this.nomer_bus = nomer_bus;
    }

    public int getNum_marsh() {
        return num_marsh;
    }

    public void setNum_marsh(int num_marsh) {
        this.num_marsh = num_marsh;
    }

    public int getGod_eksplua() {
        return god_eksplua;
    }

    public void setGod_eksplua(int god_eksplua) {
        this.god_eksplua = god_eksplua;
    }

    public int getProbeg() {
        return probeg;
    }

    public void setProbeg(int probeg) {
        this.probeg = probeg;
    }

    @Override
    public String toString() {
        return "bus{" +
                "FIO='" + FIO + '\'' +
                ", marka='" + marka + '\'' +
                ", nomer_bus=" + nomer_bus +
                ", num_marsh=" + num_marsh +
                ", god_eksplua=" + god_eksplua +
                ", probeg=" + probeg +
                '}';
    }
}
