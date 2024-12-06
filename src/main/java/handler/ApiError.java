package handler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError<E> {
    private  int status;
    private Excaption<E> excaption;
}
