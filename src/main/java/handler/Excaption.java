package handler;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Excaption<E> {
    private String hostName;
    private int path;
    private Date createTime;
    private E message;


}
