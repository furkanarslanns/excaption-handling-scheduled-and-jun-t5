package handler;

import excaption.BaseExcaption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@ControllerAdvice
public class GlobalExcaptionHandler {

@ExceptionHandler(value = Exception.class)
    public ResponseEntity<ApiError> handleBaseExcaption(BaseExcaption excaption, WebRequest request) {
    return ResponseEntity.badRequest().body(createApiError(excaption.getMessage(),request));
}
    public <E> ApiError<E> createApiError(E message,WebRequest request) {
        ApiError<E> apiError = new ApiError<>();
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());

        Excaption<E> excaption = new Excaption<>();
        excaption.setCreateTime(new Date());
        excaption.setHostName(getHostName());
        excaption.setPath(Integer.parseInt(request.getDescription(false)));
        excaption.setMessage(message);

        apiError.setExcaption(excaption);

        return apiError;
    }




private String getHostName() {
    try {
        return InetAddress.getLocalHost().getHostName();
    } catch (UnknownHostException e) {
        throw new RuntimeException(e);
    }

}




}
