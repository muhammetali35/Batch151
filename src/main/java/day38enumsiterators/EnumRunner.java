package day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {


        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);//Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);//FL

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state);//ALASKA

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);//Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);//AK




    }
}
