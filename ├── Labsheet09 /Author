public class Author {
    private String name;
    private String nationality;
    private int brithYear;

    Author(String name,String nationality,int brithYear){
        this.name = name;
        this.nationality = nationality;
        this.brithYear = brithYear;
    }
    Author(String name, String nationality){
        this(name, nationality,0);
    }
    Author(String name){
        this(name,"",0);
    }
    Author(){
        this("","",0);
    }
    public String getName(){
        return name;
    }
    public String showAuthorInfo(){
        if (this.nationality.equals(""))
            return this.name;
        if (this.brithYear == 0)
            return this.name + " (" + this.nationality + ")";
        return this.name + " (" + this.nationality + ", born " +this.brithYear + ")";
    }
}
