public class CompSciLevel{
    public int compSciLevel(int grade, int level) {
        if(grade == 9 && level == 1){
            return 12;
        }else if(grade == 9 && level == 2){
            return 0;
        }else if(grade == 10 && level == 1){
            return 35;
        }else if(grade == 10 && level == 2){
            return 1;
        }else if(grade == 11 && level == 1){
            return 45;
        }else if(grade == 11 && level ==2){
            return 17;
        }

        return -1;
    }

}
