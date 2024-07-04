
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

class Students implements Comparable<Students>{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }


    @Override
    public int compareTo(Students that) {
        if (this.age > that.age)
        return 1;
    else
        return -1;
    }

}

public class Comparing {
    public static void main(String[] args) {

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students i, Students j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        List<Students> nums = new ArrayList();
        nums.add(new Students(12,"navin"));
        nums.add(new Students(15,"voult"));
        nums.add(new Students(9,"apurva"));
        nums.add(new Students(18,"Sana"));

        Collections.sort(nums, com);

        for(Students s : nums)
        {
            System.out.println(s);
        }
        
    }
}
