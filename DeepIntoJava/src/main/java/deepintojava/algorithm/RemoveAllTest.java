package deepintojava.algorithm;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllTest {

    public static void main(String[] args) {
        List<NewFileDTO> list = new ArrayList<NewFileDTO>(
        ) {
            {
                add(new NewFileDTO().setId(1).setParentId(null).setName("test1"));
                add(new NewFileDTO().setId(2).setParentId(1).setName("test2"));
                add(new NewFileDTO().setId(3).setParentId(1).setName("test3"));
                add(new NewFileDTO().setId(4).setParentId(2).setName("test4"));
                add(new NewFileDTO().setId(5).setParentId(2).setName("test5"));
                add(new NewFileDTO().setId(6).setParentId(5).setName("test6"));
            }
        };
        List<NewFileDTO> subList = new ArrayList<NewFileDTO>(
        ) {
            {
                add(new NewFileDTO().setId(1).setParentId(null).setName("test1"));
                add(new NewFileDTO().setId(2).setParentId(1).setName("test2"));
                add(new NewFileDTO().setId(3).setParentId(1).setName("test3"));
                add(new NewFileDTO().setId(4).setParentId(2).setName("test4"));
                add(new NewFileDTO().setId(5).setParentId(2).setName("test5"));
                add(new NewFileDTO().setId(6).setParentId(5).setName("test6"));
            }
        };
        boolean b = list.removeAll(subList);
        System.out.println(list);
//        List<NewFileDTO> resultList = new ArrayList<>();
//        resultList.add(list.get(0));
//        List<NewFileDTO> children = getChildren(list, 1, resultList);
//        System.out.println(JSON.toJSONString(children));
    }


    public static List<NewFileDTO> getChildren(List<NewFileDTO> sourceList, Integer fileId, List<NewFileDTO> resultList) {
        List<NewFileDTO> childrenList = sourceList.stream()
                .filter(NewFileDTO -> NewFileDTO.getParentId() != null && NewFileDTO.getParentId().equals(fileId))
                .collect(Collectors.toList());
        if (childrenList.size() > 0) {
            resultList.addAll(childrenList);
            for (NewFileDTO NewFileDTO : childrenList) {
                getChildren(sourceList, NewFileDTO.getId(), resultList);
            }
        }
        return resultList;
    }
}


@Data
@Accessors(chain = true)
@ToString
class NewFileDTO {

    private Integer id;

    private Integer parentId;

    private String name;
}