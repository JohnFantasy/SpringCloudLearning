package com.laofaner.javasourcecode.enumeration;

public class SeasonTest {
    public static void main(String[] args) {
        String srt = Season.FALL.getSeasonName();
        Season.FALL.show();
        System.out.println(srt);
    }
}


//枚举类
class Season{

    //1、提供类的属性声明为private final
    private final String seasonName;
    private final String desc;
    //2、声明为private的属性在构造器中进行初始化
    private Season(String seasonName,String desc){

        this.seasonName = seasonName;
        this.desc = desc;
    }
    //3、通过公共的方法来调用属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }
    //4、创建枚举类的对象
    public static final Season SPRING = new Season("Spring","Spring is warm and the flowers are blooming");
    public static final Season SUMMER = new Season("SUMMER","Summer is hot and the degree is the highest");
    public static final Season FALL = new Season("FALL","Fall is cool and the leaves fall down from trees.");
    public static final Season WINTER = new Season("WINTER","Winter is cold and the snow is white");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public void show(){
        System.out.println("这是一个季节");
    }
}
