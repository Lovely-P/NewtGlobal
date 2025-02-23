
import java.util.*;

class Codes implements Comparable<Codes>{
    private String sectionNo;
    private String lectureNo;

    public Codes(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Codes o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Codes code = (Codes) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }
}

public class MapSearch {
    public static void main(String[] args) {

        Map<Codes ,String> map = new TreeMap<>();
        map.put(new Codes("S11", "11"), "Lovely");
        map.put(new Codes("S11", "22"), "Paul");
        map.put(new Codes("S11", "00"), "Hannah");
        map.put(new Codes("S11", "05"), "Sarah");
        Codes code = null;

        for (Codes key: map.keySet()) {
            if(map.get(key).equals("Paul")){
                code = key;
                break;
            }
        }
        System.out.println(code);

    }
}



