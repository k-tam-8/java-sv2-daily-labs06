package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Integer> intList = new ArrayList<>();

    public void addIntList(int num){
        this.intList.add(num);
    }

    public List<Integer> getIntList() {
        return intList;
    }
}
