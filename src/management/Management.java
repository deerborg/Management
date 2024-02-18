/**
 * @author Furkan Aydemir, deerborg
 */

package management;
import java.util.Scanner;
import java.util.Random;
public class Management {

// Updates for the project will continue.
    
    // Manager panel value
    private String workerInfoToUpdate;
    private String getCv;
    private String workerToUpdate;
    private String departmentToUpdate;
    private double hoursSalaryToUpdate;
    private int permToUpdate;
    private String bracket;

    // Department value
    private String department;
    private int departmentPerm;
    private int departmentMaxWorker;
    private double hoursSalary;
    private double constHour;
    private double bonusHourSalary;

    // Worker value
    private String workerFullName;
    private int age;
    private String createCv;
    private int IdNo;
    private String workerDepartment;
    private int workerPerm;

    // Worker panel value
    private int checkIdNo;
    private double totalAddTime;
    private double totalSalary;
    private String editCv;

    int[] birthDay = new int[3];

    //Methods
    public void createDepartmentDetail() {
        int listOnly = 1;
        Scanner anyValue = new Scanner(System.in);
        System.out.println("How many departments do you want to open?");
        bracket();
        int departmentsValue = anyValue.nextInt();
        anyValue.nextLine();
        String[] departmentStrings = new String[departmentsValue];
        System.out.println("Enter the names of the departments you want to create: ");
        for (int assignValue = 0; assignValue < departmentStrings.length; assignValue++) {
            departmentStrings[assignValue] = anyValue.nextLine();
        }
        bracket();
        System.out.println("These are the departments created: ");
        for (String value : departmentStrings) {
            System.out.println(listOnly + " - " + value);
            listOnly++;
        }
        bracket();
        System.out.println("Department employee salary editing menu");
        bracket();
        System.out.println("Select the department where you want to edit the bonus fee, hourly rate and minimum hours worked. For example 2.");
        while (true) {
            int selector = anyValue.nextInt();
            if (selector > departmentStrings.length) {
                System.out.println("Maximum number of departments where transactions can be made " + (departmentStrings.length));
                continue;
            }
            System.out.println("Department to be organized: " + departmentStrings[selector - 1]);
            bracket();
            System.out.println("How many hours will work at least per week department for " + departmentStrings[selector - 1]);
            double constHourSalaryFirstSelector = anyValue.nextDouble();
            System.out.println("How much is the hourly bonus salary for " + departmentStrings[selector - 1]);
            double bonusHourSalaryFirstSelector = anyValue.nextDouble();
            System.out.println("What is the standard hourly salary for " + departmentStrings[selector - 1]);
            double hoursSalaryFirstSelector = anyValue.nextDouble();
            bracket();
            System.out.println("Department accounting " + departmentStrings[selector - 1]);
            System.out.println("Minimum working hours per week: " + constHourSalaryFirstSelector + " $");
            System.out.println("Bonus per hour: " + bonusHourSalaryFirstSelector + " $");
            System.out.println("Fixed hourly rate: " + hoursSalaryFirstSelector + " $");
            System.out.println("Weekly total (minimum): " + (5 * constHourSalaryFirstSelector) * hoursSalaryFirstSelector + " $");
            bracket();
            break;
            // The same parameters will be used for other options.
        }

    }

    public void createNewEmploye() {
        Scanner anyValue = new Scanner(System.in);
        System.out.println("Enter employee name and surname information:");
        this.workerFullName = anyValue.nextLine();
        bracket();
        System.out.println("Enter birthday information (DD MM YY):");
        while (true) {
            birthDay[0] = anyValue.nextInt();
            birthDay[1] = anyValue.nextInt();
            birthDay[2] = anyValue.nextInt();
            // February checks
            if (birthDay[1] == 2) {
                if (birthDay[2] % 4 == 0) {
                    if (birthDay[0] > 29) {
                        System.out.println("February can have a maximum of 29 days. Try again");
                        continue;
                    }
                    break;
                }
                if (birthDay[2] % 4 != 0) {
                    if (birthDay[0] > 28) {
                        System.out.println("February can have a maximum of 28 days. Try again");
                        continue;
                    }
                    break;
                }
            }
            // Months checks
            if (birthDay[1] % 2 == 0) {
                if (birthDay[0] > 30) {
                    System.out.println("Can have a maximum of 30 days, Try again.");
                    continue;
                }
                break;
            }
            if (birthDay[0] > 31 || birthDay[0] < 1) {
                System.out.println("Can have a maximum of 31, minimum 1. Try again.");
                continue;
            }
            if (birthDay[1] > 12 || birthDay[1] < 1) {
                System.out.println("Can have a maximum of 12, minimum 1. Try again.");
                continue;
            }
            if (birthDay[2] > 2024 || birthDay[2] < 1959) {
                System.out.println("Can have a maximum 2024, minimum 1959. Try again.");
                continue;
            }
            bracket();
            this.age = 2024 - birthDay[2];
            String birthDayString = (birthDay[0] + "/" + birthDay[1] + "/" + birthDay[2]);
            System.out.println(workerFullName + " Date of birth: " + birthDayString + '\n' + workerFullName + " Age: " + age);
            break;
        }
        bracket();
        Random IdNRandom = new Random();
        this.IdNo = IdNRandom.nextInt(1000);
        System.out.println(workerFullName + " Id No: " + IdNo);
        bracket();
    }

    public void bracket() {
        System.out.println("----------------------------------------------------");
    }
// End methods
    public String getWorkerInfoToUpdate() {
        return workerInfoToUpdate;
    }

    public void setWorkerInfoToUpdate(String workerInfoToUpdate) {
        this.workerInfoToUpdate = workerInfoToUpdate;
    }

    public String getGetCv() {
        return getCv;
    }

    public void setGetCv(String getCv) {
        this.getCv = getCv;
    }

    public String getWorkerToUpdate() {
        return workerToUpdate;
    }

    public void setWorkerToUpdate(String workerToUpdate) {
        this.workerToUpdate = workerToUpdate;
    }

    public String getDepartmentToUpdate() {
        return departmentToUpdate;
    }

    public void setDepartmentToUpdate(String departmentToUpdate) {
        this.departmentToUpdate = departmentToUpdate;
    }

    public double getHoursSalaryToUpdate() {
        return hoursSalaryToUpdate;
    }

    public void setHoursSalaryToUpdate(double hoursSalaryToUpdate) {
        this.hoursSalaryToUpdate = hoursSalaryToUpdate;
    }

    public int getPermToUpdate() {
        return permToUpdate;
    }

    public void setPermToUpdate(int permToUpdate) {
        this.permToUpdate = permToUpdate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDepartmentPerm() {
        return departmentPerm;
    }

    public void setDepartmentPerm(int departmentPerm) {
        this.departmentPerm = departmentPerm;
    }

    public int getDepartmentMaxWorker() {
        return departmentMaxWorker;
    }

    public void setDepartmentMaxWorker(int departmentMaxWorker) {
        this.departmentMaxWorker = departmentMaxWorker;
    }

    public double getHoursSalary() {
        return hoursSalary;
    }

    public void setHoursSalary(double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }

    public double getConstHour() {
        return constHour;
    }

    public void setConstHour(double constHour) {
        this.constHour = constHour;
    }

    public double getBonusHourSalary() {
        return bonusHourSalary;
    }

    public void setBonusHourSalary(double bonusHourSalary) {
        this.bonusHourSalary = bonusHourSalary;
    }

    public String getWorkerFullName() {
        return workerFullName;
    }

    public void setWorkerFullName(String workerFullName) {
        this.workerFullName = workerFullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreateCv() {
        return createCv;
    }

    public void setCreateCv(String createCv) {
        this.createCv = createCv;
    }

    public int getIdNo() {
        return IdNo;
    }

    public void setIdNo(int IdNo) {
        this.IdNo = IdNo;
    }

    public String getWorkerDepartment() {
        return workerDepartment;
    }

    public void setWorkerDepartment(String workerDepartment) {
        this.workerDepartment = workerDepartment;
    }

    public int getWorkerPerm() {
        return workerPerm;
    }

    public void setWorkerPerm(int workerPerm) {
        this.workerPerm = workerPerm;
    }

    public int getCheckIdNo() {
        return checkIdNo;
    }

    public void setCheckIdNo(int checkIdNo) {
        this.checkIdNo = checkIdNo;
    }

    public double getTotalAddTime() {
        return totalAddTime;
    }

    public void setTotalAddTime(double totalAddTime) {
        this.totalAddTime = totalAddTime;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getEditCv() {
        return editCv;
    }

    public void setEditCv(String editCv) {
        this.editCv = editCv;
    }

}
