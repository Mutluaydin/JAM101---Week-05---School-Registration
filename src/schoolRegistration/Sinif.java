package schoolRegistration;

import java.util.Arrays;

public class Sinif {
    private int gradeOfClass;
    private Ogrenci[] ogrencis = new Ogrenci[2];

    public int getGradeOfClass() {
        return gradeOfClass;
    }

    public void setGradeOfClass(int gradeOfClass) {
        this.gradeOfClass = gradeOfClass;
    }

    public Ogrenci[] getOgrencis() {
        return ogrencis;
    }

    public void setOgrencis(Ogrenci[] ogrencis) {
        this.ogrencis = ogrencis;
    }
}
