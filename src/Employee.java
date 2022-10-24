public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return salary > 1000 ? (salary * 3 / 100) : 0;
    }

    public double bonus() {
        return workHours > 40 ? (workHours - 40) * 30  : 0;
    }

    public double raiseSalary() {
        double salaryRaise = 0;
        int workedYears = 2021 - hireYear;
        if (workedYears < 10) {
            salaryRaise = salary * 0.05;

        } else if (workedYears < 20)
            salaryRaise = salary * 0.1;
        else
            salaryRaise = salary * 0.15;
        return salaryRaise;
    }

    @Override
    public String toString() {
        System.out.println("ADI-SOYADI  :" + name);
        System.out.println("MAAŞI   :" + salary);
        System.out.println("ÇALIŞMA SAATİ   :" + workHours);
        System.out.println("İŞE BAŞLANGIÇ YILI  :" + hireYear);
        System.out.println("VERGİ   :" + tax());
        System.out.println("BONUS   :" + bonus());
        System.out.println("MAAŞ ARTIŞI     :" + raiseSalary());
        System.out.println("VERGİ VE BONUSLARLA BİRLİKTE MAAŞ   :" + (salary + bonus() - tax()));
        System.out.println("YENİ NET MAAŞ   " + (raiseSalary() + salary + bonus() - tax()));
        return "ADI-SOYADI  :" + name + "\n" +
                "MAAŞI   :" + salary + "\n" +
                "ÇALIŞMA SAATİ   :" + workHours + "\n" +
                "İŞE BAŞLANGIÇ YILI  :" + hireYear + "\n" +
                "VERGİ   :" + tax() + "\n" +
                "BONUS   :" + bonus() + "\n" +
                "MAAŞ ARTIŞI     :" + raiseSalary() + "\n" +
                "VERGİ VE BONUSLARLA BİRLİKTE MAAŞ  " + (salary + bonus() - tax()) + "\n" +
                "YENİ NET MAAŞ  :" + (raiseSalary() + salary + bonus() - tax()) + "\n";

    }
}
