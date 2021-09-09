public class ITCompany {
    public static void main(String[] args) {
    Role qa = new Role(40000, "Middle", "Low", "QA", 2, false);
    Role programmer = new Role(200000, "Senior", "High softskills", "Programmer", 5, true);

    String textQA = String.format("Employee information. salary: %d, qualification: %s, communication: %s, position: %s , работает из офиса: %b .",
                qa.salary, qa.qualification, qa.communication, qa.position,qa.workfromoffce);
    String textProgrammer = String.format("Employee information. salary: %d, qualification: %s, communication: %s, position: %s , работает из офиса: %b .",
                programmer.salary, programmer.qualification, programmer.communication, programmer.position,programmer.workfromoffce);

        System.out.println(textQA);
        System.out.println(textProgrammer);
    }
}
