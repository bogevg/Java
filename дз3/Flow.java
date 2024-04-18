import java.util.ArrayList;
import java.util.List;

public class Flow extends StreamComparator{
    private List<StudyGr> listGr;
    private int start;
    public Flow(int start){
        listGr = new ArrayList<StudyGr>();
        this.start = start;
    }
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public List<StudyGr> getListGr() {
        return listGr;
    }
    public void setListGr(List<StudyGr> listGr) {
        this.listGr = listGr;
    }
    public int sizeListGr(){
        return listGr.size();
    }
    @Override
    public String toString() {
        return "oooo";
    }
}
