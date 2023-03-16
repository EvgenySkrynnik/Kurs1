package Kurs1;
public class Main {
        static Employee[] employees = new Employee[10];

        public static void main(String[] args) {
                employees[0] = new Employee("Satanov", "David", "Chertovich", 3, 12_000);
                employees[1] = new Employee("Chertanov", "Igor", "Golubev", 1, 14_000);
                employees[2] = new Employee("Raev", "Angel", "Lovomichev", 2, 8_000);
                employees[3] = new Employee("Utin", "Adolf", "Azizovich", 4, 15_000);
                employees[4] = new Employee("Beautiful", "Elena", "Viktorovna", 1, 13_000);
                employees[5] = new Employee("Undisputed", "Runner", "Erikovich", 2, 9_000);
                employees[6] = new Employee("Cristiano", "Junior", "Ronaldo", 5, 18_000);
                employees[7] = new Employee("Chorvatov", "Choban", "Matteovich", 4, 11_000);
                employees[8] = new Employee("Chyk", "Cheryk", "Grigorich", 1, 13_000);
                employees[9] = new Employee("Stakanovich", "Valentina", "Mateovna", 2, 9_000);

                printEmployees();
                System.out.println("============================");
                System.out.println("сумма зарплат: " + sum());
                System.out.println(findMinSalary());
                System.out.println("============================");
                System.out.println(findMaxSalary());
                System.out.println("============================");
                System.out.println("средняя зп: " + calculateAverageSalary());
                System.out.println("============================");
                printFIO();
                System.out.println("============================");
        }

        static void printEmployees() {
                for (Employee employee : employees) {
                        System.out.println(employee);

                }
        }

       static int sum() {
                int sum = 0;
                for (Employee employee : employees) {
                        sum += employee.getSalary();
                }
                return sum;
        }


        static Employee findMinSalary() {
                Employee min = null;
                for (Employee employee : employees) {
                        if (min == null || employee.getSalary() < min.getSalary()) {
                                min = employee;
                        }
                }
                return min;
        }

       static Employee findMaxSalary() {
                Employee max = null;
                for (Employee employee : employees) {
                        if (max == null || employee.getSalary() > max.getSalary()) {
                                max = employee;
                        }
                }
                return max;
        }
        static double calculateAverageSalary() {
             return (double) sum () / employees.length;

        }
        static void printFIO() {
        for (Employee employee : employees) {
                System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }}}