import java.util.ArrayList;
import java.util.List;

public class Holydayzer {
  List<Holyday> holydaysList = new ArrayList<>();

  String[] daysArray = {"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", 
  "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023"};

  String[] namesArray = {"Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Christi", 
"Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal"};

  public void createHolydayzer(){
    for(int i = 0; i < this.daysArray.length; i++){
      Holyday holyday = new Holyday(namesArray[i], daysArray[i]);
      this.holydaysList.add(holyday);
    }
  }

  public String findByDate(String date){
    String holidayName = "";
    for(int i = 0; i < this.holydaysList.size(); i++){
      Boolean isHoliday = this.holydaysList.get(i).date == date;

      if(isHoliday){
        return holidayName = this.holydaysList.get(i).name;
      }
    }

    if(holidayName != ""){
      return holidayName;
    }

    return "Nesse dia não tem feriado";
  }

  public void getAllHolydays(){
    for(int i = 0; i < holydaysList.size(); i++){
      String holydayDate = this.holydaysList.get(i).date;
      String holydayName = this.holydaysList.get(i).name;
      System.out.println(holydayDate + " - " + holydayName);
    }
  }
}
