package ch15.exercise.num07;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList(); //List : 인터페이스, <board> : 클래스
        for (Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
