public class MainPersons {

    public static void main(String[] args) {
        DataScientist maria = new DataScientist(
                "María",
                "Doe",
                25,
                new String[]{"Python", "Java", "R","Scale"}
        );

        maria.analyzeData();

        Person mariaAsAPerson = maria;

        mariaAsAPerson.getLastName();

    }

}
