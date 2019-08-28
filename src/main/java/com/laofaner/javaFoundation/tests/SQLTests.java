package com.laofaner.javaFoundation.tests;

/**
 * @ClassName SQLTests
 * @Description TODO
 * @Author fyz
 * @Date 2018-12-21 05:01 AM
 * @Version 1.0
 */
public class SQLTests {
    public static void main(String[] args) {
        {
            String str = "" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34629, 500224, '巴川街道', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34630, 500224, '东城街道', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34631, 500224, '南城街道', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34632, 500224, '土桥镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34633, 500224, '二坪镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34634, 500224, '水口镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34635, 500224, '安居镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34636, 500224, '白羊镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34637, 500224, '平滩镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34638, 500224, '石鱼镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34639, 500224, '福果镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34640, 500224, '维新镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34641, 500224, '高楼镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34642, 500224, '大庙镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34643, 500224, '围龙镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34644, 500224, '华兴镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34645, 500224, '永嘉镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34646, 500224, '安溪镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34647, 500224, '西河镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34648, 500224, '太平镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34649, 500224, '旧县镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34650, 500224, '虎峰镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34651, 500224, '少云镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34652, 500224, '蒲吕镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34653, 500224, '侣俸镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34654, 500224, '小林镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34655, 500224, '双山镇', null, null, null);\n" +
                    "INSERT INTO T_AREA_AREAINFO VALUES (34656, 500224, '庆隆镇', null, null, null);";

            String[] sqls = str.split("\n");
            System.out.println(sqls.length);
            for (int i = 0; i < sqls.length; i++) {
//                if (i % 2 == 0) {
//                    try {
//                        FileWriter fw = new FileWriter("D:\\sql.sql", true);
//                        BufferedWriter bw = new BufferedWriter(fw);
//                        bw.append(sqls[i].replace("INSERT INTO MY_TABLE(BILL_NO) VALUES (", "DELETE FROM T_COMMUNITY_BILL WHERE BILL_NO =").replace(")", "")+"\n");
//                        bw.close();
//                        fw.close();
//                    } catch (Exception e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
                System.out.println(sqls[i]);
            }

        }
    }
}
