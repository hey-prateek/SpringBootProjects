package Supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class code3_getUniqueUUID {

    public static void main(String[] args) {

        Supplier<UUID> getUUID = () -> UUID.randomUUID();
        System.out.print(getUUID.get());
    }

}
