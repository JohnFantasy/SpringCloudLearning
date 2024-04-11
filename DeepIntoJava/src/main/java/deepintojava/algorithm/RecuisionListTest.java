package deepintojava.algorithm;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecuisionListTest {

    public static void main(String[] args) {
        List<FileDTO> list = new ArrayList<FileDTO>(
        ) {
            {
                add(new FileDTO().setId(1).setParentId(null).setName("test1"));
                add(new FileDTO().setId(2).setParentId(1).setName("test2"));
                add(new FileDTO().setId(3).setParentId(1).setName("test3"));
                add(new FileDTO().setId(4).setParentId(2).setName("test4"));
                add(new FileDTO().setId(5).setParentId(2).setName("test5"));
                add(new FileDTO().setId(6).setParentId(5).setName("test6"));
            }
        };
        List<FileDTO> resultList = new ArrayList<>();
        resultList.add(list.get(0));
        List<FileDTO> children = getChildren(list, 1, resultList);
        System.out.println(JSON.toJSONString(children));
    }


    public static List<FileDTO> getChildren(List<FileDTO> sourceList, Integer fileId, List<FileDTO> resultList) {
        List<FileDTO> childrenList = sourceList.stream()
                .filter(fileDTO -> fileDTO.getParentId() != null && fileDTO.getParentId().equals(fileId))
                .collect(Collectors.toList());
        if (childrenList.size() > 0) {
            resultList.addAll(childrenList);
            for (FileDTO fileDTO : childrenList) {
                getChildren(sourceList, fileDTO.getId(), resultList);
            }
        }
        return resultList;
    }
}


@Data
@Accessors(chain = true)
@ToString
class FileDTO {

    private Integer id;

    private Integer parentId;

    private String name;
}