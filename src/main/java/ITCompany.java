public class ITCompany {
    public static void main(String[] args) {


    Role qa = new Role(40000,
                       "Middle",
                       "Low",
                       "QA",
                       2,
                       false);

    Role programmer = new Role (200000,
            "Senior",
            "High softskills",
            "Programmer",
            5,
            true);


        System.out.println(qa.salary + "" + qa.experience);
        System.out.println(programmer.salary + " " + programmer.communication);


    }
}
