/**
 * @version 23.07.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-4
 */
class Java1Homework5 {
       public static void main(String[] args) {
           Worker[] worker = new Worker[5];
           worker[0] = new Worker("Ivanov Ivan Ivanovich", "Byhgalter", "ivanovivan@gmail.com", "89864531211", "35000", "41");
           worker[1] = new Worker("Petrov Petr Petrovich", "manager", "petrovich99@gmail.com", "89765357423", "23500", "37");
           worker[2] = new Worker("Pypkin Vasilii Ivanovich", "top manage", "pypkinvi@gmail.com", "89264537765", "37000", "44");
           worker[3] = new Worker("Michael Sergeevich Voevodin", "system admin", "ivanovivan@gmail.com", "89023070701", "30000", "28");
           worker[4] = new Worker("Chernyaew Viktor Sergeevich", "finance director", "ivanovivan@gmail.com", "89456785432", "55000", "49");

           for (Worker a : worker) if (a.getAge() > 40) a.getInformation();
    }
}

class Worker{
        String fullname, position, email, phone;
        int salary, age;


        Worker(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
}

        void getInformation(){
            System.out.println("fullname: " + fullname + "position: " + position + "email: " + email + "salary: " + salary + "age: " + age);
        }

        int getAge(){
            return age;
        }


}