package model;

public class Score {
    String name;
    int kor;

    public Score(String name,int kor){
        this.name = name;
        this.kor = kor;
    }

    @Override
    public String toString(){
        return "Name : " +name +", Korean Score : "+kor;
    }
}
