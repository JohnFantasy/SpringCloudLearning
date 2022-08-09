package deepintojava.clawler.volvo;

import lombok.Data;

@Data
public class VolvoResponse<T> {
    private Integer code;
    private Integer codeType;
    private String msg;
    private Boolean success;
    private T data;
}
