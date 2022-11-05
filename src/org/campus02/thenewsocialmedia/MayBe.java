package org.campus02.thenewsocialmedia;

public class MayBe<T> {
    private T value;
    //private AccessRoles neededAccessRole;

    public MayBe(T value) {
        this.value = value;
        //this.neededAccessRole = AccessRoles.ExternalUser;
    }

    public void deliverValue (AccessRoles accessor) {
        switch (accessor){
            case Platform:
            case Self:
                System.out.println(this.value);
                break;
            case ExternalUser:
            case RegisteredCustomer:
            case BestFriend:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed");
        }
    }
}
