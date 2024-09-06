package ch15.exercise.num07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> List = new ArrayList<>();
        List.add(new Board("제목1", "내용1"));
        List.add(new Board("제목2", "내용2"));
        List.add(new Board("제목2", "내용2"));
        return List;
    }
}
