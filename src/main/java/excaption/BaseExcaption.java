package excaption;

public class BaseExcaption extends RuntimeException{
    BaseExcaption(){

    }


   public BaseExcaption(ErrorMessage errorMessage){

        super(errorMessage.prepareErrorMessage());

    }



}
