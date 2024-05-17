package Enums;

public enum Role {
    SECRETARY,
    SALESPERSON,
    MANAGER;

    public double calculateSalary(int month, int year, String hiringDate) {
        switch (this) {
            case SECRETARY:
                return 7000 + (1000 * (year - Integer.parseInt("20" + hiringDate.substring(6))));
            case SALESPERSON:
                return 12000 + (1800 * (year - Integer.parseInt("20" + hiringDate.substring(6))));
            case MANAGER:
                return 20000 + (3000 * (year - Integer.parseInt("20" + hiringDate.substring(6))));
            default:
                return 0;
        }
    }

    public double calculateBenefit(int month, int year, String hiringDate) {
        switch (this) {
            case SECRETARY:
                return 0.2 * calculateSalary(month, year, hiringDate);
            case SALESPERSON:
                return 0.3 * calculateSalary(month, year, hiringDate);
            case MANAGER:
                return 0;
            default:
                return 0;
        }
    }
}
