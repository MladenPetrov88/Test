package Task6;

public class Company {
    String companyName;
    String companyDepartment;
    String companySalary;

    public Company(String companyName, String companyDepartment, String companySalary) {
        this.companyName = companyName;
        this.companyDepartment = companyDepartment;
        this.companySalary = companySalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyDepartment() {
        return companyDepartment;
    }

    public String getCompanySalary() {
        return companySalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.companyName, this.companyDepartment, this.companySalary);
    }
}
