import java.util.Arrays;

public interface Bank {
    public void assignLoans(int[] loans);
    public void averageLoan();
    public void maxLoan();
    public void minLoan();
}

class PersonalLoanDept implements Bank {
    private int[] loanAmounts;

    PersonalLoanDept(int clients) {
        loanAmounts = new int[clients];
    }

    @Override
    public void assignLoans(int[] loans) {
        int minLength = Math.min(loanAmounts.length, loans.length);
        System.arraycopy(loans, 0, loanAmounts, 0, minLength);
        if (loans.length != minLength) {
            System.out.println("Loans for clients processed");
        }
    }

    @Override
    public void averageLoan() {
        int sum = Arrays.stream(loanAmounts).sum();
        double average = (double) sum / loanAmounts.length;
        System.out.println("Average loan amount for clients is " + average);
    }

    @Override
    public void maxLoan() {
        int maxLoan = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amount amongst clients is " + maxLoan);
    }

    @Override
    public void minLoan() {
        int minLoan = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amount amongst clients is " + minLoan);
    }
}

class BusinessLoanDept implements Bank {
    private int[] loanAmounts;

    BusinessLoanDept(int businesses) {
        loanAmounts = new int[businesses];
    }
    @Override
    public void assignLoans(int[] loans) {
        int minLength = Math.min(loanAmounts.length, loans.length);
        System.arraycopy(loans, 0, loanAmounts, 0, minLength);
        if (loans.length != minLength) {
            System.out.println("Loans for businesses processed");
        }
    }

    @Override
    public void averageLoan() {
        double sum = Arrays.stream(loanAmounts).sum();
        double average = sum / loanAmounts.length;
        System.out.printf("Average loan amount for businesses is " + average);
    }

    @Override
    public void maxLoan() {
        int maxLoan = Arrays.stream(loanAmounts).max().orElse(0);
        System.out.println("Maximum loan amongst businesses is " + maxLoan);
    }

    @Override
    public void minLoan() {
        int minLoan = Arrays.stream(loanAmounts).min().orElse(0);
        System.out.println("Minimum loan amongst businesses is " + minLoan);
    }
}
