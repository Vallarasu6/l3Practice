package lift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogicLayer {
    List<Lift> list = new ArrayList<>();

    public void createList() {
        for (int i = 0; i < 5; i++) {
            Lift l1 = new Lift();
            l1.setFloorName("L" + (i + 1));
            list.add(l1);
        }
    }


    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }

    public void getValue(int start, int end) {
        //List<Lift> list1 = new ArrayList<>();
        int min = 99;
        Lift cnfmLift = null;
        if(start < end) {
            Comparator<Lift> com = new Comparator<Lift>() {
                @Override
                public int compare(Lift t, Lift t1) {
                    if (t.getFloor() > t1.getFloor()) {
                        return 1;
                    } else if (t.getFloor() < t1.getFloor()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            };
            Collections.sort(list, com);

            for (Lift i : list) {
                int k = Math.abs((start) - i.getFloor());
                if (min > k) {
                    min = k;
                    cnfmLift = i;

                    //list1.add(i);

                }
            }
            cnfmLift.setFloor(end);
            System.out.println(cnfmLift.getFloorName()+" is booked");
            display();

        }
        else {
            Comparator<Lift> com = new Comparator<Lift>() {
                @Override
                public int compare(Lift t, Lift t1) {
                    if (t.getFloor() > t1.getFloor()) {
                        return 1;
                    } else if (t.getFloor() < t1.getFloor()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            };
            Collections.sort(list, com);

            for (Lift i : list) {
                int k = start - i.getFloor();
                if (min > k) {
                    min = k;
                    cnfmLift = i;


                }
            }
            cnfmLift.setFloor(end);
            System.out.println(cnfmLift.getFloorName()+" is booked");
            display();
        }
    }
}

