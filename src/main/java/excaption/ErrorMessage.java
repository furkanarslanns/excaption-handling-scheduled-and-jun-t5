package excaption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
private MessageTYPE messageType;

private String ofStatic;

public String prepareErrorMessage() {
    StringBuilder builder=new StringBuilder();
    builder.append(messageType.getMessage());
    if (ofStatic != null) {
        builder.append(":"+ofStatic);
    }
    return builder.toString();
}




}
