package task_8;

public class Main {
    static void main(String[] args) {
        Museum museum = new Museum();
        Sculpture sculpture = new Sculpture();
        Manuscript manuscript = new Manuscript();

        museum.setExhibit(sculpture);
        museum.getCareInstruction();
        museum.deleteExhibit();

        museum.setExhibit(manuscript);
        museum.getCareInstruction();
    }
}
