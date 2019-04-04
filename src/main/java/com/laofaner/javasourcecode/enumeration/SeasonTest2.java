package com.laofaner.javasourcecode.enumeration;

public class SeasonTest2 {
    public static void main(String[] args) {

        Season1[] season1s = Season1.values();
        for(Season1 season1 : season1s){
            System.out.println(season1);
        }

    }
}

//枚举类
enum Season1{

    SPRING("SPRING","SPRING IS GOOD"),
    SUMMER("SUMMER","SUMMER IS NOT GOOD"),
    FALL("FALL","FALL IS GOOD"),
    WINTER("WINTER","WINTER IS GOOD");

    private final String seasonName;

    private final String seasonDesc;

    private Season1(String seasonName,String desc){
        this.seasonName = seasonName;
        this.seasonDesc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
