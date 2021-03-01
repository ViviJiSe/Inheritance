public class Programmer extends Person {

    protected String[] programmingLanguages;

    public Programmer(String name, String lastName, int age, final String[] programmingLanguages) {
        super(name, lastName, age);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void addProgrammingLanguages(String newProgrammingLanguage){
        String[] newProgrammingLanguageArray = new String[this.programmingLanguages.length+1];
        for (int index =0; index< this.programmingLanguages.length; ++index){
            newProgrammingLanguageArray[index] = this.programmingLanguages[index];
        }
        newProgrammingLanguageArray[newProgrammingLanguageArray.length-1] =newProgrammingLanguage;
        this.programmingLanguages = newProgrammingLanguageArray;
    }
}
