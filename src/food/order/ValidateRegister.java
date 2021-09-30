package food.order;

public class ValidateRegister {
    public int validatePassword(String password , String confirmPassword){
        int passwordLength=0;
        int passwordCheck=0;
        int returnValue=0;
        if(!password.equals(confirmPassword)){
            passwordCheck++;
        }
        if(password.length()>=8 && password.length()<=16){

        }else{
            passwordLength++;
        }
        if(passwordCheck==1){
            returnValue=1;
        }
        if(passwordLength==1){
            returnValue=2;
        }


        return returnValue;
    }
}
