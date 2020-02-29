package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.*;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(100);
        if (box1.addThing(new Item("toothbrash", 100))) {
            System.out.println("agrego");
        }
                
    }
}
