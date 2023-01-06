package com.company;

public class Validator {
    //Bir nesnenin kontrol işişni yapar

    //Burada GENERIC METHOD yazacağız.

    public <T extends IEntity> Boolean isValidate(T entity){//IEntity implement eden herhangi bir nesne yazılabilir.

        //Burada entity nin geçerli olup olmadığı kontrol edilir.
        return true;
    }
}
