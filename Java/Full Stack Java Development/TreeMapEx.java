import java.util.*;

class Code implements Comparable<Code>{
        private String sectionNo;
        private String lectureNo;

        public Code(String sectionNo, String lectureNo) {
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
            return "Code{" + "sectionNo='" + sectionNo + '\'' + ", lectureNo='" + lectureNo + '\'' + '}';
        }

        @Override//In treemap or treeset we must override ComapareTo
        public int compareTo(Code o) {
            return 0;
        }
    }

    public class TreeMapEx {
        public static void main(String[] args) {
            Map<Code ,String> map = new TreeMap<>();
            map.put(new Code("S11", "11"), "Lovely");
            map.put(new Code("S12", "12"), "Paul");
            map.put(new Code("S13", "13"), "Sarah");
            map.put(new Code("S14", "14"), "Hannah");
            map.put(new Code("S15", "15"), "Faith");
            map.put(new Code("S16", "16"), "Hope");

            System.out.println(map);

        }
}




