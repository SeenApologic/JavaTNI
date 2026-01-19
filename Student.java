public class Student {
    private String name;
    private int studyYear;
    private int score = 0;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }
    public int getStudyYear(){
        return this.studyYear;
    }
    public int getScore() {
        return this.score;
    }
    public void addPoint(int point){
        this.score += point;
        System.out.println(this.name + " got " + point + " points");
    }
    public String getGrade(){
        if (this.score >= 80) return "A";
        else if (this.score >= 70) return "B";
        else if (this.score >= 60) return "C";
        else return "F";
    }
}
